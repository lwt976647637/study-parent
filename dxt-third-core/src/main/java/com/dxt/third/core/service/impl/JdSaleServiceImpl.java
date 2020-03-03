package com.dxt.third.core.service.impl;

import com.alibaba.fastjson.JSON;
import com.dxt.third.core.dao.JdSaleMapper;
import com.dxt.third.core.dao.OrderMapper;
import com.dxt.third.core.dao.ProductMapper;
import com.dxt.third.core.entity.JdSale;
import com.dxt.third.core.entity.JdSaleExample;
import com.dxt.third.core.entity.Order;
import com.dxt.third.core.entity.Product;
import com.dxt.third.core.service.JdSaleService;
import com.dxt.third.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ProjectName: dxt-third-parent
 * @Package: com.dxt.third.core.service.impl
 * @ClassName: JdSaleService
 * @Description:
 * @Author: 李维涛
 * @CreateDate: 2020/2/28 17:29
 */
@Service
public class JdSaleServiceImpl implements JdSaleService {

    private static final Logger logger = LoggerFactory.getLogger(JdSaleServiceImpl.class);


    @Autowired
    private JdSaleMapper jdSaleMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 获取京东履约销售商品列表
     *
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveJdSale(JdSale jdSale) throws ParseException {
        Order order;
        JdSaleExample example;
        Product product;
        List<Product> products = new ArrayList<>();
        Double totalAmount = 0.0;
        //查询当前订单是否存在
        Order orderInfo = orderMapper.findOrderByNo(String.valueOf(jdSale.getSaleid()));
        if (null == orderInfo) {
            example = new JdSaleExample();
            example.createCriteria().andSaleidEqualTo(jdSale.getSaleid());
            //获取订单的详细信息
            List<JdSale> jdSaleDetails = jdSaleMapper.selectByExample(example);
            JdSale jdSaleDetail = jdSaleDetails.get(0);
            order = new Order();
            order.setId(UUID.randomUUID().toString());
            order.setAccountId(String.valueOf(jdSale.getAccountid()));
            order.setCreateTime(jdSaleDetail.getSaledate());
            order.setUpdateTime(jdSaleDetail.getSaledate());
            order.setStoreId(String.valueOf(jdSaleDetail.getStore()));
            order.setMobile(jdSaleDetail.getCustom().replaceAll("#",""));
            order.setPayType(jdSaleDetail.getPaytype());
            order.setShopAssistant(jdSaleDetail.getUser1());
            order.setShopUser(jdSaleDetail.getUser());
            order.setMainMemo(jdSaleDetail.getMainmemo());

            for (JdSale saleDetail : jdSaleDetails) {
                product = new Product();
                product.setId(UUID.randomUUID().toString());
                product.setOrderNo(String.valueOf(saleDetail.getSaleid()));
                product.setCreateTime(new Date());
                product.setUpdateTime(new Date());
                product.setProductId(saleDetail.getProductid());
                product.setProductName(saleDetail.getProductname());
                double productPrice = saleDetail.getProductprice().doubleValue();
                int productNumber = saleDetail.getProductnumber().intValue();
                product.setProductPrice(String.valueOf(productPrice));

                String proudctSerial = productMapper.findProudctSerial(String.valueOf(saleDetail.getSaleid()), saleDetail.getProductid(), saleDetail.getInsertserial());
                logger.info("查询商品串号信息:" + proudctSerial);
                product.setProductSerial(StringUtils.isNotEmpty(proudctSerial) ? proudctSerial : "");
                product.setRemark(saleDetail.getMainmemo());
                product.setProductNumber(productNumber);
                //计算总金额
                double totalAmountDouble = productNumber * productPrice;
                totalAmount = totalAmount + totalAmountDouble;
                products.add(product);
                productMapper.insert(product);

            }

            order.setTotalAmount(String.valueOf(totalAmount));
            order.setDelFlag("0");
            order.setProductList(products);
            order.setOrderNo(String.valueOf(jdSaleDetail.getSaleid()));
            //保存订单信息
            logger.info("保存订单信息报文:" + JSON.toJSONString(order));
            orderMapper.insert(order);
            products.clear();

        }
        logger.info("同步京东履约销售列表信息～结束");

    }



    @Override
    public List<JdSale> selectJdSaleList(Date beginDate, Date endDate) {
        return jdSaleMapper.selectJdSaleList(beginDate,endDate);
    }

    @Override
    /**
     * 京东履约订单生成
     *
     * 1、生成销退订单
     *
     * 2、生成调拨出库单
     *
     * 3、生成调拨入口单
     *
     * 4、生成销售订单
     */

    public void orderProcess(Order order) {

        //1.生成销退订单

        //

    }
}

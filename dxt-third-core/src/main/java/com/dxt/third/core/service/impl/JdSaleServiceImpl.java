package com.dxt.third.core.service.impl;

import com.alibaba.fastjson.JSON;
import com.dxt.third.core.client.ESaleOrderClient;
import com.dxt.third.core.dao.JdSaleMapper;
import com.dxt.third.core.dao.JdStoreMapper;
import com.dxt.third.core.dao.OrderMapper;
import com.dxt.third.core.dao.ProductMapper;
import com.dxt.third.core.entity.*;
import com.dxt.third.core.esale.SendOrderResponse;
import com.dxt.third.core.esale.SendStsinRequest;
import com.dxt.third.core.esale.SendStsinResponse;
import com.dxt.third.core.esale.SendStsoutResponse;
import com.dxt.third.core.service.JdSaleService;
import com.dxt.third.core.utils.ESaleConstants;
import com.dxt.third.core.utils.StringUtils;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.*;

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

    @Autowired
    private JdStoreMapper jdStoreMapper;

    @Autowired
    private ESaleOrderClient eSaleOrderClient;

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
            String mobile = jdSaleDetail.getCustom().replaceAll("＃", "").trim();
            order.setMobile(mobile);
            order.setPayType(jdSaleDetail.getPaytype());
            order.setShopAssistant(jdSaleDetail.getUser1());
            order.setShopUser(jdSaleDetail.getUser());
            order.setMainMemo(jdSaleDetail.getMainmemo());
            order.setOrgId(String.valueOf(jdSaleDetail.getOrgid()));

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
                String proudctSerial = productMapper.findProudctSerial(String.valueOf(saleDetail.getSaleid()), saleDetail.getInsertserial());
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

    }


    @Override
    public List<JdSale> selectJdSaleList(Date beginDate, Date endDate) {
        return jdSaleMapper.selectJdSaleList(beginDate, endDate);
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
    public void orderProcess(String orderNo) {
        try {
            SendStsinRequest sendStsinRequest;
            SendStsinResponse sendStsinResponse;
            Map<String, Object> map = new HashMap<>(10);
            //获取订单详情
            Order order = orderMapper.findOrderByNo(orderNo);
            if (order == null) {
                logger.info("当前订单不存在{}", orderNo);
                return;
            }

            List<Product> products = productMapper.findProductList(order.getOrderNo());
            if (products == null) {
                logger.info("商品列表不存在");
                return;
            }
            order.setProductList(products);
            order.setShopAssistant(ESaleConstants.ESALE_DXYP_USER_INFO);
            //获取当前门店信息
            JdStoreExample jdStoreExample = new JdStoreExample();
            jdStoreExample.createCriteria().andGtinvidEqualTo(order.getOrgId());
            List<JdStore> jdStores = jdStoreMapper.selectByExample(jdStoreExample);
            if (jdStores.isEmpty()) {
                return;
            }
            JdStore jdStore = jdStores.get(0);
            //1.生成销退订单
            eSaleOrderClient.pinBackOrder(order, jdStore);
            if (StringUtils.isEmpty(order.getStsoutSaleId())) {
                //2、生成调拨出库单
                eSaleOrderClient.createStsoutOrder(order, map, jdStore);
            }
            //3、生成调拨入库单
            //调拨出库单已形成,开始形成调拨入库单
            createStsinOrder(map, order, jdStore);
            //4、生成销售订单
            if (StringUtils.isEmpty(order.getSaleId())) {
                eSaleOrderClient.sendESaleOrder(order, map, jdStore);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<String> selectOrderByStatus() {
        return orderMapper.findOrderListByStatus();
    }

    @Override
    /**
     * 生成调拨入库单
     */
    public void orderStsinProcess(String orderNo) {
        Map<String, Object> map = new HashMap<>(10);

        //获取订单详情
        Order order = orderMapper.findOrderByNo(orderNo);
        List<Product> products = productMapper.findProductList(order.getOrderNo());
        order.setProductList(products);
        order.setShopAssistant(ESaleConstants.ESALE_DXYP_USER_INFO);
        //获取当前门店信息
        JdStoreExample jdStoreExample = new JdStoreExample();
        jdStoreExample.createCriteria().andGtinvidEqualTo(order.getOrgId());
        List<JdStore> jdStores = jdStoreMapper.selectByExample(jdStoreExample);
        if (jdStores.isEmpty()) {
            return;
        }
        JdStore jdStore = jdStores.get(0);
        createStsinOrder(map, order, jdStore);
    }

    @Override
    /**
     * 生成调拨出库单
     */
    public void orderStsoutProcess(String orderNo) {
        Map<String, Object> map = new HashMap<>(10);
        //获取订单详情
        Order order = orderMapper.findOrderByNo(orderNo);
        List<Product> products = productMapper.findProductList(order.getOrderNo());
        if (products == null) {
            logger.info("商品列表不存在");
            return;
        }

        order.setProductList(products);
        order.setShopAssistant(ESaleConstants.ESALE_DXYP_USER_INFO);
        //获取当前门店信息
        JdStoreExample jdStoreExample = new JdStoreExample();
        jdStoreExample.createCriteria().andGtinvidEqualTo(order.getOrgId());
        List<JdStore> jdStores = jdStoreMapper.selectByExample(jdStoreExample);
        if (jdStores.isEmpty()) {
            return;
        }
        JdStore jdStore = jdStores.get(0);
        if (StringUtils.isEmpty(order.getStsoutSaleId()) || order.getStsoutSaleId().equals("0")) {
            //2、生成调拨出库单
            eSaleOrderClient.createStsoutOrder(order, map, jdStore);
        }
    }

    @Override
    public void orderESaleProcess(String orderNo) throws Exception {
        Map<String, Object> map = new HashMap<>(10);
        //获取订单详情
        Order order = orderMapper.findOrderByNo(orderNo);
        List<Product> products = productMapper.findProductList(order.getOrderNo());
        if (products == null) {
            logger.info("商品列表不存在");
            return;
        }

        order.setProductList(products);
        order.setShopAssistant(ESaleConstants.ESALE_DXYP_USER_INFO);
        //获取当前门店信息
        JdStoreExample jdStoreExample = new JdStoreExample();
        jdStoreExample.createCriteria().andGtinvidEqualTo(order.getOrgId());
        List<JdStore> jdStores = jdStoreMapper.selectByExample(jdStoreExample);
        if (jdStores.isEmpty()) {
            return;
        }
        JdStore jdStore = jdStores.get(0);

        if (StringUtils.isEmpty(order.getSaleId()) || order.getSaleId().equals("0")) {
            eSaleOrderClient.sendESaleOrder(order, map, jdStore);
        }
    }

    @Override
    /**
     * 更新商品详细信息
     */
    public void updateProduct(String orderNo) {
        JdSaleExample example = new JdSaleExample();
        example.createCriteria().andSaleidEqualTo(Long.valueOf(orderNo));
        //获取订单的详细信息
        List<JdSale> jdSaleDetails = jdSaleMapper.selectByExample(example);
        for (JdSale jdSaleDetail : jdSaleDetails) {
            Product product = productMapper.findProductById(orderNo, jdSaleDetail.getProductid());
            //获取串号
            String proudctSerial = productMapper.findProudctSerial(String.valueOf(jdSaleDetail.getSaleid()), jdSaleDetail.getInsertserial());
            if(StringUtils.isEmpty(product.getProductSerial()) && StringUtils.isNotEmpty(proudctSerial)){
                //更新商品串号信息
                product.setProductSerial(proudctSerial);
                productMapper.updateProductSerial(product);

            }

        }

    }

    private void createStsinOrder(Map<String, Object> map, Order order, JdStore jdStore) {
        SendStsinRequest sendStsinRequest;
        SendStsinResponse sendStsinResponse;
        boolean flag = (StringUtils.isEmpty(order.getStsinStatus()) || order.getStsinStatus().equals("0"))
                && ("1".equals(order.getStsoutStatus())
                || "2".equals(order.getStsoutStatus()))
                && StringUtils.isNotEmpty(order.getStsoutSaleId());
        if (flag) {
            sendStsinRequest = new SendStsinRequest();
            sendStsinRequest.setStoretostoreid(order.getStsoutSaleId().trim());
            sendStsinRequest.setStstype(0);
            sendStsinRequest.setUsername(ESaleConstants.ESALE_DXYP_USER_INFO);
            //调拨入库单账套以对方门店账套为主
            sendStsinRequest.setAccountid(Integer.valueOf(jdStore.getGtaccountid().trim()));
            sendStsinRequest.setStsid(0);
            sendStsinResponse = eSaleOrderClient.sendESaletSinInfo(sendStsinRequest, map, jdStore.getGtdepotid().trim());
            if (null != sendStsinResponse) {
                order.setStsinStatus(String.valueOf(sendStsinResponse.getResult()));
                order.setStsinSaleId(sendStsinResponse.getStsid());
                order.setStsinRemark(sendStsinResponse.getDesc());
                order.setUpdateTime(new Date());
                //将更新调拨入库单状态
                orderMapper.updateStatusByOrderId(order);
            }
        }
    }
}

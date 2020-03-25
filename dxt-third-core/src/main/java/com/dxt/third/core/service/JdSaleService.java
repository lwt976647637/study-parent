package com.dxt.third.core.service;

import com.dxt.third.core.entity.JdSale;
import com.dxt.third.core.entity.Order;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: dxt-third-parent
 * @Package: com.dxt.third.core.service
 * @ClassName: JdSaleService
 * @Description:
 * @Author: 李维涛
 * @CreateDate: 2020/2/28 17:28
 */
public interface JdSaleService {

    void saveJdSale(JdSale jdSale) throws ParseException;

    /**
     * 获取京东履约销售单列表
     * @param beginDate
     * @param endDate
     * @return
     */
    List<JdSale> selectJdSaleList(Date beginDate, Date endDate);

    /**
     * 京东履约订单处理
     */
    void orderProcess(String orderNo);

    /**
     * 同步京东履约订单数据进行单据生成
     * @return
     */
    List<String> selectOrderByStatus();

    /**
     * 生成调拨入库单
     * @param orderNo
     */
    void orderStsinProcess(String orderNo);

    /**
     * 生成调拨出库单
     * @param orderNo
     */
    void orderStsoutProcess(String orderNo);

    /**
     * 生成销售订单
     * @param orderNo
     */
    void orderESaleProcess(String orderNo) throws Exception;

    /**
     * 更新商品详细信息
     * @param orderNo
     */
    void updateProduct(String orderNo);
}

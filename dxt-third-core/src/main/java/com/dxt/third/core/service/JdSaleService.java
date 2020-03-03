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
}

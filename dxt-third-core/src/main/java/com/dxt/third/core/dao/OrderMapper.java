package com.dxt.third.core.dao;

import com.dxt.third.core.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insert(Order order);

    Order findOrderByNo(String orderNo);

    /**
     * 更新订单的调拨订单数据
     * @param order
     */
    void updateStatusByOrderId(Order order);

    /**
     * 获取销售单未成功生成的订单数据
     * @return
     */
    List<String> findOrderListByStatus();
}

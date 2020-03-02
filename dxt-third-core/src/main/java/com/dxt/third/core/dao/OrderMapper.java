package com.dxt.third.core.dao;

import com.dxt.third.core.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void insert(Order order);

    Order findOrderByNo(String orderNo);
}

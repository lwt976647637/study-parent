package com.dxt.third.core.dao;

import com.dxt.third.core.entity.JdSale;
import com.dxt.third.core.entity.JdSaleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface JdSaleMapper {
    int countByExample(JdSaleExample example);

    int deleteByExample(JdSaleExample example);

    int insert(JdSale record);

    int insertSelective(JdSale record);

    List<JdSale> selectByExample(JdSaleExample example);

    int updateByExampleSelective(@Param("record") JdSale record, @Param("example") JdSaleExample example);

    int updateByExample(@Param("record") JdSale record, @Param("example") JdSaleExample example);

    /**
     * 根据开始时间和结束时间同步京东履约产品订单
     * @param beginDate
     * @param endDate
     * @return
     */
    List<JdSale> selectJdSaleList(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

}
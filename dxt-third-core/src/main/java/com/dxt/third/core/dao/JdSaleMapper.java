package com.dxt.third.core.dao;

import com.dxt.third.core.entity.JdSale;
import com.dxt.third.core.entity.JdSaleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
}
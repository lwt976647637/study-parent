package com.dxt.third.core.dao;

import com.dxt.third.core.entity.PinBackOrder;
import com.dxt.third.core.entity.PinBackOrderExample;
import com.dxt.third.core.entity.PinBackOrderKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PinBackOrderMapper {
    int countByExample(PinBackOrderExample example);

    int deleteByExample(PinBackOrderExample example);

    int deleteByPrimaryKey(PinBackOrderKey key);

    int insert(PinBackOrder record);

    int insertSelective(PinBackOrder record);

    List<PinBackOrder> selectByExample(PinBackOrderExample example);

    PinBackOrder selectByPrimaryKey(PinBackOrderKey key);

    int updateByExampleSelective(@Param("record") PinBackOrder record, @Param("example") PinBackOrderExample example);

    int updateByExample(@Param("record") PinBackOrder record, @Param("example") PinBackOrderExample example);

    int updateByPrimaryKeySelective(PinBackOrder record);

    int updateByPrimaryKey(PinBackOrder record);
}
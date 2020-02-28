package com.dxt.third.core.dao;

import com.dxt.third.core.entity.JdStore;
import com.dxt.third.core.entity.JdStoreExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface JdStoreMapper {
    int countByExample(JdStoreExample example);

    int deleteByExample(JdStoreExample example);

    int insert(JdStore record);

    int insertSelective(JdStore record);

    List<JdStore> selectByExample(JdStoreExample example);

    int updateByExampleSelective(@Param("record") JdStore record, @Param("example") JdStoreExample example);

    int updateByExample(@Param("record") JdStore record, @Param("example") JdStoreExample example);
}
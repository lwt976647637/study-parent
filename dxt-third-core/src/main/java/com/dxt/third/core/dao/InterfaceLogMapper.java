package com.dxt.third.core.dao;

import com.dxt.third.core.entity.InterfaceLog;
import com.dxt.third.core.entity.InterfaceLogExample;
import com.dxt.third.core.entity.InterfaceLogWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface InterfaceLogMapper {
    int countByExample(InterfaceLogExample example);

    int deleteByExample(InterfaceLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(InterfaceLogWithBLOBs record);

    int insertSelective(InterfaceLogWithBLOBs record);

    List<InterfaceLogWithBLOBs> selectByExampleWithBLOBs(InterfaceLogExample example);

    List<InterfaceLog> selectByExample(InterfaceLogExample example);

    InterfaceLogWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InterfaceLogWithBLOBs record, @Param("example") InterfaceLogExample example);

    int updateByExampleWithBLOBs(@Param("record") InterfaceLogWithBLOBs record, @Param("example") InterfaceLogExample example);

    int updateByExample(@Param("record") InterfaceLog record, @Param("example") InterfaceLogExample example);

    int updateByPrimaryKeySelective(InterfaceLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InterfaceLogWithBLOBs record);

    int updateByPrimaryKey(InterfaceLog record);
}
package com.dxt.third.core.dao;

import com.dxt.third.core.entity.InterfaceLog;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface InterfaceLogMapper {

    int insert(InterfaceLog interfaceLog);


}
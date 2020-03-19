package com.dxt.third.core.service.impl;

import com.dxt.third.core.dao.InterfaceLogMapper;
import com.dxt.third.core.entity.InterfaceLog;
import com.dxt.third.core.service.InterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @ProjectName: dxt-third-parent
 * @Package: com.dxt.third.core.service.impl
 * @ClassName: InterfaceLogServiceImpl
 * @Description:
 * @Author: 李维涛
 * @CreateDate: 2020/2/28 17:29
 */
@Service
public class InterfaceLogServiceImpl implements InterfaceLogService {
    @Autowired
    private InterfaceLogMapper interfaceLogMapper;

    @Override
    public void saveOrderRecord(String orderNo, String requestMessage, String responseMessage, String name) {
        InterfaceLog interfaceLog = new InterfaceLog();
        interfaceLog.setOrderNo(orderNo);
        interfaceLog.setServerName(name);
        interfaceLog.setCreateTime(new Date());
        interfaceLog.setUpdateTime(new Date());
        interfaceLog.setRequestMessage(requestMessage);
        interfaceLog.setResponseMessage(responseMessage);
        interfaceLog.setId(UUID.randomUUID().toString());
        interfaceLogMapper.insert(interfaceLog);
    }
}

package com.dxt.third.core.service;

/**
 * @ProjectName: dxt-third-parent
 * @Package: com.dxt.third.core.service
 * @ClassName: InterfaceLogService
 * @Description:
 * @Author: 李维涛
 * @CreateDate: 2020/2/28 17:27
 */
public interface InterfaceLogService {
    /**
     * 保存接口日志
     * @param orderNo
     * @param requestMessage
     * @param responseMessag
     * @param name
     */
    void saveOrderRecord(String orderNo,String requestMessage,String responseMessag,String name);
}

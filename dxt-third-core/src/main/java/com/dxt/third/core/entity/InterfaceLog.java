package com.dxt.third.core.entity;

import lombok.Data;

import java.util.Date;
@Data
public class InterfaceLog {

    private String id;

    private String orderNo;

    private String serverName;

    private String methodName;

    private String type;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String elapsedTime;

    private String requestMessage;

    private String responseMessage;


}
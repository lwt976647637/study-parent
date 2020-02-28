package com.dxt.third.core.entity;

public class InterfaceLogWithBLOBs extends InterfaceLog {
    private String requestMessage;

    private String responseMessage;

    public InterfaceLogWithBLOBs(String id, String serverName, String methodName, String type, Date createTime, Date updateTime, String remark, String elapsedTime, String requestMessage, String responseMessage) {
        super(id, serverName, methodName, type, createTime, updateTime, remark, elapsedTime);
        this.requestMessage = requestMessage;
        this.responseMessage = responseMessage;
    }

    public InterfaceLogWithBLOBs() {
        super();
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage == null ? null : requestMessage.trim();
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage == null ? null : responseMessage.trim();
    }
}
package com.dxt.third.core.entity;

import java.util.Date;

public class InterfaceLog {
    private String id;

    private String serverName;

    private String methodName;

    private String type;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String elapsedTime;

    public InterfaceLog(String id, String serverName, String methodName, String type, Date createTime, Date updateTime, String remark, String elapsedTime) {
        this.id = id;
        this.serverName = serverName;
        this.methodName = methodName;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
        this.elapsedTime = elapsedTime;
    }

    public InterfaceLog() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime == null ? null : elapsedTime.trim();
    }
}
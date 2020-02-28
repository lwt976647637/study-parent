package com.dxt.third.core.entity;

import java.util.Date;

public class PinBackOrder extends PinBackOrderKey {
    private String mobile;

    private String payType;

    private String storeId;

    private String totalAmount;

    private String accountId;

    private String shopAssistant;

    private String shopUser;

    private String status;

    private String saleId;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String delFlag;

    public PinBackOrder(String id, String orderNo, String mobile, String payType, String storeId, String totalAmount, String accountId, String shopAssistant, String shopUser, String status, String saleId, String remark, Date createTime, Date updateTime, String delFlag) {
        super(id, orderNo);
        this.mobile = mobile;
        this.payType = payType;
        this.storeId = storeId;
        this.totalAmount = totalAmount;
        this.accountId = accountId;
        this.shopAssistant = shopAssistant;
        this.shopUser = shopUser;
        this.status = status;
        this.saleId = saleId;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.delFlag = delFlag;
    }

    public PinBackOrder() {
        super();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount == null ? null : totalAmount.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getShopAssistant() {
        return shopAssistant;
    }

    public void setShopAssistant(String shopAssistant) {
        this.shopAssistant = shopAssistant == null ? null : shopAssistant.trim();
    }

    public String getShopUser() {
        return shopUser;
    }

    public void setShopUser(String shopUser) {
        this.shopUser = shopUser == null ? null : shopUser.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId == null ? null : saleId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}
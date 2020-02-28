package com.dxt.third.core.entity;

import java.util.Date;

public class Product {
    private String id;

    private String orderNo;

    private String productId;

    private String productName;

    private String productPrice;

    private String productSerial;

    private Integer productNumber;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Product(String id, String orderNo, String productId, String productName, String productPrice, String productSerial, Integer productNumber, String remark, Date createTime, Date updateTime) {
        this.id = id;
        this.orderNo = orderNo;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSerial = productSerial;
        this.productNumber = productNumber;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Product() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    public String getProductSerial() {
        return productSerial;
    }

    public void setProductSerial(String productSerial) {
        this.productSerial = productSerial == null ? null : productSerial.trim();
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
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
}
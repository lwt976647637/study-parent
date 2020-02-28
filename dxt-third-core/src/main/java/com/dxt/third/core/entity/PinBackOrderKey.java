package com.dxt.third.core.entity;

public class PinBackOrderKey {
    private String id;

    private String orderNo;

    public PinBackOrderKey(String id, String orderNo) {
        this.id = id;
        this.orderNo = orderNo;
    }

    public PinBackOrderKey() {
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
}
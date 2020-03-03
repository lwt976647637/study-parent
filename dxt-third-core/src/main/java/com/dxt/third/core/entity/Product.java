package com.dxt.third.core.entity;

import lombok.Data;

import java.util.Date;
@Data
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


}
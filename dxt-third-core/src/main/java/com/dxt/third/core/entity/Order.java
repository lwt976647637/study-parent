package com.dxt.third.core.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 订单实体
 */
@Data
public class Order {

    private String id;

    private String orderNo;

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

    private String stsinSaleId;

    private String stsinRemark;

    private String stsinStatus;

    private String stsoutSaleId;

    private String stsoutRemark;

    private String stsoutStatus;

    private Date createTime;

    private Date updateTime;

    private String delFlag;

    private String mainMemo;

    private String orgId;

    List<Product> productList;




}

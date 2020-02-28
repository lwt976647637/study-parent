package com.dxt.third.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JdSale {
    private Integer accountid;

    private Long saleid;

    private Date saledate;

    private Integer store;

    private String user;

    private String user1;

    private String custom;

    private BigDecimal saletotal;

    private BigDecimal storetotal;

    private Integer saleok;

    private String type;

    private Integer moneytype;

    private String mainmemo;

    private String mainmemoex;

    private Integer insertserial;

    private String productid;

    private String productname;

    private BigDecimal productprice;

    private BigDecimal productnumber;

    private BigDecimal producttotal;

    private BigDecimal productstoreprice;

    private Short costmethod;

    private Short istaxprint;

    private String memo1;

    private String memo2;

    private String memo3;

    private String paytype;

    private BigDecimal taxrate;

    private Integer orgid;

    public JdSale(Integer accountid, Long saleid, Date saledate, Integer store, String user, String user1, String custom, BigDecimal saletotal, BigDecimal storetotal, Integer saleok, String type, Integer moneytype, String mainmemo, String mainmemoex, Integer insertserial, String productid, String productname, BigDecimal productprice, BigDecimal productnumber, BigDecimal producttotal, BigDecimal productstoreprice, Short costmethod, Short istaxprint, String memo1, String memo2, String memo3, String paytype, BigDecimal taxrate, Integer orgid) {
        this.accountid = accountid;
        this.saleid = saleid;
        this.saledate = saledate;
        this.store = store;
        this.user = user;
        this.user1 = user1;
        this.custom = custom;
        this.saletotal = saletotal;
        this.storetotal = storetotal;
        this.saleok = saleok;
        this.type = type;
        this.moneytype = moneytype;
        this.mainmemo = mainmemo;
        this.mainmemoex = mainmemoex;
        this.insertserial = insertserial;
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
        this.productnumber = productnumber;
        this.producttotal = producttotal;
        this.productstoreprice = productstoreprice;
        this.costmethod = costmethod;
        this.istaxprint = istaxprint;
        this.memo1 = memo1;
        this.memo2 = memo2;
        this.memo3 = memo3;
        this.paytype = paytype;
        this.taxrate = taxrate;
        this.orgid = orgid;
    }

    public JdSale() {
        super();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Long getSaleid() {
        return saleid;
    }

    public void setSaleid(Long saleid) {
        this.saleid = saleid;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1 == null ? null : user1.trim();
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom == null ? null : custom.trim();
    }

    public BigDecimal getSaletotal() {
        return saletotal;
    }

    public void setSaletotal(BigDecimal saletotal) {
        this.saletotal = saletotal;
    }

    public BigDecimal getStoretotal() {
        return storetotal;
    }

    public void setStoretotal(BigDecimal storetotal) {
        this.storetotal = storetotal;
    }

    public Integer getSaleok() {
        return saleok;
    }

    public void setSaleok(Integer saleok) {
        this.saleok = saleok;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(Integer moneytype) {
        this.moneytype = moneytype;
    }

    public String getMainmemo() {
        return mainmemo;
    }

    public void setMainmemo(String mainmemo) {
        this.mainmemo = mainmemo == null ? null : mainmemo.trim();
    }

    public String getMainmemoex() {
        return mainmemoex;
    }

    public void setMainmemoex(String mainmemoex) {
        this.mainmemoex = mainmemoex == null ? null : mainmemoex.trim();
    }

    public Integer getInsertserial() {
        return insertserial;
    }

    public void setInsertserial(Integer insertserial) {
        this.insertserial = insertserial;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public BigDecimal getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(BigDecimal productnumber) {
        this.productnumber = productnumber;
    }

    public BigDecimal getProducttotal() {
        return producttotal;
    }

    public void setProducttotal(BigDecimal producttotal) {
        this.producttotal = producttotal;
    }

    public BigDecimal getProductstoreprice() {
        return productstoreprice;
    }

    public void setProductstoreprice(BigDecimal productstoreprice) {
        this.productstoreprice = productstoreprice;
    }

    public Short getCostmethod() {
        return costmethod;
    }

    public void setCostmethod(Short costmethod) {
        this.costmethod = costmethod;
    }

    public Short getIstaxprint() {
        return istaxprint;
    }

    public void setIstaxprint(Short istaxprint) {
        this.istaxprint = istaxprint;
    }

    public String getMemo1() {
        return memo1;
    }

    public void setMemo1(String memo1) {
        this.memo1 = memo1 == null ? null : memo1.trim();
    }

    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2 == null ? null : memo2.trim();
    }

    public String getMemo3() {
        return memo3;
    }

    public void setMemo3(String memo3) {
        this.memo3 = memo3 == null ? null : memo3.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }
}
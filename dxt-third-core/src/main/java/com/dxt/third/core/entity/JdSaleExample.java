package com.dxt.third.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdSaleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccountidIsNull() {
            addCriterion("AccountID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("AccountID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("AccountID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("AccountID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("AccountID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccountID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("AccountID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("AccountID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("AccountID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("AccountID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("AccountID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccountID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNull() {
            addCriterion("SaleID is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("SaleID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Long value) {
            addCriterion("SaleID =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Long value) {
            addCriterion("SaleID <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Long value) {
            addCriterion("SaleID >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Long value) {
            addCriterion("SaleID >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Long value) {
            addCriterion("SaleID <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Long value) {
            addCriterion("SaleID <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Long> values) {
            addCriterion("SaleID in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Long> values) {
            addCriterion("SaleID not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Long value1, Long value2) {
            addCriterion("SaleID between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Long value1, Long value2) {
            addCriterion("SaleID not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNull() {
            addCriterion("SaleDate is null");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNotNull() {
            addCriterion("SaleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSaledateEqualTo(Date value) {
            addCriterion("SaleDate =", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotEqualTo(Date value) {
            addCriterion("SaleDate <>", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThan(Date value) {
            addCriterion("SaleDate >", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThanOrEqualTo(Date value) {
            addCriterion("SaleDate >=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThan(Date value) {
            addCriterion("SaleDate <", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThanOrEqualTo(Date value) {
            addCriterion("SaleDate <=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateIn(List<Date> values) {
            addCriterion("SaleDate in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotIn(List<Date> values) {
            addCriterion("SaleDate not in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateBetween(Date value1, Date value2) {
            addCriterion("SaleDate between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotBetween(Date value1, Date value2) {
            addCriterion("SaleDate not between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("Store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("Store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(Integer value) {
            addCriterion("Store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(Integer value) {
            addCriterion("Store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(Integer value) {
            addCriterion("Store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("Store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(Integer value) {
            addCriterion("Store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(Integer value) {
            addCriterion("Store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<Integer> values) {
            addCriterion("Store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<Integer> values) {
            addCriterion("Store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(Integer value1, Integer value2) {
            addCriterion("Store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("Store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUser1IsNull() {
            addCriterion("User1 is null");
            return (Criteria) this;
        }

        public Criteria andUser1IsNotNull() {
            addCriterion("User1 is not null");
            return (Criteria) this;
        }

        public Criteria andUser1EqualTo(String value) {
            addCriterion("User1 =", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotEqualTo(String value) {
            addCriterion("User1 <>", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1GreaterThan(String value) {
            addCriterion("User1 >", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1GreaterThanOrEqualTo(String value) {
            addCriterion("User1 >=", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1LessThan(String value) {
            addCriterion("User1 <", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1LessThanOrEqualTo(String value) {
            addCriterion("User1 <=", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1Like(String value) {
            addCriterion("User1 like", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotLike(String value) {
            addCriterion("User1 not like", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1In(List<String> values) {
            addCriterion("User1 in", values, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotIn(List<String> values) {
            addCriterion("User1 not in", values, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1Between(String value1, String value2) {
            addCriterion("User1 between", value1, value2, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotBetween(String value1, String value2) {
            addCriterion("User1 not between", value1, value2, "user1");
            return (Criteria) this;
        }

        public Criteria andCustomIsNull() {
            addCriterion("Custom is null");
            return (Criteria) this;
        }

        public Criteria andCustomIsNotNull() {
            addCriterion("Custom is not null");
            return (Criteria) this;
        }

        public Criteria andCustomEqualTo(String value) {
            addCriterion("Custom =", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotEqualTo(String value) {
            addCriterion("Custom <>", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThan(String value) {
            addCriterion("Custom >", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThanOrEqualTo(String value) {
            addCriterion("Custom >=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThan(String value) {
            addCriterion("Custom <", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThanOrEqualTo(String value) {
            addCriterion("Custom <=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLike(String value) {
            addCriterion("Custom like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotLike(String value) {
            addCriterion("Custom not like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomIn(List<String> values) {
            addCriterion("Custom in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotIn(List<String> values) {
            addCriterion("Custom not in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomBetween(String value1, String value2) {
            addCriterion("Custom between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotBetween(String value1, String value2) {
            addCriterion("Custom not between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andSaletotalIsNull() {
            addCriterion("SaleTotal is null");
            return (Criteria) this;
        }

        public Criteria andSaletotalIsNotNull() {
            addCriterion("SaleTotal is not null");
            return (Criteria) this;
        }

        public Criteria andSaletotalEqualTo(BigDecimal value) {
            addCriterion("SaleTotal =", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalNotEqualTo(BigDecimal value) {
            addCriterion("SaleTotal <>", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalGreaterThan(BigDecimal value) {
            addCriterion("SaleTotal >", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SaleTotal >=", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalLessThan(BigDecimal value) {
            addCriterion("SaleTotal <", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SaleTotal <=", value, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalIn(List<BigDecimal> values) {
            addCriterion("SaleTotal in", values, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalNotIn(List<BigDecimal> values) {
            addCriterion("SaleTotal not in", values, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SaleTotal between", value1, value2, "saletotal");
            return (Criteria) this;
        }

        public Criteria andSaletotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SaleTotal not between", value1, value2, "saletotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalIsNull() {
            addCriterion("StoreTotal is null");
            return (Criteria) this;
        }

        public Criteria andStoretotalIsNotNull() {
            addCriterion("StoreTotal is not null");
            return (Criteria) this;
        }

        public Criteria andStoretotalEqualTo(BigDecimal value) {
            addCriterion("StoreTotal =", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalNotEqualTo(BigDecimal value) {
            addCriterion("StoreTotal <>", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalGreaterThan(BigDecimal value) {
            addCriterion("StoreTotal >", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StoreTotal >=", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalLessThan(BigDecimal value) {
            addCriterion("StoreTotal <", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StoreTotal <=", value, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalIn(List<BigDecimal> values) {
            addCriterion("StoreTotal in", values, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalNotIn(List<BigDecimal> values) {
            addCriterion("StoreTotal not in", values, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StoreTotal between", value1, value2, "storetotal");
            return (Criteria) this;
        }

        public Criteria andStoretotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StoreTotal not between", value1, value2, "storetotal");
            return (Criteria) this;
        }

        public Criteria andSaleokIsNull() {
            addCriterion("SaleOK is null");
            return (Criteria) this;
        }

        public Criteria andSaleokIsNotNull() {
            addCriterion("SaleOK is not null");
            return (Criteria) this;
        }

        public Criteria andSaleokEqualTo(Integer value) {
            addCriterion("SaleOK =", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokNotEqualTo(Integer value) {
            addCriterion("SaleOK <>", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokGreaterThan(Integer value) {
            addCriterion("SaleOK >", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleOK >=", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokLessThan(Integer value) {
            addCriterion("SaleOK <", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokLessThanOrEqualTo(Integer value) {
            addCriterion("SaleOK <=", value, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokIn(List<Integer> values) {
            addCriterion("SaleOK in", values, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokNotIn(List<Integer> values) {
            addCriterion("SaleOK not in", values, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokBetween(Integer value1, Integer value2) {
            addCriterion("SaleOK between", value1, value2, "saleok");
            return (Criteria) this;
        }

        public Criteria andSaleokNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleOK not between", value1, value2, "saleok");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIsNull() {
            addCriterion("MoneyType is null");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIsNotNull() {
            addCriterion("MoneyType is not null");
            return (Criteria) this;
        }

        public Criteria andMoneytypeEqualTo(Integer value) {
            addCriterion("MoneyType =", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotEqualTo(Integer value) {
            addCriterion("MoneyType <>", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeGreaterThan(Integer value) {
            addCriterion("MoneyType >", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyType >=", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeLessThan(Integer value) {
            addCriterion("MoneyType <", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyType <=", value, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeIn(List<Integer> values) {
            addCriterion("MoneyType in", values, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotIn(List<Integer> values) {
            addCriterion("MoneyType not in", values, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeBetween(Integer value1, Integer value2) {
            addCriterion("MoneyType between", value1, value2, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMoneytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyType not between", value1, value2, "moneytype");
            return (Criteria) this;
        }

        public Criteria andMainmemoIsNull() {
            addCriterion("MainMemo is null");
            return (Criteria) this;
        }

        public Criteria andMainmemoIsNotNull() {
            addCriterion("MainMemo is not null");
            return (Criteria) this;
        }

        public Criteria andMainmemoEqualTo(String value) {
            addCriterion("MainMemo =", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoNotEqualTo(String value) {
            addCriterion("MainMemo <>", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoGreaterThan(String value) {
            addCriterion("MainMemo >", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoGreaterThanOrEqualTo(String value) {
            addCriterion("MainMemo >=", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoLessThan(String value) {
            addCriterion("MainMemo <", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoLessThanOrEqualTo(String value) {
            addCriterion("MainMemo <=", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoLike(String value) {
            addCriterion("MainMemo like", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoNotLike(String value) {
            addCriterion("MainMemo not like", value, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoIn(List<String> values) {
            addCriterion("MainMemo in", values, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoNotIn(List<String> values) {
            addCriterion("MainMemo not in", values, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoBetween(String value1, String value2) {
            addCriterion("MainMemo between", value1, value2, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoNotBetween(String value1, String value2) {
            addCriterion("MainMemo not between", value1, value2, "mainmemo");
            return (Criteria) this;
        }

        public Criteria andMainmemoexIsNull() {
            addCriterion("MainMemoEx is null");
            return (Criteria) this;
        }

        public Criteria andMainmemoexIsNotNull() {
            addCriterion("MainMemoEx is not null");
            return (Criteria) this;
        }

        public Criteria andMainmemoexEqualTo(String value) {
            addCriterion("MainMemoEx =", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexNotEqualTo(String value) {
            addCriterion("MainMemoEx <>", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexGreaterThan(String value) {
            addCriterion("MainMemoEx >", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexGreaterThanOrEqualTo(String value) {
            addCriterion("MainMemoEx >=", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexLessThan(String value) {
            addCriterion("MainMemoEx <", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexLessThanOrEqualTo(String value) {
            addCriterion("MainMemoEx <=", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexLike(String value) {
            addCriterion("MainMemoEx like", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexNotLike(String value) {
            addCriterion("MainMemoEx not like", value, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexIn(List<String> values) {
            addCriterion("MainMemoEx in", values, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexNotIn(List<String> values) {
            addCriterion("MainMemoEx not in", values, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexBetween(String value1, String value2) {
            addCriterion("MainMemoEx between", value1, value2, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andMainmemoexNotBetween(String value1, String value2) {
            addCriterion("MainMemoEx not between", value1, value2, "mainmemoex");
            return (Criteria) this;
        }

        public Criteria andInsertserialIsNull() {
            addCriterion("InsertSerial is null");
            return (Criteria) this;
        }

        public Criteria andInsertserialIsNotNull() {
            addCriterion("InsertSerial is not null");
            return (Criteria) this;
        }

        public Criteria andInsertserialEqualTo(Integer value) {
            addCriterion("InsertSerial =", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialNotEqualTo(Integer value) {
            addCriterion("InsertSerial <>", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialGreaterThan(Integer value) {
            addCriterion("InsertSerial >", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialGreaterThanOrEqualTo(Integer value) {
            addCriterion("InsertSerial >=", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialLessThan(Integer value) {
            addCriterion("InsertSerial <", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialLessThanOrEqualTo(Integer value) {
            addCriterion("InsertSerial <=", value, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialIn(List<Integer> values) {
            addCriterion("InsertSerial in", values, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialNotIn(List<Integer> values) {
            addCriterion("InsertSerial not in", values, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialBetween(Integer value1, Integer value2) {
            addCriterion("InsertSerial between", value1, value2, "insertserial");
            return (Criteria) this;
        }

        public Criteria andInsertserialNotBetween(Integer value1, Integer value2) {
            addCriterion("InsertSerial not between", value1, value2, "insertserial");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("ProductID like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("ProductID not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("ProductPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("ProductPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("ProductPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("ProductPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("ProductPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("ProductPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("ProductPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("ProductPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNull() {
            addCriterion("ProductNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNotNull() {
            addCriterion("ProductNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumberEqualTo(BigDecimal value) {
            addCriterion("ProductNumber =", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotEqualTo(BigDecimal value) {
            addCriterion("ProductNumber <>", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThan(BigDecimal value) {
            addCriterion("ProductNumber >", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductNumber >=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThan(BigDecimal value) {
            addCriterion("ProductNumber <", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductNumber <=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberIn(List<BigDecimal> values) {
            addCriterion("ProductNumber in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotIn(List<BigDecimal> values) {
            addCriterion("ProductNumber not in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductNumber between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductNumber not between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProducttotalIsNull() {
            addCriterion("ProductTotal is null");
            return (Criteria) this;
        }

        public Criteria andProducttotalIsNotNull() {
            addCriterion("ProductTotal is not null");
            return (Criteria) this;
        }

        public Criteria andProducttotalEqualTo(BigDecimal value) {
            addCriterion("ProductTotal =", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotEqualTo(BigDecimal value) {
            addCriterion("ProductTotal <>", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalGreaterThan(BigDecimal value) {
            addCriterion("ProductTotal >", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductTotal >=", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalLessThan(BigDecimal value) {
            addCriterion("ProductTotal <", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductTotal <=", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalIn(List<BigDecimal> values) {
            addCriterion("ProductTotal in", values, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotIn(List<BigDecimal> values) {
            addCriterion("ProductTotal not in", values, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductTotal between", value1, value2, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductTotal not between", value1, value2, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceIsNull() {
            addCriterion("ProductStorePrice is null");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceIsNotNull() {
            addCriterion("ProductStorePrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceEqualTo(BigDecimal value) {
            addCriterion("ProductStorePrice =", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceNotEqualTo(BigDecimal value) {
            addCriterion("ProductStorePrice <>", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceGreaterThan(BigDecimal value) {
            addCriterion("ProductStorePrice >", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductStorePrice >=", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceLessThan(BigDecimal value) {
            addCriterion("ProductStorePrice <", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProductStorePrice <=", value, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceIn(List<BigDecimal> values) {
            addCriterion("ProductStorePrice in", values, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceNotIn(List<BigDecimal> values) {
            addCriterion("ProductStorePrice not in", values, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductStorePrice between", value1, value2, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andProductstorepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProductStorePrice not between", value1, value2, "productstoreprice");
            return (Criteria) this;
        }

        public Criteria andCostmethodIsNull() {
            addCriterion("CostMethod is null");
            return (Criteria) this;
        }

        public Criteria andCostmethodIsNotNull() {
            addCriterion("CostMethod is not null");
            return (Criteria) this;
        }

        public Criteria andCostmethodEqualTo(Short value) {
            addCriterion("CostMethod =", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodNotEqualTo(Short value) {
            addCriterion("CostMethod <>", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodGreaterThan(Short value) {
            addCriterion("CostMethod >", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodGreaterThanOrEqualTo(Short value) {
            addCriterion("CostMethod >=", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodLessThan(Short value) {
            addCriterion("CostMethod <", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodLessThanOrEqualTo(Short value) {
            addCriterion("CostMethod <=", value, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodIn(List<Short> values) {
            addCriterion("CostMethod in", values, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodNotIn(List<Short> values) {
            addCriterion("CostMethod not in", values, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodBetween(Short value1, Short value2) {
            addCriterion("CostMethod between", value1, value2, "costmethod");
            return (Criteria) this;
        }

        public Criteria andCostmethodNotBetween(Short value1, Short value2) {
            addCriterion("CostMethod not between", value1, value2, "costmethod");
            return (Criteria) this;
        }

        public Criteria andIstaxprintIsNull() {
            addCriterion("IsTaxPrint is null");
            return (Criteria) this;
        }

        public Criteria andIstaxprintIsNotNull() {
            addCriterion("IsTaxPrint is not null");
            return (Criteria) this;
        }

        public Criteria andIstaxprintEqualTo(Short value) {
            addCriterion("IsTaxPrint =", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintNotEqualTo(Short value) {
            addCriterion("IsTaxPrint <>", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintGreaterThan(Short value) {
            addCriterion("IsTaxPrint >", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintGreaterThanOrEqualTo(Short value) {
            addCriterion("IsTaxPrint >=", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintLessThan(Short value) {
            addCriterion("IsTaxPrint <", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintLessThanOrEqualTo(Short value) {
            addCriterion("IsTaxPrint <=", value, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintIn(List<Short> values) {
            addCriterion("IsTaxPrint in", values, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintNotIn(List<Short> values) {
            addCriterion("IsTaxPrint not in", values, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintBetween(Short value1, Short value2) {
            addCriterion("IsTaxPrint between", value1, value2, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andIstaxprintNotBetween(Short value1, Short value2) {
            addCriterion("IsTaxPrint not between", value1, value2, "istaxprint");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNull() {
            addCriterion("Memo1 is null");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNotNull() {
            addCriterion("Memo1 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo1EqualTo(String value) {
            addCriterion("Memo1 =", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotEqualTo(String value) {
            addCriterion("Memo1 <>", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThan(String value) {
            addCriterion("Memo1 >", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThanOrEqualTo(String value) {
            addCriterion("Memo1 >=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThan(String value) {
            addCriterion("Memo1 <", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThanOrEqualTo(String value) {
            addCriterion("Memo1 <=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Like(String value) {
            addCriterion("Memo1 like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotLike(String value) {
            addCriterion("Memo1 not like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1In(List<String> values) {
            addCriterion("Memo1 in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotIn(List<String> values) {
            addCriterion("Memo1 not in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Between(String value1, String value2) {
            addCriterion("Memo1 between", value1, value2, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotBetween(String value1, String value2) {
            addCriterion("Memo1 not between", value1, value2, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo2IsNull() {
            addCriterion("Memo2 is null");
            return (Criteria) this;
        }

        public Criteria andMemo2IsNotNull() {
            addCriterion("Memo2 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo2EqualTo(String value) {
            addCriterion("Memo2 =", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotEqualTo(String value) {
            addCriterion("Memo2 <>", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThan(String value) {
            addCriterion("Memo2 >", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThanOrEqualTo(String value) {
            addCriterion("Memo2 >=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThan(String value) {
            addCriterion("Memo2 <", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThanOrEqualTo(String value) {
            addCriterion("Memo2 <=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Like(String value) {
            addCriterion("Memo2 like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotLike(String value) {
            addCriterion("Memo2 not like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2In(List<String> values) {
            addCriterion("Memo2 in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotIn(List<String> values) {
            addCriterion("Memo2 not in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Between(String value1, String value2) {
            addCriterion("Memo2 between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotBetween(String value1, String value2) {
            addCriterion("Memo2 not between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo3IsNull() {
            addCriterion("Memo3 is null");
            return (Criteria) this;
        }

        public Criteria andMemo3IsNotNull() {
            addCriterion("Memo3 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo3EqualTo(String value) {
            addCriterion("Memo3 =", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3NotEqualTo(String value) {
            addCriterion("Memo3 <>", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3GreaterThan(String value) {
            addCriterion("Memo3 >", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3GreaterThanOrEqualTo(String value) {
            addCriterion("Memo3 >=", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3LessThan(String value) {
            addCriterion("Memo3 <", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3LessThanOrEqualTo(String value) {
            addCriterion("Memo3 <=", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3Like(String value) {
            addCriterion("Memo3 like", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3NotLike(String value) {
            addCriterion("Memo3 not like", value, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3In(List<String> values) {
            addCriterion("Memo3 in", values, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3NotIn(List<String> values) {
            addCriterion("Memo3 not in", values, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3Between(String value1, String value2) {
            addCriterion("Memo3 between", value1, value2, "memo3");
            return (Criteria) this;
        }

        public Criteria andMemo3NotBetween(String value1, String value2) {
            addCriterion("Memo3 not between", value1, value2, "memo3");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PayType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PayType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(BigDecimal value) {
            addCriterion("TaxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(BigDecimal value) {
            addCriterion("TaxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(BigDecimal value) {
            addCriterion("TaxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(BigDecimal value) {
            addCriterion("TaxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<BigDecimal> values) {
            addCriterion("TaxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<BigDecimal> values) {
            addCriterion("TaxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
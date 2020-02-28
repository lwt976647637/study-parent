package com.dxt.third.core.entity;

import java.util.ArrayList;
import java.util.List;

public class JdStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdStoreExample() {
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

        public Criteria andGtaccountidIsNull() {
            addCriterion("gtaccountid is null");
            return (Criteria) this;
        }

        public Criteria andGtaccountidIsNotNull() {
            addCriterion("gtaccountid is not null");
            return (Criteria) this;
        }

        public Criteria andGtaccountidEqualTo(String value) {
            addCriterion("gtaccountid =", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidNotEqualTo(String value) {
            addCriterion("gtaccountid <>", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidGreaterThan(String value) {
            addCriterion("gtaccountid >", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("gtaccountid >=", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidLessThan(String value) {
            addCriterion("gtaccountid <", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidLessThanOrEqualTo(String value) {
            addCriterion("gtaccountid <=", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidLike(String value) {
            addCriterion("gtaccountid like", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidNotLike(String value) {
            addCriterion("gtaccountid not like", value, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidIn(List<String> values) {
            addCriterion("gtaccountid in", values, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidNotIn(List<String> values) {
            addCriterion("gtaccountid not in", values, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidBetween(String value1, String value2) {
            addCriterion("gtaccountid between", value1, value2, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtaccountidNotBetween(String value1, String value2) {
            addCriterion("gtaccountid not between", value1, value2, "gtaccountid");
            return (Criteria) this;
        }

        public Criteria andGtinvidIsNull() {
            addCriterion("gtinvid is null");
            return (Criteria) this;
        }

        public Criteria andGtinvidIsNotNull() {
            addCriterion("gtinvid is not null");
            return (Criteria) this;
        }

        public Criteria andGtinvidEqualTo(String value) {
            addCriterion("gtinvid =", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidNotEqualTo(String value) {
            addCriterion("gtinvid <>", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidGreaterThan(String value) {
            addCriterion("gtinvid >", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidGreaterThanOrEqualTo(String value) {
            addCriterion("gtinvid >=", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidLessThan(String value) {
            addCriterion("gtinvid <", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidLessThanOrEqualTo(String value) {
            addCriterion("gtinvid <=", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidLike(String value) {
            addCriterion("gtinvid like", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidNotLike(String value) {
            addCriterion("gtinvid not like", value, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidIn(List<String> values) {
            addCriterion("gtinvid in", values, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidNotIn(List<String> values) {
            addCriterion("gtinvid not in", values, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidBetween(String value1, String value2) {
            addCriterion("gtinvid between", value1, value2, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvidNotBetween(String value1, String value2) {
            addCriterion("gtinvid not between", value1, value2, "gtinvid");
            return (Criteria) this;
        }

        public Criteria andGtinvnameIsNull() {
            addCriterion("gtinvname is null");
            return (Criteria) this;
        }

        public Criteria andGtinvnameIsNotNull() {
            addCriterion("gtinvname is not null");
            return (Criteria) this;
        }

        public Criteria andGtinvnameEqualTo(String value) {
            addCriterion("gtinvname =", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameNotEqualTo(String value) {
            addCriterion("gtinvname <>", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameGreaterThan(String value) {
            addCriterion("gtinvname >", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameGreaterThanOrEqualTo(String value) {
            addCriterion("gtinvname >=", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameLessThan(String value) {
            addCriterion("gtinvname <", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameLessThanOrEqualTo(String value) {
            addCriterion("gtinvname <=", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameLike(String value) {
            addCriterion("gtinvname like", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameNotLike(String value) {
            addCriterion("gtinvname not like", value, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameIn(List<String> values) {
            addCriterion("gtinvname in", values, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameNotIn(List<String> values) {
            addCriterion("gtinvname not in", values, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameBetween(String value1, String value2) {
            addCriterion("gtinvname between", value1, value2, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtinvnameNotBetween(String value1, String value2) {
            addCriterion("gtinvname not between", value1, value2, "gtinvname");
            return (Criteria) this;
        }

        public Criteria andGtdepotidIsNull() {
            addCriterion("gtdepotid is null");
            return (Criteria) this;
        }

        public Criteria andGtdepotidIsNotNull() {
            addCriterion("gtdepotid is not null");
            return (Criteria) this;
        }

        public Criteria andGtdepotidEqualTo(String value) {
            addCriterion("gtdepotid =", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidNotEqualTo(String value) {
            addCriterion("gtdepotid <>", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidGreaterThan(String value) {
            addCriterion("gtdepotid >", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidGreaterThanOrEqualTo(String value) {
            addCriterion("gtdepotid >=", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidLessThan(String value) {
            addCriterion("gtdepotid <", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidLessThanOrEqualTo(String value) {
            addCriterion("gtdepotid <=", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidLike(String value) {
            addCriterion("gtdepotid like", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidNotLike(String value) {
            addCriterion("gtdepotid not like", value, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidIn(List<String> values) {
            addCriterion("gtdepotid in", values, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidNotIn(List<String> values) {
            addCriterion("gtdepotid not in", values, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidBetween(String value1, String value2) {
            addCriterion("gtdepotid between", value1, value2, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotidNotBetween(String value1, String value2) {
            addCriterion("gtdepotid not between", value1, value2, "gtdepotid");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameIsNull() {
            addCriterion("gtdepotname is null");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameIsNotNull() {
            addCriterion("gtdepotname is not null");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameEqualTo(String value) {
            addCriterion("gtdepotname =", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameNotEqualTo(String value) {
            addCriterion("gtdepotname <>", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameGreaterThan(String value) {
            addCriterion("gtdepotname >", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameGreaterThanOrEqualTo(String value) {
            addCriterion("gtdepotname >=", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameLessThan(String value) {
            addCriterion("gtdepotname <", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameLessThanOrEqualTo(String value) {
            addCriterion("gtdepotname <=", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameLike(String value) {
            addCriterion("gtdepotname like", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameNotLike(String value) {
            addCriterion("gtdepotname not like", value, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameIn(List<String> values) {
            addCriterion("gtdepotname in", values, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameNotIn(List<String> values) {
            addCriterion("gtdepotname not in", values, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameBetween(String value1, String value2) {
            addCriterion("gtdepotname between", value1, value2, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andGtdepotnameNotBetween(String value1, String value2) {
            addCriterion("gtdepotname not between", value1, value2, "gtdepotname");
            return (Criteria) this;
        }

        public Criteria andNsrinvidIsNull() {
            addCriterion("nsrinvid is null");
            return (Criteria) this;
        }

        public Criteria andNsrinvidIsNotNull() {
            addCriterion("nsrinvid is not null");
            return (Criteria) this;
        }

        public Criteria andNsrinvidEqualTo(String value) {
            addCriterion("nsrinvid =", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidNotEqualTo(String value) {
            addCriterion("nsrinvid <>", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidGreaterThan(String value) {
            addCriterion("nsrinvid >", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidGreaterThanOrEqualTo(String value) {
            addCriterion("nsrinvid >=", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidLessThan(String value) {
            addCriterion("nsrinvid <", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidLessThanOrEqualTo(String value) {
            addCriterion("nsrinvid <=", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidLike(String value) {
            addCriterion("nsrinvid like", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidNotLike(String value) {
            addCriterion("nsrinvid not like", value, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidIn(List<String> values) {
            addCriterion("nsrinvid in", values, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidNotIn(List<String> values) {
            addCriterion("nsrinvid not in", values, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidBetween(String value1, String value2) {
            addCriterion("nsrinvid between", value1, value2, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvidNotBetween(String value1, String value2) {
            addCriterion("nsrinvid not between", value1, value2, "nsrinvid");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameIsNull() {
            addCriterion("nsrinvname is null");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameIsNotNull() {
            addCriterion("nsrinvname is not null");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameEqualTo(String value) {
            addCriterion("nsrinvname =", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameNotEqualTo(String value) {
            addCriterion("nsrinvname <>", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameGreaterThan(String value) {
            addCriterion("nsrinvname >", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameGreaterThanOrEqualTo(String value) {
            addCriterion("nsrinvname >=", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameLessThan(String value) {
            addCriterion("nsrinvname <", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameLessThanOrEqualTo(String value) {
            addCriterion("nsrinvname <=", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameLike(String value) {
            addCriterion("nsrinvname like", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameNotLike(String value) {
            addCriterion("nsrinvname not like", value, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameIn(List<String> values) {
            addCriterion("nsrinvname in", values, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameNotIn(List<String> values) {
            addCriterion("nsrinvname not in", values, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameBetween(String value1, String value2) {
            addCriterion("nsrinvname between", value1, value2, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrinvnameNotBetween(String value1, String value2) {
            addCriterion("nsrinvname not between", value1, value2, "nsrinvname");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidIsNull() {
            addCriterion("nsrdepotid is null");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidIsNotNull() {
            addCriterion("nsrdepotid is not null");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidEqualTo(String value) {
            addCriterion("nsrdepotid =", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidNotEqualTo(String value) {
            addCriterion("nsrdepotid <>", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidGreaterThan(String value) {
            addCriterion("nsrdepotid >", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidGreaterThanOrEqualTo(String value) {
            addCriterion("nsrdepotid >=", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidLessThan(String value) {
            addCriterion("nsrdepotid <", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidLessThanOrEqualTo(String value) {
            addCriterion("nsrdepotid <=", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidLike(String value) {
            addCriterion("nsrdepotid like", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidNotLike(String value) {
            addCriterion("nsrdepotid not like", value, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidIn(List<String> values) {
            addCriterion("nsrdepotid in", values, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidNotIn(List<String> values) {
            addCriterion("nsrdepotid not in", values, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidBetween(String value1, String value2) {
            addCriterion("nsrdepotid between", value1, value2, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNsrdepotidNotBetween(String value1, String value2) {
            addCriterion("nsrdepotid not between", value1, value2, "nsrdepotid");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameIsNull() {
            addCriterion("nrsdepotname is null");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameIsNotNull() {
            addCriterion("nrsdepotname is not null");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameEqualTo(String value) {
            addCriterion("nrsdepotname =", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameNotEqualTo(String value) {
            addCriterion("nrsdepotname <>", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameGreaterThan(String value) {
            addCriterion("nrsdepotname >", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameGreaterThanOrEqualTo(String value) {
            addCriterion("nrsdepotname >=", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameLessThan(String value) {
            addCriterion("nrsdepotname <", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameLessThanOrEqualTo(String value) {
            addCriterion("nrsdepotname <=", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameLike(String value) {
            addCriterion("nrsdepotname like", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameNotLike(String value) {
            addCriterion("nrsdepotname not like", value, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameIn(List<String> values) {
            addCriterion("nrsdepotname in", values, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameNotIn(List<String> values) {
            addCriterion("nrsdepotname not in", values, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameBetween(String value1, String value2) {
            addCriterion("nrsdepotname between", value1, value2, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andNrsdepotnameNotBetween(String value1, String value2) {
            addCriterion("nrsdepotname not between", value1, value2, "nrsdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotidIsNull() {
            addCriterion("ztdepotid is null");
            return (Criteria) this;
        }

        public Criteria andZtdepotidIsNotNull() {
            addCriterion("ztdepotid is not null");
            return (Criteria) this;
        }

        public Criteria andZtdepotidEqualTo(String value) {
            addCriterion("ztdepotid =", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidNotEqualTo(String value) {
            addCriterion("ztdepotid <>", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidGreaterThan(String value) {
            addCriterion("ztdepotid >", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidGreaterThanOrEqualTo(String value) {
            addCriterion("ztdepotid >=", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidLessThan(String value) {
            addCriterion("ztdepotid <", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidLessThanOrEqualTo(String value) {
            addCriterion("ztdepotid <=", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidLike(String value) {
            addCriterion("ztdepotid like", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidNotLike(String value) {
            addCriterion("ztdepotid not like", value, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidIn(List<String> values) {
            addCriterion("ztdepotid in", values, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidNotIn(List<String> values) {
            addCriterion("ztdepotid not in", values, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidBetween(String value1, String value2) {
            addCriterion("ztdepotid between", value1, value2, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotidNotBetween(String value1, String value2) {
            addCriterion("ztdepotid not between", value1, value2, "ztdepotid");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameIsNull() {
            addCriterion("ztdepotname is null");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameIsNotNull() {
            addCriterion("ztdepotname is not null");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameEqualTo(String value) {
            addCriterion("ztdepotname =", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameNotEqualTo(String value) {
            addCriterion("ztdepotname <>", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameGreaterThan(String value) {
            addCriterion("ztdepotname >", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameGreaterThanOrEqualTo(String value) {
            addCriterion("ztdepotname >=", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameLessThan(String value) {
            addCriterion("ztdepotname <", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameLessThanOrEqualTo(String value) {
            addCriterion("ztdepotname <=", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameLike(String value) {
            addCriterion("ztdepotname like", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameNotLike(String value) {
            addCriterion("ztdepotname not like", value, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameIn(List<String> values) {
            addCriterion("ztdepotname in", values, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameNotIn(List<String> values) {
            addCriterion("ztdepotname not in", values, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameBetween(String value1, String value2) {
            addCriterion("ztdepotname between", value1, value2, "ztdepotname");
            return (Criteria) this;
        }

        public Criteria andZtdepotnameNotBetween(String value1, String value2) {
            addCriterion("ztdepotname not between", value1, value2, "ztdepotname");
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
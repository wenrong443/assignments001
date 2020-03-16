package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductBeanExample() {
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

        public Criteria andPtIdIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Integer value) {
            addCriterion("pt_id =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Integer value) {
            addCriterion("pt_id <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Integer value) {
            addCriterion("pt_id >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_id >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Integer value) {
            addCriterion("pt_id <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_id <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Integer> values) {
            addCriterion("pt_id in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Integer> values) {
            addCriterion("pt_id not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_id between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_id not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtUrlIsNull() {
            addCriterion("pt_url is null");
            return (Criteria) this;
        }

        public Criteria andPtUrlIsNotNull() {
            addCriterion("pt_url is not null");
            return (Criteria) this;
        }

        public Criteria andPtUrlEqualTo(String value) {
            addCriterion("pt_url =", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlNotEqualTo(String value) {
            addCriterion("pt_url <>", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlGreaterThan(String value) {
            addCriterion("pt_url >", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pt_url >=", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlLessThan(String value) {
            addCriterion("pt_url <", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlLessThanOrEqualTo(String value) {
            addCriterion("pt_url <=", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlLike(String value) {
            addCriterion("pt_url like", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlNotLike(String value) {
            addCriterion("pt_url not like", value, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlIn(List<String> values) {
            addCriterion("pt_url in", values, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlNotIn(List<String> values) {
            addCriterion("pt_url not in", values, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlBetween(String value1, String value2) {
            addCriterion("pt_url between", value1, value2, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtUrlNotBetween(String value1, String value2) {
            addCriterion("pt_url not between", value1, value2, "ptUrl");
            return (Criteria) this;
        }

        public Criteria andPtTitleIsNull() {
            addCriterion("pt_title is null");
            return (Criteria) this;
        }

        public Criteria andPtTitleIsNotNull() {
            addCriterion("pt_title is not null");
            return (Criteria) this;
        }

        public Criteria andPtTitleEqualTo(String value) {
            addCriterion("pt_title =", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleNotEqualTo(String value) {
            addCriterion("pt_title <>", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleGreaterThan(String value) {
            addCriterion("pt_title >", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pt_title >=", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleLessThan(String value) {
            addCriterion("pt_title <", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleLessThanOrEqualTo(String value) {
            addCriterion("pt_title <=", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleLike(String value) {
            addCriterion("pt_title like", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleNotLike(String value) {
            addCriterion("pt_title not like", value, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleIn(List<String> values) {
            addCriterion("pt_title in", values, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleNotIn(List<String> values) {
            addCriterion("pt_title not in", values, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleBetween(String value1, String value2) {
            addCriterion("pt_title between", value1, value2, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtTitleNotBetween(String value1, String value2) {
            addCriterion("pt_title not between", value1, value2, "ptTitle");
            return (Criteria) this;
        }

        public Criteria andPtCtIdIsNull() {
            addCriterion("pt_ct_id is null");
            return (Criteria) this;
        }

        public Criteria andPtCtIdIsNotNull() {
            addCriterion("pt_ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtCtIdEqualTo(Integer value) {
            addCriterion("pt_ct_id =", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdNotEqualTo(Integer value) {
            addCriterion("pt_ct_id <>", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdGreaterThan(Integer value) {
            addCriterion("pt_ct_id >", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_ct_id >=", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdLessThan(Integer value) {
            addCriterion("pt_ct_id <", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_ct_id <=", value, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdIn(List<Integer> values) {
            addCriterion("pt_ct_id in", values, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdNotIn(List<Integer> values) {
            addCriterion("pt_ct_id not in", values, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_ct_id between", value1, value2, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_ct_id not between", value1, value2, "ptCtId");
            return (Criteria) this;
        }

        public Criteria andPtPriceIsNull() {
            addCriterion("pt_price is null");
            return (Criteria) this;
        }

        public Criteria andPtPriceIsNotNull() {
            addCriterion("pt_price is not null");
            return (Criteria) this;
        }

        public Criteria andPtPriceEqualTo(Float value) {
            addCriterion("pt_price =", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceNotEqualTo(Float value) {
            addCriterion("pt_price <>", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceGreaterThan(Float value) {
            addCriterion("pt_price >", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pt_price >=", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceLessThan(Float value) {
            addCriterion("pt_price <", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceLessThanOrEqualTo(Float value) {
            addCriterion("pt_price <=", value, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceIn(List<Float> values) {
            addCriterion("pt_price in", values, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceNotIn(List<Float> values) {
            addCriterion("pt_price not in", values, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceBetween(Float value1, Float value2) {
            addCriterion("pt_price between", value1, value2, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtPriceNotBetween(Float value1, Float value2) {
            addCriterion("pt_price not between", value1, value2, "ptPrice");
            return (Criteria) this;
        }

        public Criteria andPtMsrpIsNull() {
            addCriterion("pt_msrp is null");
            return (Criteria) this;
        }

        public Criteria andPtMsrpIsNotNull() {
            addCriterion("pt_msrp is not null");
            return (Criteria) this;
        }

        public Criteria andPtMsrpEqualTo(Integer value) {
            addCriterion("pt_msrp =", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpNotEqualTo(Integer value) {
            addCriterion("pt_msrp <>", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpGreaterThan(Integer value) {
            addCriterion("pt_msrp >", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_msrp >=", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpLessThan(Integer value) {
            addCriterion("pt_msrp <", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpLessThanOrEqualTo(Integer value) {
            addCriterion("pt_msrp <=", value, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpIn(List<Integer> values) {
            addCriterion("pt_msrp in", values, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpNotIn(List<Integer> values) {
            addCriterion("pt_msrp not in", values, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpBetween(Integer value1, Integer value2) {
            addCriterion("pt_msrp between", value1, value2, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtMsrpNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_msrp not between", value1, value2, "ptMsrp");
            return (Criteria) this;
        }

        public Criteria andPtStatusIsNull() {
            addCriterion("pt_status is null");
            return (Criteria) this;
        }

        public Criteria andPtStatusIsNotNull() {
            addCriterion("pt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPtStatusEqualTo(Integer value) {
            addCriterion("pt_status =", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusNotEqualTo(Integer value) {
            addCriterion("pt_status <>", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusGreaterThan(Integer value) {
            addCriterion("pt_status >", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_status >=", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusLessThan(Integer value) {
            addCriterion("pt_status <", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pt_status <=", value, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusIn(List<Integer> values) {
            addCriterion("pt_status in", values, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusNotIn(List<Integer> values) {
            addCriterion("pt_status not in", values, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusBetween(Integer value1, Integer value2) {
            addCriterion("pt_status between", value1, value2, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_status not between", value1, value2, "ptStatus");
            return (Criteria) this;
        }

        public Criteria andPtMtIdIsNull() {
            addCriterion("pt_mt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtMtIdIsNotNull() {
            addCriterion("pt_mt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtMtIdEqualTo(Integer value) {
            addCriterion("pt_mt_id =", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdNotEqualTo(Integer value) {
            addCriterion("pt_mt_id <>", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdGreaterThan(Integer value) {
            addCriterion("pt_mt_id >", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_mt_id >=", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdLessThan(Integer value) {
            addCriterion("pt_mt_id <", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_mt_id <=", value, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdIn(List<Integer> values) {
            addCriterion("pt_mt_id in", values, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdNotIn(List<Integer> values) {
            addCriterion("pt_mt_id not in", values, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_mt_id between", value1, value2, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtMtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_mt_id not between", value1, value2, "ptMtId");
            return (Criteria) this;
        }

        public Criteria andPtParam1IsNull() {
            addCriterion("pt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPtParam1IsNotNull() {
            addCriterion("pt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPtParam1EqualTo(String value) {
            addCriterion("pt_param1 =", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1NotEqualTo(String value) {
            addCriterion("pt_param1 <>", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1GreaterThan(String value) {
            addCriterion("pt_param1 >", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("pt_param1 >=", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1LessThan(String value) {
            addCriterion("pt_param1 <", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1LessThanOrEqualTo(String value) {
            addCriterion("pt_param1 <=", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1Like(String value) {
            addCriterion("pt_param1 like", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1NotLike(String value) {
            addCriterion("pt_param1 not like", value, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1In(List<String> values) {
            addCriterion("pt_param1 in", values, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1NotIn(List<String> values) {
            addCriterion("pt_param1 not in", values, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1Between(String value1, String value2) {
            addCriterion("pt_param1 between", value1, value2, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam1NotBetween(String value1, String value2) {
            addCriterion("pt_param1 not between", value1, value2, "ptParam1");
            return (Criteria) this;
        }

        public Criteria andPtParam2IsNull() {
            addCriterion("pt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPtParam2IsNotNull() {
            addCriterion("pt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPtParam2EqualTo(String value) {
            addCriterion("pt_param2 =", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2NotEqualTo(String value) {
            addCriterion("pt_param2 <>", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2GreaterThan(String value) {
            addCriterion("pt_param2 >", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("pt_param2 >=", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2LessThan(String value) {
            addCriterion("pt_param2 <", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2LessThanOrEqualTo(String value) {
            addCriterion("pt_param2 <=", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2Like(String value) {
            addCriterion("pt_param2 like", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2NotLike(String value) {
            addCriterion("pt_param2 not like", value, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2In(List<String> values) {
            addCriterion("pt_param2 in", values, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2NotIn(List<String> values) {
            addCriterion("pt_param2 not in", values, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2Between(String value1, String value2) {
            addCriterion("pt_param2 between", value1, value2, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam2NotBetween(String value1, String value2) {
            addCriterion("pt_param2 not between", value1, value2, "ptParam2");
            return (Criteria) this;
        }

        public Criteria andPtParam3IsNull() {
            addCriterion("pt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPtParam3IsNotNull() {
            addCriterion("pt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPtParam3EqualTo(String value) {
            addCriterion("pt_param3 =", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3NotEqualTo(String value) {
            addCriterion("pt_param3 <>", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3GreaterThan(String value) {
            addCriterion("pt_param3 >", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("pt_param3 >=", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3LessThan(String value) {
            addCriterion("pt_param3 <", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3LessThanOrEqualTo(String value) {
            addCriterion("pt_param3 <=", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3Like(String value) {
            addCriterion("pt_param3 like", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3NotLike(String value) {
            addCriterion("pt_param3 not like", value, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3In(List<String> values) {
            addCriterion("pt_param3 in", values, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3NotIn(List<String> values) {
            addCriterion("pt_param3 not in", values, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3Between(String value1, String value2) {
            addCriterion("pt_param3 between", value1, value2, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam3NotBetween(String value1, String value2) {
            addCriterion("pt_param3 not between", value1, value2, "ptParam3");
            return (Criteria) this;
        }

        public Criteria andPtParam4IsNull() {
            addCriterion("pt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPtParam4IsNotNull() {
            addCriterion("pt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPtParam4EqualTo(String value) {
            addCriterion("pt_param4 =", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4NotEqualTo(String value) {
            addCriterion("pt_param4 <>", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4GreaterThan(String value) {
            addCriterion("pt_param4 >", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("pt_param4 >=", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4LessThan(String value) {
            addCriterion("pt_param4 <", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4LessThanOrEqualTo(String value) {
            addCriterion("pt_param4 <=", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4Like(String value) {
            addCriterion("pt_param4 like", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4NotLike(String value) {
            addCriterion("pt_param4 not like", value, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4In(List<String> values) {
            addCriterion("pt_param4 in", values, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4NotIn(List<String> values) {
            addCriterion("pt_param4 not in", values, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4Between(String value1, String value2) {
            addCriterion("pt_param4 between", value1, value2, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam4NotBetween(String value1, String value2) {
            addCriterion("pt_param4 not between", value1, value2, "ptParam4");
            return (Criteria) this;
        }

        public Criteria andPtParam5IsNull() {
            addCriterion("pt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPtParam5IsNotNull() {
            addCriterion("pt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPtParam5EqualTo(String value) {
            addCriterion("pt_param5 =", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5NotEqualTo(String value) {
            addCriterion("pt_param5 <>", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5GreaterThan(String value) {
            addCriterion("pt_param5 >", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("pt_param5 >=", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5LessThan(String value) {
            addCriterion("pt_param5 <", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5LessThanOrEqualTo(String value) {
            addCriterion("pt_param5 <=", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5Like(String value) {
            addCriterion("pt_param5 like", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5NotLike(String value) {
            addCriterion("pt_param5 not like", value, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5In(List<String> values) {
            addCriterion("pt_param5 in", values, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5NotIn(List<String> values) {
            addCriterion("pt_param5 not in", values, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5Between(String value1, String value2) {
            addCriterion("pt_param5 between", value1, value2, "ptParam5");
            return (Criteria) this;
        }

        public Criteria andPtParam5NotBetween(String value1, String value2) {
            addCriterion("pt_param5 not between", value1, value2, "ptParam5");
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
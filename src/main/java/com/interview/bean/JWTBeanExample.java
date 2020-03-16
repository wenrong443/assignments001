package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class JWTBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JWTBeanExample() {
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

        public Criteria andJtIdIsNull() {
            addCriterion("jt_id is null");
            return (Criteria) this;
        }

        public Criteria andJtIdIsNotNull() {
            addCriterion("jt_id is not null");
            return (Criteria) this;
        }

        public Criteria andJtIdEqualTo(Integer value) {
            addCriterion("jt_id =", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotEqualTo(Integer value) {
            addCriterion("jt_id <>", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdGreaterThan(Integer value) {
            addCriterion("jt_id >", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jt_id >=", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdLessThan(Integer value) {
            addCriterion("jt_id <", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdLessThanOrEqualTo(Integer value) {
            addCriterion("jt_id <=", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdIn(List<Integer> values) {
            addCriterion("jt_id in", values, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotIn(List<Integer> values) {
            addCriterion("jt_id not in", values, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdBetween(Integer value1, Integer value2) {
            addCriterion("jt_id between", value1, value2, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jt_id not between", value1, value2, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdIsNull() {
            addCriterion("jt_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andJtUtIdIsNotNull() {
            addCriterion("jt_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andJtUtIdEqualTo(Long value) {
            addCriterion("jt_ut_id =", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdNotEqualTo(Long value) {
            addCriterion("jt_ut_id <>", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdGreaterThan(Long value) {
            addCriterion("jt_ut_id >", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("jt_ut_id >=", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdLessThan(Long value) {
            addCriterion("jt_ut_id <", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdLessThanOrEqualTo(Long value) {
            addCriterion("jt_ut_id <=", value, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdIn(List<Long> values) {
            addCriterion("jt_ut_id in", values, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdNotIn(List<Long> values) {
            addCriterion("jt_ut_id not in", values, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdBetween(Long value1, Long value2) {
            addCriterion("jt_ut_id between", value1, value2, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtUtIdNotBetween(Long value1, Long value2) {
            addCriterion("jt_ut_id not between", value1, value2, "jtUtId");
            return (Criteria) this;
        }

        public Criteria andJtTokenIsNull() {
            addCriterion("jt_token is null");
            return (Criteria) this;
        }

        public Criteria andJtTokenIsNotNull() {
            addCriterion("jt_token is not null");
            return (Criteria) this;
        }

        public Criteria andJtTokenEqualTo(String value) {
            addCriterion("jt_token =", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenNotEqualTo(String value) {
            addCriterion("jt_token <>", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenGreaterThan(String value) {
            addCriterion("jt_token >", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenGreaterThanOrEqualTo(String value) {
            addCriterion("jt_token >=", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenLessThan(String value) {
            addCriterion("jt_token <", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenLessThanOrEqualTo(String value) {
            addCriterion("jt_token <=", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenLike(String value) {
            addCriterion("jt_token like", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenNotLike(String value) {
            addCriterion("jt_token not like", value, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenIn(List<String> values) {
            addCriterion("jt_token in", values, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenNotIn(List<String> values) {
            addCriterion("jt_token not in", values, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenBetween(String value1, String value2) {
            addCriterion("jt_token between", value1, value2, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtTokenNotBetween(String value1, String value2) {
            addCriterion("jt_token not between", value1, value2, "jtToken");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnIsNull() {
            addCriterion("jt_expired_on is null");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnIsNotNull() {
            addCriterion("jt_expired_on is not null");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnEqualTo(Long value) {
            addCriterion("jt_expired_on =", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnNotEqualTo(Long value) {
            addCriterion("jt_expired_on <>", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnGreaterThan(Long value) {
            addCriterion("jt_expired_on >", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnGreaterThanOrEqualTo(Long value) {
            addCriterion("jt_expired_on >=", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnLessThan(Long value) {
            addCriterion("jt_expired_on <", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnLessThanOrEqualTo(Long value) {
            addCriterion("jt_expired_on <=", value, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnIn(List<Long> values) {
            addCriterion("jt_expired_on in", values, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnNotIn(List<Long> values) {
            addCriterion("jt_expired_on not in", values, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnBetween(Long value1, Long value2) {
            addCriterion("jt_expired_on between", value1, value2, "jtExpiredOn");
            return (Criteria) this;
        }

        public Criteria andJtExpiredOnNotBetween(Long value1, Long value2) {
            addCriterion("jt_expired_on not between", value1, value2, "jtExpiredOn");
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
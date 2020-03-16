package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class CategoryBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryBeanExample() {
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

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdIsNull() {
            addCriterion("ct_parent_ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdIsNotNull() {
            addCriterion("ct_parent_ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdEqualTo(Integer value) {
            addCriterion("ct_parent_ct_id =", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdNotEqualTo(Integer value) {
            addCriterion("ct_parent_ct_id <>", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdGreaterThan(Integer value) {
            addCriterion("ct_parent_ct_id >", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_parent_ct_id >=", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdLessThan(Integer value) {
            addCriterion("ct_parent_ct_id <", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_parent_ct_id <=", value, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdIn(List<Integer> values) {
            addCriterion("ct_parent_ct_id in", values, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdNotIn(List<Integer> values) {
            addCriterion("ct_parent_ct_id not in", values, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_parent_ct_id between", value1, value2, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtParentCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_parent_ct_id not between", value1, value2, "ctParentCtId");
            return (Criteria) this;
        }

        public Criteria andCtTitleIsNull() {
            addCriterion("ct_title is null");
            return (Criteria) this;
        }

        public Criteria andCtTitleIsNotNull() {
            addCriterion("ct_title is not null");
            return (Criteria) this;
        }

        public Criteria andCtTitleEqualTo(String value) {
            addCriterion("ct_title =", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleNotEqualTo(String value) {
            addCriterion("ct_title <>", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleGreaterThan(String value) {
            addCriterion("ct_title >", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ct_title >=", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleLessThan(String value) {
            addCriterion("ct_title <", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleLessThanOrEqualTo(String value) {
            addCriterion("ct_title <=", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleLike(String value) {
            addCriterion("ct_title like", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleNotLike(String value) {
            addCriterion("ct_title not like", value, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleIn(List<String> values) {
            addCriterion("ct_title in", values, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleNotIn(List<String> values) {
            addCriterion("ct_title not in", values, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleBetween(String value1, String value2) {
            addCriterion("ct_title between", value1, value2, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtTitleNotBetween(String value1, String value2) {
            addCriterion("ct_title not between", value1, value2, "ctTitle");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNull() {
            addCriterion("ct_status is null");
            return (Criteria) this;
        }

        public Criteria andCtStatusIsNotNull() {
            addCriterion("ct_status is not null");
            return (Criteria) this;
        }

        public Criteria andCtStatusEqualTo(Integer value) {
            addCriterion("ct_status =", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotEqualTo(Integer value) {
            addCriterion("ct_status <>", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThan(Integer value) {
            addCriterion("ct_status >", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_status >=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThan(Integer value) {
            addCriterion("ct_status <", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ct_status <=", value, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusIn(List<Integer> values) {
            addCriterion("ct_status in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotIn(List<Integer> values) {
            addCriterion("ct_status not in", values, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusBetween(Integer value1, Integer value2) {
            addCriterion("ct_status between", value1, value2, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_status not between", value1, value2, "ctStatus");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNull() {
            addCriterion("ct_param1 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam1IsNotNull() {
            addCriterion("ct_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam1EqualTo(String value) {
            addCriterion("ct_param1 =", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotEqualTo(String value) {
            addCriterion("ct_param1 <>", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThan(String value) {
            addCriterion("ct_param1 >", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param1 >=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThan(String value) {
            addCriterion("ct_param1 <", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1LessThanOrEqualTo(String value) {
            addCriterion("ct_param1 <=", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Like(String value) {
            addCriterion("ct_param1 like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotLike(String value) {
            addCriterion("ct_param1 not like", value, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1In(List<String> values) {
            addCriterion("ct_param1 in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotIn(List<String> values) {
            addCriterion("ct_param1 not in", values, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1Between(String value1, String value2) {
            addCriterion("ct_param1 between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam1NotBetween(String value1, String value2) {
            addCriterion("ct_param1 not between", value1, value2, "ctParam1");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNull() {
            addCriterion("ct_param2 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam2IsNotNull() {
            addCriterion("ct_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam2EqualTo(String value) {
            addCriterion("ct_param2 =", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotEqualTo(String value) {
            addCriterion("ct_param2 <>", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThan(String value) {
            addCriterion("ct_param2 >", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param2 >=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThan(String value) {
            addCriterion("ct_param2 <", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2LessThanOrEqualTo(String value) {
            addCriterion("ct_param2 <=", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Like(String value) {
            addCriterion("ct_param2 like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotLike(String value) {
            addCriterion("ct_param2 not like", value, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2In(List<String> values) {
            addCriterion("ct_param2 in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotIn(List<String> values) {
            addCriterion("ct_param2 not in", values, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2Between(String value1, String value2) {
            addCriterion("ct_param2 between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam2NotBetween(String value1, String value2) {
            addCriterion("ct_param2 not between", value1, value2, "ctParam2");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNull() {
            addCriterion("ct_param3 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam3IsNotNull() {
            addCriterion("ct_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam3EqualTo(String value) {
            addCriterion("ct_param3 =", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotEqualTo(String value) {
            addCriterion("ct_param3 <>", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThan(String value) {
            addCriterion("ct_param3 >", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param3 >=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThan(String value) {
            addCriterion("ct_param3 <", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3LessThanOrEqualTo(String value) {
            addCriterion("ct_param3 <=", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Like(String value) {
            addCriterion("ct_param3 like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotLike(String value) {
            addCriterion("ct_param3 not like", value, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3In(List<String> values) {
            addCriterion("ct_param3 in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotIn(List<String> values) {
            addCriterion("ct_param3 not in", values, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3Between(String value1, String value2) {
            addCriterion("ct_param3 between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam3NotBetween(String value1, String value2) {
            addCriterion("ct_param3 not between", value1, value2, "ctParam3");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNull() {
            addCriterion("ct_param4 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam4IsNotNull() {
            addCriterion("ct_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam4EqualTo(String value) {
            addCriterion("ct_param4 =", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotEqualTo(String value) {
            addCriterion("ct_param4 <>", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThan(String value) {
            addCriterion("ct_param4 >", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param4 >=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThan(String value) {
            addCriterion("ct_param4 <", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4LessThanOrEqualTo(String value) {
            addCriterion("ct_param4 <=", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Like(String value) {
            addCriterion("ct_param4 like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotLike(String value) {
            addCriterion("ct_param4 not like", value, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4In(List<String> values) {
            addCriterion("ct_param4 in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotIn(List<String> values) {
            addCriterion("ct_param4 not in", values, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4Between(String value1, String value2) {
            addCriterion("ct_param4 between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam4NotBetween(String value1, String value2) {
            addCriterion("ct_param4 not between", value1, value2, "ctParam4");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNull() {
            addCriterion("ct_param5 is null");
            return (Criteria) this;
        }

        public Criteria andCtParam5IsNotNull() {
            addCriterion("ct_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andCtParam5EqualTo(String value) {
            addCriterion("ct_param5 =", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotEqualTo(String value) {
            addCriterion("ct_param5 <>", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThan(String value) {
            addCriterion("ct_param5 >", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("ct_param5 >=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThan(String value) {
            addCriterion("ct_param5 <", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5LessThanOrEqualTo(String value) {
            addCriterion("ct_param5 <=", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Like(String value) {
            addCriterion("ct_param5 like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotLike(String value) {
            addCriterion("ct_param5 not like", value, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5In(List<String> values) {
            addCriterion("ct_param5 in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotIn(List<String> values) {
            addCriterion("ct_param5 not in", values, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5Between(String value1, String value2) {
            addCriterion("ct_param5 between", value1, value2, "ctParam5");
            return (Criteria) this;
        }

        public Criteria andCtParam5NotBetween(String value1, String value2) {
            addCriterion("ct_param5 not between", value1, value2, "ctParam5");
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
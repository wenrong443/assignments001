package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class RoleBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleBeanExample() {
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

        public Criteria andRtIdIsNull() {
            addCriterion("rt_id is null");
            return (Criteria) this;
        }

        public Criteria andRtIdIsNotNull() {
            addCriterion("rt_id is not null");
            return (Criteria) this;
        }

        public Criteria andRtIdEqualTo(Integer value) {
            addCriterion("rt_id =", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotEqualTo(Integer value) {
            addCriterion("rt_id <>", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdGreaterThan(Integer value) {
            addCriterion("rt_id >", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt_id >=", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdLessThan(Integer value) {
            addCriterion("rt_id <", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdLessThanOrEqualTo(Integer value) {
            addCriterion("rt_id <=", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdIn(List<Integer> values) {
            addCriterion("rt_id in", values, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotIn(List<Integer> values) {
            addCriterion("rt_id not in", values, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdBetween(Integer value1, Integer value2) {
            addCriterion("rt_id between", value1, value2, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rt_id not between", value1, value2, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdIsNull() {
            addCriterion("rt_ut_id is null");
            return (Criteria) this;
        }

        public Criteria andRtUtIdIsNotNull() {
            addCriterion("rt_ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andRtUtIdEqualTo(String value) {
            addCriterion("rt_ut_id =", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdNotEqualTo(String value) {
            addCriterion("rt_ut_id <>", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdGreaterThan(String value) {
            addCriterion("rt_ut_id >", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdGreaterThanOrEqualTo(String value) {
            addCriterion("rt_ut_id >=", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdLessThan(String value) {
            addCriterion("rt_ut_id <", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdLessThanOrEqualTo(String value) {
            addCriterion("rt_ut_id <=", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdLike(String value) {
            addCriterion("rt_ut_id like", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdNotLike(String value) {
            addCriterion("rt_ut_id not like", value, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdIn(List<String> values) {
            addCriterion("rt_ut_id in", values, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdNotIn(List<String> values) {
            addCriterion("rt_ut_id not in", values, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdBetween(String value1, String value2) {
            addCriterion("rt_ut_id between", value1, value2, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtUtIdNotBetween(String value1, String value2) {
            addCriterion("rt_ut_id not between", value1, value2, "rtUtId");
            return (Criteria) this;
        }

        public Criteria andRtNameIsNull() {
            addCriterion("rt_name is null");
            return (Criteria) this;
        }

        public Criteria andRtNameIsNotNull() {
            addCriterion("rt_name is not null");
            return (Criteria) this;
        }

        public Criteria andRtNameEqualTo(String value) {
            addCriterion("rt_name =", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotEqualTo(String value) {
            addCriterion("rt_name <>", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameGreaterThan(String value) {
            addCriterion("rt_name >", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameGreaterThanOrEqualTo(String value) {
            addCriterion("rt_name >=", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLessThan(String value) {
            addCriterion("rt_name <", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLessThanOrEqualTo(String value) {
            addCriterion("rt_name <=", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLike(String value) {
            addCriterion("rt_name like", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotLike(String value) {
            addCriterion("rt_name not like", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameIn(List<String> values) {
            addCriterion("rt_name in", values, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotIn(List<String> values) {
            addCriterion("rt_name not in", values, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameBetween(String value1, String value2) {
            addCriterion("rt_name between", value1, value2, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotBetween(String value1, String value2) {
            addCriterion("rt_name not between", value1, value2, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionIsNull() {
            addCriterion("rt_description is null");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionIsNotNull() {
            addCriterion("rt_description is not null");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionEqualTo(String value) {
            addCriterion("rt_description =", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionNotEqualTo(String value) {
            addCriterion("rt_description <>", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionGreaterThan(String value) {
            addCriterion("rt_description >", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("rt_description >=", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionLessThan(String value) {
            addCriterion("rt_description <", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionLessThanOrEqualTo(String value) {
            addCriterion("rt_description <=", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionLike(String value) {
            addCriterion("rt_description like", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionNotLike(String value) {
            addCriterion("rt_description not like", value, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionIn(List<String> values) {
            addCriterion("rt_description in", values, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionNotIn(List<String> values) {
            addCriterion("rt_description not in", values, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionBetween(String value1, String value2) {
            addCriterion("rt_description between", value1, value2, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtDescriptionNotBetween(String value1, String value2) {
            addCriterion("rt_description not between", value1, value2, "rtDescription");
            return (Criteria) this;
        }

        public Criteria andRtParam1IsNull() {
            addCriterion("rt_param1 is null");
            return (Criteria) this;
        }

        public Criteria andRtParam1IsNotNull() {
            addCriterion("rt_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andRtParam1EqualTo(String value) {
            addCriterion("rt_param1 =", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1NotEqualTo(String value) {
            addCriterion("rt_param1 <>", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1GreaterThan(String value) {
            addCriterion("rt_param1 >", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("rt_param1 >=", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1LessThan(String value) {
            addCriterion("rt_param1 <", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1LessThanOrEqualTo(String value) {
            addCriterion("rt_param1 <=", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1Like(String value) {
            addCriterion("rt_param1 like", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1NotLike(String value) {
            addCriterion("rt_param1 not like", value, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1In(List<String> values) {
            addCriterion("rt_param1 in", values, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1NotIn(List<String> values) {
            addCriterion("rt_param1 not in", values, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1Between(String value1, String value2) {
            addCriterion("rt_param1 between", value1, value2, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam1NotBetween(String value1, String value2) {
            addCriterion("rt_param1 not between", value1, value2, "rtParam1");
            return (Criteria) this;
        }

        public Criteria andRtParam2IsNull() {
            addCriterion("rt_param2 is null");
            return (Criteria) this;
        }

        public Criteria andRtParam2IsNotNull() {
            addCriterion("rt_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andRtParam2EqualTo(String value) {
            addCriterion("rt_param2 =", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2NotEqualTo(String value) {
            addCriterion("rt_param2 <>", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2GreaterThan(String value) {
            addCriterion("rt_param2 >", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("rt_param2 >=", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2LessThan(String value) {
            addCriterion("rt_param2 <", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2LessThanOrEqualTo(String value) {
            addCriterion("rt_param2 <=", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2Like(String value) {
            addCriterion("rt_param2 like", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2NotLike(String value) {
            addCriterion("rt_param2 not like", value, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2In(List<String> values) {
            addCriterion("rt_param2 in", values, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2NotIn(List<String> values) {
            addCriterion("rt_param2 not in", values, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2Between(String value1, String value2) {
            addCriterion("rt_param2 between", value1, value2, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam2NotBetween(String value1, String value2) {
            addCriterion("rt_param2 not between", value1, value2, "rtParam2");
            return (Criteria) this;
        }

        public Criteria andRtParam3IsNull() {
            addCriterion("rt_param3 is null");
            return (Criteria) this;
        }

        public Criteria andRtParam3IsNotNull() {
            addCriterion("rt_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andRtParam3EqualTo(String value) {
            addCriterion("rt_param3 =", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3NotEqualTo(String value) {
            addCriterion("rt_param3 <>", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3GreaterThan(String value) {
            addCriterion("rt_param3 >", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("rt_param3 >=", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3LessThan(String value) {
            addCriterion("rt_param3 <", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3LessThanOrEqualTo(String value) {
            addCriterion("rt_param3 <=", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3Like(String value) {
            addCriterion("rt_param3 like", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3NotLike(String value) {
            addCriterion("rt_param3 not like", value, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3In(List<String> values) {
            addCriterion("rt_param3 in", values, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3NotIn(List<String> values) {
            addCriterion("rt_param3 not in", values, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3Between(String value1, String value2) {
            addCriterion("rt_param3 between", value1, value2, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam3NotBetween(String value1, String value2) {
            addCriterion("rt_param3 not between", value1, value2, "rtParam3");
            return (Criteria) this;
        }

        public Criteria andRtParam4IsNull() {
            addCriterion("rt_param4 is null");
            return (Criteria) this;
        }

        public Criteria andRtParam4IsNotNull() {
            addCriterion("rt_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andRtParam4EqualTo(String value) {
            addCriterion("rt_param4 =", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4NotEqualTo(String value) {
            addCriterion("rt_param4 <>", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4GreaterThan(String value) {
            addCriterion("rt_param4 >", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("rt_param4 >=", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4LessThan(String value) {
            addCriterion("rt_param4 <", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4LessThanOrEqualTo(String value) {
            addCriterion("rt_param4 <=", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4Like(String value) {
            addCriterion("rt_param4 like", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4NotLike(String value) {
            addCriterion("rt_param4 not like", value, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4In(List<String> values) {
            addCriterion("rt_param4 in", values, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4NotIn(List<String> values) {
            addCriterion("rt_param4 not in", values, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4Between(String value1, String value2) {
            addCriterion("rt_param4 between", value1, value2, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam4NotBetween(String value1, String value2) {
            addCriterion("rt_param4 not between", value1, value2, "rtParam4");
            return (Criteria) this;
        }

        public Criteria andRtParam5IsNull() {
            addCriterion("rt_param5 is null");
            return (Criteria) this;
        }

        public Criteria andRtParam5IsNotNull() {
            addCriterion("rt_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andRtParam5EqualTo(String value) {
            addCriterion("rt_param5 =", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5NotEqualTo(String value) {
            addCriterion("rt_param5 <>", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5GreaterThan(String value) {
            addCriterion("rt_param5 >", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("rt_param5 >=", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5LessThan(String value) {
            addCriterion("rt_param5 <", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5LessThanOrEqualTo(String value) {
            addCriterion("rt_param5 <=", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5Like(String value) {
            addCriterion("rt_param5 like", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5NotLike(String value) {
            addCriterion("rt_param5 not like", value, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5In(List<String> values) {
            addCriterion("rt_param5 in", values, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5NotIn(List<String> values) {
            addCriterion("rt_param5 not in", values, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5Between(String value1, String value2) {
            addCriterion("rt_param5 between", value1, value2, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtParam5NotBetween(String value1, String value2) {
            addCriterion("rt_param5 not between", value1, value2, "rtParam5");
            return (Criteria) this;
        }

        public Criteria andRtStatusIsNull() {
            addCriterion("rt_status is null");
            return (Criteria) this;
        }

        public Criteria andRtStatusIsNotNull() {
            addCriterion("rt_status is not null");
            return (Criteria) this;
        }

        public Criteria andRtStatusEqualTo(Integer value) {
            addCriterion("rt_status =", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusNotEqualTo(Integer value) {
            addCriterion("rt_status <>", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusGreaterThan(Integer value) {
            addCriterion("rt_status >", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt_status >=", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusLessThan(Integer value) {
            addCriterion("rt_status <", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rt_status <=", value, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusIn(List<Integer> values) {
            addCriterion("rt_status in", values, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusNotIn(List<Integer> values) {
            addCriterion("rt_status not in", values, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusBetween(Integer value1, Integer value2) {
            addCriterion("rt_status between", value1, value2, "rtStatus");
            return (Criteria) this;
        }

        public Criteria andRtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rt_status not between", value1, value2, "rtStatus");
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
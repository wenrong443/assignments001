package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBeanExample() {
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

        public Criteria andUtIdIsNull() {
            addCriterion("ut_id is null");
            return (Criteria) this;
        }

        public Criteria andUtIdIsNotNull() {
            addCriterion("ut_id is not null");
            return (Criteria) this;
        }

        public Criteria andUtIdEqualTo(Integer value) {
            addCriterion("ut_id =", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdNotEqualTo(Integer value) {
            addCriterion("ut_id <>", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdGreaterThan(Integer value) {
            addCriterion("ut_id >", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ut_id >=", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdLessThan(Integer value) {
            addCriterion("ut_id <", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ut_id <=", value, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdIn(List<Integer> values) {
            addCriterion("ut_id in", values, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdNotIn(List<Integer> values) {
            addCriterion("ut_id not in", values, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdBetween(Integer value1, Integer value2) {
            addCriterion("ut_id between", value1, value2, "utId");
            return (Criteria) this;
        }

        public Criteria andUtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ut_id not between", value1, value2, "utId");
            return (Criteria) this;
        }

        public Criteria andUtEmailIsNull() {
            addCriterion("ut_email is null");
            return (Criteria) this;
        }

        public Criteria andUtEmailIsNotNull() {
            addCriterion("ut_email is not null");
            return (Criteria) this;
        }

        public Criteria andUtEmailEqualTo(String value) {
            addCriterion("ut_email =", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailNotEqualTo(String value) {
            addCriterion("ut_email <>", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailGreaterThan(String value) {
            addCriterion("ut_email >", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ut_email >=", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailLessThan(String value) {
            addCriterion("ut_email <", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailLessThanOrEqualTo(String value) {
            addCriterion("ut_email <=", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailLike(String value) {
            addCriterion("ut_email like", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailNotLike(String value) {
            addCriterion("ut_email not like", value, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailIn(List<String> values) {
            addCriterion("ut_email in", values, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailNotIn(List<String> values) {
            addCriterion("ut_email not in", values, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailBetween(String value1, String value2) {
            addCriterion("ut_email between", value1, value2, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtEmailNotBetween(String value1, String value2) {
            addCriterion("ut_email not between", value1, value2, "utEmail");
            return (Criteria) this;
        }

        public Criteria andUtPasswordIsNull() {
            addCriterion("ut_password is null");
            return (Criteria) this;
        }

        public Criteria andUtPasswordIsNotNull() {
            addCriterion("ut_password is not null");
            return (Criteria) this;
        }

        public Criteria andUtPasswordEqualTo(String value) {
            addCriterion("ut_password =", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordNotEqualTo(String value) {
            addCriterion("ut_password <>", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordGreaterThan(String value) {
            addCriterion("ut_password >", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ut_password >=", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordLessThan(String value) {
            addCriterion("ut_password <", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordLessThanOrEqualTo(String value) {
            addCriterion("ut_password <=", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordLike(String value) {
            addCriterion("ut_password like", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordNotLike(String value) {
            addCriterion("ut_password not like", value, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordIn(List<String> values) {
            addCriterion("ut_password in", values, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordNotIn(List<String> values) {
            addCriterion("ut_password not in", values, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordBetween(String value1, String value2) {
            addCriterion("ut_password between", value1, value2, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtPasswordNotBetween(String value1, String value2) {
            addCriterion("ut_password not between", value1, value2, "utPassword");
            return (Criteria) this;
        }

        public Criteria andUtParam1IsNull() {
            addCriterion("ut_param1 is null");
            return (Criteria) this;
        }

        public Criteria andUtParam1IsNotNull() {
            addCriterion("ut_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andUtParam1EqualTo(String value) {
            addCriterion("ut_param1 =", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1NotEqualTo(String value) {
            addCriterion("ut_param1 <>", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1GreaterThan(String value) {
            addCriterion("ut_param1 >", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1GreaterThanOrEqualTo(String value) {
            addCriterion("ut_param1 >=", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1LessThan(String value) {
            addCriterion("ut_param1 <", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1LessThanOrEqualTo(String value) {
            addCriterion("ut_param1 <=", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1Like(String value) {
            addCriterion("ut_param1 like", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1NotLike(String value) {
            addCriterion("ut_param1 not like", value, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1In(List<String> values) {
            addCriterion("ut_param1 in", values, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1NotIn(List<String> values) {
            addCriterion("ut_param1 not in", values, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1Between(String value1, String value2) {
            addCriterion("ut_param1 between", value1, value2, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam1NotBetween(String value1, String value2) {
            addCriterion("ut_param1 not between", value1, value2, "utParam1");
            return (Criteria) this;
        }

        public Criteria andUtParam2IsNull() {
            addCriterion("ut_param2 is null");
            return (Criteria) this;
        }

        public Criteria andUtParam2IsNotNull() {
            addCriterion("ut_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andUtParam2EqualTo(String value) {
            addCriterion("ut_param2 =", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2NotEqualTo(String value) {
            addCriterion("ut_param2 <>", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2GreaterThan(String value) {
            addCriterion("ut_param2 >", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2GreaterThanOrEqualTo(String value) {
            addCriterion("ut_param2 >=", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2LessThan(String value) {
            addCriterion("ut_param2 <", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2LessThanOrEqualTo(String value) {
            addCriterion("ut_param2 <=", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2Like(String value) {
            addCriterion("ut_param2 like", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2NotLike(String value) {
            addCriterion("ut_param2 not like", value, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2In(List<String> values) {
            addCriterion("ut_param2 in", values, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2NotIn(List<String> values) {
            addCriterion("ut_param2 not in", values, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2Between(String value1, String value2) {
            addCriterion("ut_param2 between", value1, value2, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam2NotBetween(String value1, String value2) {
            addCriterion("ut_param2 not between", value1, value2, "utParam2");
            return (Criteria) this;
        }

        public Criteria andUtParam3IsNull() {
            addCriterion("ut_param3 is null");
            return (Criteria) this;
        }

        public Criteria andUtParam3IsNotNull() {
            addCriterion("ut_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andUtParam3EqualTo(String value) {
            addCriterion("ut_param3 =", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3NotEqualTo(String value) {
            addCriterion("ut_param3 <>", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3GreaterThan(String value) {
            addCriterion("ut_param3 >", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3GreaterThanOrEqualTo(String value) {
            addCriterion("ut_param3 >=", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3LessThan(String value) {
            addCriterion("ut_param3 <", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3LessThanOrEqualTo(String value) {
            addCriterion("ut_param3 <=", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3Like(String value) {
            addCriterion("ut_param3 like", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3NotLike(String value) {
            addCriterion("ut_param3 not like", value, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3In(List<String> values) {
            addCriterion("ut_param3 in", values, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3NotIn(List<String> values) {
            addCriterion("ut_param3 not in", values, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3Between(String value1, String value2) {
            addCriterion("ut_param3 between", value1, value2, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam3NotBetween(String value1, String value2) {
            addCriterion("ut_param3 not between", value1, value2, "utParam3");
            return (Criteria) this;
        }

        public Criteria andUtParam4IsNull() {
            addCriterion("ut_param4 is null");
            return (Criteria) this;
        }

        public Criteria andUtParam4IsNotNull() {
            addCriterion("ut_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andUtParam4EqualTo(String value) {
            addCriterion("ut_param4 =", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4NotEqualTo(String value) {
            addCriterion("ut_param4 <>", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4GreaterThan(String value) {
            addCriterion("ut_param4 >", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4GreaterThanOrEqualTo(String value) {
            addCriterion("ut_param4 >=", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4LessThan(String value) {
            addCriterion("ut_param4 <", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4LessThanOrEqualTo(String value) {
            addCriterion("ut_param4 <=", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4Like(String value) {
            addCriterion("ut_param4 like", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4NotLike(String value) {
            addCriterion("ut_param4 not like", value, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4In(List<String> values) {
            addCriterion("ut_param4 in", values, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4NotIn(List<String> values) {
            addCriterion("ut_param4 not in", values, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4Between(String value1, String value2) {
            addCriterion("ut_param4 between", value1, value2, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam4NotBetween(String value1, String value2) {
            addCriterion("ut_param4 not between", value1, value2, "utParam4");
            return (Criteria) this;
        }

        public Criteria andUtParam5IsNull() {
            addCriterion("ut_param5 is null");
            return (Criteria) this;
        }

        public Criteria andUtParam5IsNotNull() {
            addCriterion("ut_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andUtParam5EqualTo(String value) {
            addCriterion("ut_param5 =", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5NotEqualTo(String value) {
            addCriterion("ut_param5 <>", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5GreaterThan(String value) {
            addCriterion("ut_param5 >", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5GreaterThanOrEqualTo(String value) {
            addCriterion("ut_param5 >=", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5LessThan(String value) {
            addCriterion("ut_param5 <", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5LessThanOrEqualTo(String value) {
            addCriterion("ut_param5 <=", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5Like(String value) {
            addCriterion("ut_param5 like", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5NotLike(String value) {
            addCriterion("ut_param5 not like", value, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5In(List<String> values) {
            addCriterion("ut_param5 in", values, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5NotIn(List<String> values) {
            addCriterion("ut_param5 not in", values, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5Between(String value1, String value2) {
            addCriterion("ut_param5 between", value1, value2, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtParam5NotBetween(String value1, String value2) {
            addCriterion("ut_param5 not between", value1, value2, "utParam5");
            return (Criteria) this;
        }

        public Criteria andUtStatusIsNull() {
            addCriterion("ut_status is null");
            return (Criteria) this;
        }

        public Criteria andUtStatusIsNotNull() {
            addCriterion("ut_status is not null");
            return (Criteria) this;
        }

        public Criteria andUtStatusEqualTo(Integer value) {
            addCriterion("ut_status =", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusNotEqualTo(Integer value) {
            addCriterion("ut_status <>", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusGreaterThan(Integer value) {
            addCriterion("ut_status >", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ut_status >=", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusLessThan(Integer value) {
            addCriterion("ut_status <", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ut_status <=", value, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusIn(List<Integer> values) {
            addCriterion("ut_status in", values, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusNotIn(List<Integer> values) {
            addCriterion("ut_status not in", values, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusBetween(Integer value1, Integer value2) {
            addCriterion("ut_status between", value1, value2, "utStatus");
            return (Criteria) this;
        }

        public Criteria andUtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ut_status not between", value1, value2, "utStatus");
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
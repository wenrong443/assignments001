package com.interview.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductImageBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductImageBeanExample() {
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

        public Criteria andPitIdIsNull() {
            addCriterion("pit_id is null");
            return (Criteria) this;
        }

        public Criteria andPitIdIsNotNull() {
            addCriterion("pit_id is not null");
            return (Criteria) this;
        }

        public Criteria andPitIdEqualTo(Integer value) {
            addCriterion("pit_id =", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotEqualTo(Integer value) {
            addCriterion("pit_id <>", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdGreaterThan(Integer value) {
            addCriterion("pit_id >", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pit_id >=", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdLessThan(Integer value) {
            addCriterion("pit_id <", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdLessThanOrEqualTo(Integer value) {
            addCriterion("pit_id <=", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdIn(List<Integer> values) {
            addCriterion("pit_id in", values, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotIn(List<Integer> values) {
            addCriterion("pit_id not in", values, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdBetween(Integer value1, Integer value2) {
            addCriterion("pit_id between", value1, value2, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pit_id not between", value1, value2, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitPathIsNull() {
            addCriterion("pit_path is null");
            return (Criteria) this;
        }

        public Criteria andPitPathIsNotNull() {
            addCriterion("pit_path is not null");
            return (Criteria) this;
        }

        public Criteria andPitPathEqualTo(String value) {
            addCriterion("pit_path =", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathNotEqualTo(String value) {
            addCriterion("pit_path <>", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathGreaterThan(String value) {
            addCriterion("pit_path >", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathGreaterThanOrEqualTo(String value) {
            addCriterion("pit_path >=", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathLessThan(String value) {
            addCriterion("pit_path <", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathLessThanOrEqualTo(String value) {
            addCriterion("pit_path <=", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathLike(String value) {
            addCriterion("pit_path like", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathNotLike(String value) {
            addCriterion("pit_path not like", value, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathIn(List<String> values) {
            addCriterion("pit_path in", values, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathNotIn(List<String> values) {
            addCriterion("pit_path not in", values, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathBetween(String value1, String value2) {
            addCriterion("pit_path between", value1, value2, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPathNotBetween(String value1, String value2) {
            addCriterion("pit_path not between", value1, value2, "pitPath");
            return (Criteria) this;
        }

        public Criteria andPitPtIdIsNull() {
            addCriterion("pit_pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPitPtIdIsNotNull() {
            addCriterion("pit_pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPitPtIdEqualTo(Integer value) {
            addCriterion("pit_pt_id =", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdNotEqualTo(Integer value) {
            addCriterion("pit_pt_id <>", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdGreaterThan(Integer value) {
            addCriterion("pit_pt_id >", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pit_pt_id >=", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdLessThan(Integer value) {
            addCriterion("pit_pt_id <", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pit_pt_id <=", value, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdIn(List<Integer> values) {
            addCriterion("pit_pt_id in", values, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdNotIn(List<Integer> values) {
            addCriterion("pit_pt_id not in", values, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdBetween(Integer value1, Integer value2) {
            addCriterion("pit_pt_id between", value1, value2, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pit_pt_id not between", value1, value2, "pitPtId");
            return (Criteria) this;
        }

        public Criteria andPitStatusIsNull() {
            addCriterion("pit_status is null");
            return (Criteria) this;
        }

        public Criteria andPitStatusIsNotNull() {
            addCriterion("pit_status is not null");
            return (Criteria) this;
        }

        public Criteria andPitStatusEqualTo(Integer value) {
            addCriterion("pit_status =", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusNotEqualTo(Integer value) {
            addCriterion("pit_status <>", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusGreaterThan(Integer value) {
            addCriterion("pit_status >", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pit_status >=", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusLessThan(Integer value) {
            addCriterion("pit_status <", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pit_status <=", value, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusIn(List<Integer> values) {
            addCriterion("pit_status in", values, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusNotIn(List<Integer> values) {
            addCriterion("pit_status not in", values, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusBetween(Integer value1, Integer value2) {
            addCriterion("pit_status between", value1, value2, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pit_status not between", value1, value2, "pitStatus");
            return (Criteria) this;
        }

        public Criteria andPitParam1IsNull() {
            addCriterion("pit_param1 is null");
            return (Criteria) this;
        }

        public Criteria andPitParam1IsNotNull() {
            addCriterion("pit_param1 is not null");
            return (Criteria) this;
        }

        public Criteria andPitParam1EqualTo(String value) {
            addCriterion("pit_param1 =", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1NotEqualTo(String value) {
            addCriterion("pit_param1 <>", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1GreaterThan(String value) {
            addCriterion("pit_param1 >", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1GreaterThanOrEqualTo(String value) {
            addCriterion("pit_param1 >=", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1LessThan(String value) {
            addCriterion("pit_param1 <", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1LessThanOrEqualTo(String value) {
            addCriterion("pit_param1 <=", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1Like(String value) {
            addCriterion("pit_param1 like", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1NotLike(String value) {
            addCriterion("pit_param1 not like", value, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1In(List<String> values) {
            addCriterion("pit_param1 in", values, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1NotIn(List<String> values) {
            addCriterion("pit_param1 not in", values, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1Between(String value1, String value2) {
            addCriterion("pit_param1 between", value1, value2, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam1NotBetween(String value1, String value2) {
            addCriterion("pit_param1 not between", value1, value2, "pitParam1");
            return (Criteria) this;
        }

        public Criteria andPitParam2IsNull() {
            addCriterion("pit_param2 is null");
            return (Criteria) this;
        }

        public Criteria andPitParam2IsNotNull() {
            addCriterion("pit_param2 is not null");
            return (Criteria) this;
        }

        public Criteria andPitParam2EqualTo(String value) {
            addCriterion("pit_param2 =", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2NotEqualTo(String value) {
            addCriterion("pit_param2 <>", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2GreaterThan(String value) {
            addCriterion("pit_param2 >", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2GreaterThanOrEqualTo(String value) {
            addCriterion("pit_param2 >=", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2LessThan(String value) {
            addCriterion("pit_param2 <", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2LessThanOrEqualTo(String value) {
            addCriterion("pit_param2 <=", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2Like(String value) {
            addCriterion("pit_param2 like", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2NotLike(String value) {
            addCriterion("pit_param2 not like", value, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2In(List<String> values) {
            addCriterion("pit_param2 in", values, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2NotIn(List<String> values) {
            addCriterion("pit_param2 not in", values, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2Between(String value1, String value2) {
            addCriterion("pit_param2 between", value1, value2, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam2NotBetween(String value1, String value2) {
            addCriterion("pit_param2 not between", value1, value2, "pitParam2");
            return (Criteria) this;
        }

        public Criteria andPitParam3IsNull() {
            addCriterion("pit_param3 is null");
            return (Criteria) this;
        }

        public Criteria andPitParam3IsNotNull() {
            addCriterion("pit_param3 is not null");
            return (Criteria) this;
        }

        public Criteria andPitParam3EqualTo(String value) {
            addCriterion("pit_param3 =", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3NotEqualTo(String value) {
            addCriterion("pit_param3 <>", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3GreaterThan(String value) {
            addCriterion("pit_param3 >", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3GreaterThanOrEqualTo(String value) {
            addCriterion("pit_param3 >=", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3LessThan(String value) {
            addCriterion("pit_param3 <", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3LessThanOrEqualTo(String value) {
            addCriterion("pit_param3 <=", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3Like(String value) {
            addCriterion("pit_param3 like", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3NotLike(String value) {
            addCriterion("pit_param3 not like", value, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3In(List<String> values) {
            addCriterion("pit_param3 in", values, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3NotIn(List<String> values) {
            addCriterion("pit_param3 not in", values, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3Between(String value1, String value2) {
            addCriterion("pit_param3 between", value1, value2, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam3NotBetween(String value1, String value2) {
            addCriterion("pit_param3 not between", value1, value2, "pitParam3");
            return (Criteria) this;
        }

        public Criteria andPitParam4IsNull() {
            addCriterion("pit_param4 is null");
            return (Criteria) this;
        }

        public Criteria andPitParam4IsNotNull() {
            addCriterion("pit_param4 is not null");
            return (Criteria) this;
        }

        public Criteria andPitParam4EqualTo(String value) {
            addCriterion("pit_param4 =", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4NotEqualTo(String value) {
            addCriterion("pit_param4 <>", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4GreaterThan(String value) {
            addCriterion("pit_param4 >", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4GreaterThanOrEqualTo(String value) {
            addCriterion("pit_param4 >=", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4LessThan(String value) {
            addCriterion("pit_param4 <", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4LessThanOrEqualTo(String value) {
            addCriterion("pit_param4 <=", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4Like(String value) {
            addCriterion("pit_param4 like", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4NotLike(String value) {
            addCriterion("pit_param4 not like", value, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4In(List<String> values) {
            addCriterion("pit_param4 in", values, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4NotIn(List<String> values) {
            addCriterion("pit_param4 not in", values, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4Between(String value1, String value2) {
            addCriterion("pit_param4 between", value1, value2, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam4NotBetween(String value1, String value2) {
            addCriterion("pit_param4 not between", value1, value2, "pitParam4");
            return (Criteria) this;
        }

        public Criteria andPitParam5IsNull() {
            addCriterion("pit_param5 is null");
            return (Criteria) this;
        }

        public Criteria andPitParam5IsNotNull() {
            addCriterion("pit_param5 is not null");
            return (Criteria) this;
        }

        public Criteria andPitParam5EqualTo(String value) {
            addCriterion("pit_param5 =", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5NotEqualTo(String value) {
            addCriterion("pit_param5 <>", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5GreaterThan(String value) {
            addCriterion("pit_param5 >", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5GreaterThanOrEqualTo(String value) {
            addCriterion("pit_param5 >=", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5LessThan(String value) {
            addCriterion("pit_param5 <", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5LessThanOrEqualTo(String value) {
            addCriterion("pit_param5 <=", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5Like(String value) {
            addCriterion("pit_param5 like", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5NotLike(String value) {
            addCriterion("pit_param5 not like", value, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5In(List<String> values) {
            addCriterion("pit_param5 in", values, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5NotIn(List<String> values) {
            addCriterion("pit_param5 not in", values, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5Between(String value1, String value2) {
            addCriterion("pit_param5 between", value1, value2, "pitParam5");
            return (Criteria) this;
        }

        public Criteria andPitParam5NotBetween(String value1, String value2) {
            addCriterion("pit_param5 not between", value1, value2, "pitParam5");
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
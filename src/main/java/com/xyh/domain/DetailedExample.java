package com.xyh.domain;

import java.util.ArrayList;
import java.util.List;

public class DetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailedExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWatermoneyIsNull() {
            addCriterion("watermoney is null");
            return (Criteria) this;
        }

        public Criteria andWatermoneyIsNotNull() {
            addCriterion("watermoney is not null");
            return (Criteria) this;
        }

        public Criteria andWatermoneyEqualTo(Integer value) {
            addCriterion("watermoney =", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyNotEqualTo(Integer value) {
            addCriterion("watermoney <>", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyGreaterThan(Integer value) {
            addCriterion("watermoney >", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("watermoney >=", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyLessThan(Integer value) {
            addCriterion("watermoney <", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyLessThanOrEqualTo(Integer value) {
            addCriterion("watermoney <=", value, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyIn(List<Integer> values) {
            addCriterion("watermoney in", values, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyNotIn(List<Integer> values) {
            addCriterion("watermoney not in", values, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyBetween(Integer value1, Integer value2) {
            addCriterion("watermoney between", value1, value2, "watermoney");
            return (Criteria) this;
        }

        public Criteria andWatermoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("watermoney not between", value1, value2, "watermoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyIsNull() {
            addCriterion("elemoney is null");
            return (Criteria) this;
        }

        public Criteria andElemoneyIsNotNull() {
            addCriterion("elemoney is not null");
            return (Criteria) this;
        }

        public Criteria andElemoneyEqualTo(Integer value) {
            addCriterion("elemoney =", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyNotEqualTo(Integer value) {
            addCriterion("elemoney <>", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyGreaterThan(Integer value) {
            addCriterion("elemoney >", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("elemoney >=", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyLessThan(Integer value) {
            addCriterion("elemoney <", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("elemoney <=", value, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyIn(List<Integer> values) {
            addCriterion("elemoney in", values, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyNotIn(List<Integer> values) {
            addCriterion("elemoney not in", values, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyBetween(Integer value1, Integer value2) {
            addCriterion("elemoney between", value1, value2, "elemoney");
            return (Criteria) this;
        }

        public Criteria andElemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("elemoney not between", value1, value2, "elemoney");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Integer value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Integer value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Integer value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Integer value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Integer> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Integer> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Integer value1, Integer value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andSurwaterIsNull() {
            addCriterion("surwater is null");
            return (Criteria) this;
        }

        public Criteria andSurwaterIsNotNull() {
            addCriterion("surwater is not null");
            return (Criteria) this;
        }

        public Criteria andSurwaterEqualTo(Integer value) {
            addCriterion("surwater =", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterNotEqualTo(Integer value) {
            addCriterion("surwater <>", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterGreaterThan(Integer value) {
            addCriterion("surwater >", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("surwater >=", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterLessThan(Integer value) {
            addCriterion("surwater <", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterLessThanOrEqualTo(Integer value) {
            addCriterion("surwater <=", value, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterIn(List<Integer> values) {
            addCriterion("surwater in", values, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterNotIn(List<Integer> values) {
            addCriterion("surwater not in", values, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterBetween(Integer value1, Integer value2) {
            addCriterion("surwater between", value1, value2, "surwater");
            return (Criteria) this;
        }

        public Criteria andSurwaterNotBetween(Integer value1, Integer value2) {
            addCriterion("surwater not between", value1, value2, "surwater");
            return (Criteria) this;
        }

        public Criteria andSureleIsNull() {
            addCriterion("surele is null");
            return (Criteria) this;
        }

        public Criteria andSureleIsNotNull() {
            addCriterion("surele is not null");
            return (Criteria) this;
        }

        public Criteria andSureleEqualTo(Integer value) {
            addCriterion("surele =", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleNotEqualTo(Integer value) {
            addCriterion("surele <>", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleGreaterThan(Integer value) {
            addCriterion("surele >", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleGreaterThanOrEqualTo(Integer value) {
            addCriterion("surele >=", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleLessThan(Integer value) {
            addCriterion("surele <", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleLessThanOrEqualTo(Integer value) {
            addCriterion("surele <=", value, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleIn(List<Integer> values) {
            addCriterion("surele in", values, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleNotIn(List<Integer> values) {
            addCriterion("surele not in", values, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleBetween(Integer value1, Integer value2) {
            addCriterion("surele between", value1, value2, "surele");
            return (Criteria) this;
        }

        public Criteria andSureleNotBetween(Integer value1, Integer value2) {
            addCriterion("surele not between", value1, value2, "surele");
            return (Criteria) this;
        }

        public Criteria andUsercountIsNull() {
            addCriterion("usercount is null");
            return (Criteria) this;
        }

        public Criteria andUsercountIsNotNull() {
            addCriterion("usercount is not null");
            return (Criteria) this;
        }

        public Criteria andUsercountEqualTo(Integer value) {
            addCriterion("usercount =", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotEqualTo(Integer value) {
            addCriterion("usercount <>", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountGreaterThan(Integer value) {
            addCriterion("usercount >", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercount >=", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountLessThan(Integer value) {
            addCriterion("usercount <", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountLessThanOrEqualTo(Integer value) {
            addCriterion("usercount <=", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountIn(List<Integer> values) {
            addCriterion("usercount in", values, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotIn(List<Integer> values) {
            addCriterion("usercount not in", values, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountBetween(Integer value1, Integer value2) {
            addCriterion("usercount between", value1, value2, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotBetween(Integer value1, Integer value2) {
            addCriterion("usercount not between", value1, value2, "usercount");
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
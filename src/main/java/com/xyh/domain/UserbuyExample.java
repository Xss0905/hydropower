package com.xyh.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserbuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserbuyExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEleIsNull() {
            addCriterion("ele is null");
            return (Criteria) this;
        }

        public Criteria andEleIsNotNull() {
            addCriterion("ele is not null");
            return (Criteria) this;
        }

        public Criteria andEleEqualTo(Integer value) {
            addCriterion("ele =", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleNotEqualTo(Integer value) {
            addCriterion("ele <>", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleGreaterThan(Integer value) {
            addCriterion("ele >", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ele >=", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleLessThan(Integer value) {
            addCriterion("ele <", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleLessThanOrEqualTo(Integer value) {
            addCriterion("ele <=", value, "ele");
            return (Criteria) this;
        }

        public Criteria andEleIn(List<Integer> values) {
            addCriterion("ele in", values, "ele");
            return (Criteria) this;
        }

        public Criteria andEleNotIn(List<Integer> values) {
            addCriterion("ele not in", values, "ele");
            return (Criteria) this;
        }

        public Criteria andEleBetween(Integer value1, Integer value2) {
            addCriterion("ele between", value1, value2, "ele");
            return (Criteria) this;
        }

        public Criteria andEleNotBetween(Integer value1, Integer value2) {
            addCriterion("ele not between", value1, value2, "ele");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("water is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("water is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(Integer value) {
            addCriterion("water =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(Integer value) {
            addCriterion("water <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(Integer value) {
            addCriterion("water >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("water >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(Integer value) {
            addCriterion("water <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(Integer value) {
            addCriterion("water <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<Integer> values) {
            addCriterion("water in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<Integer> values) {
            addCriterion("water not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(Integer value1, Integer value2) {
            addCriterion("water between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(Integer value1, Integer value2) {
            addCriterion("water not between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("buytime is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("buytime is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(Date value) {
            addCriterion("buytime =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(Date value) {
            addCriterion("buytime <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(Date value) {
            addCriterion("buytime >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buytime >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(Date value) {
            addCriterion("buytime <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(Date value) {
            addCriterion("buytime <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<Date> values) {
            addCriterion("buytime in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<Date> values) {
            addCriterion("buytime not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(Date value1, Date value2) {
            addCriterion("buytime between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(Date value1, Date value2) {
            addCriterion("buytime not between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimestringIsNull() {
            addCriterion("buytimeString is null");
            return (Criteria) this;
        }

        public Criteria andBuytimestringIsNotNull() {
            addCriterion("buytimeString is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimestringEqualTo(String value) {
            addCriterion("buytimeString =", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringNotEqualTo(String value) {
            addCriterion("buytimeString <>", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringGreaterThan(String value) {
            addCriterion("buytimeString >", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringGreaterThanOrEqualTo(String value) {
            addCriterion("buytimeString >=", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringLessThan(String value) {
            addCriterion("buytimeString <", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringLessThanOrEqualTo(String value) {
            addCriterion("buytimeString <=", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringLike(String value) {
            addCriterion("buytimeString like", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringNotLike(String value) {
            addCriterion("buytimeString not like", value, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringIn(List<String> values) {
            addCriterion("buytimeString in", values, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringNotIn(List<String> values) {
            addCriterion("buytimeString not in", values, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringBetween(String value1, String value2) {
            addCriterion("buytimeString between", value1, value2, "buytimestring");
            return (Criteria) this;
        }

        public Criteria andBuytimestringNotBetween(String value1, String value2) {
            addCriterion("buytimeString not between", value1, value2, "buytimestring");
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
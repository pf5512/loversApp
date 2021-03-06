package org.loversAPP.model;

import java.util.ArrayList;
import java.util.List;

public class TreasureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreasureExample() {
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
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeIsNull() {
            addCriterion("treasureType is null");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeIsNotNull() {
            addCriterion("treasureType is not null");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeEqualTo(Integer value) {
            addCriterion("treasureType =", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeNotEqualTo(Integer value) {
            addCriterion("treasureType <>", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeGreaterThan(Integer value) {
            addCriterion("treasureType >", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("treasureType >=", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeLessThan(Integer value) {
            addCriterion("treasureType <", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeLessThanOrEqualTo(Integer value) {
            addCriterion("treasureType <=", value, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeIn(List<Integer> values) {
            addCriterion("treasureType in", values, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeNotIn(List<Integer> values) {
            addCriterion("treasureType not in", values, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeBetween(Integer value1, Integer value2) {
            addCriterion("treasureType between", value1, value2, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasuretypeNotBetween(Integer value1, Integer value2) {
            addCriterion("treasureType not between", value1, value2, "treasuretype");
            return (Criteria) this;
        }

        public Criteria andTreasurenameIsNull() {
            addCriterion("treasureName is null");
            return (Criteria) this;
        }

        public Criteria andTreasurenameIsNotNull() {
            addCriterion("treasureName is not null");
            return (Criteria) this;
        }

        public Criteria andTreasurenameEqualTo(String value) {
            addCriterion("treasureName =", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameNotEqualTo(String value) {
            addCriterion("treasureName <>", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameGreaterThan(String value) {
            addCriterion("treasureName >", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameGreaterThanOrEqualTo(String value) {
            addCriterion("treasureName >=", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameLessThan(String value) {
            addCriterion("treasureName <", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameLessThanOrEqualTo(String value) {
            addCriterion("treasureName <=", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameLike(String value) {
            addCriterion("treasureName like", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameNotLike(String value) {
            addCriterion("treasureName not like", value, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameIn(List<String> values) {
            addCriterion("treasureName in", values, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameNotIn(List<String> values) {
            addCriterion("treasureName not in", values, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameBetween(String value1, String value2) {
            addCriterion("treasureName between", value1, value2, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurenameNotBetween(String value1, String value2) {
            addCriterion("treasureName not between", value1, value2, "treasurename");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueIsNull() {
            addCriterion("treasureValue is null");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueIsNotNull() {
            addCriterion("treasureValue is not null");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueEqualTo(Integer value) {
            addCriterion("treasureValue =", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueNotEqualTo(Integer value) {
            addCriterion("treasureValue <>", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueGreaterThan(Integer value) {
            addCriterion("treasureValue >", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("treasureValue >=", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueLessThan(Integer value) {
            addCriterion("treasureValue <", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueLessThanOrEqualTo(Integer value) {
            addCriterion("treasureValue <=", value, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueIn(List<Integer> values) {
            addCriterion("treasureValue in", values, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueNotIn(List<Integer> values) {
            addCriterion("treasureValue not in", values, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueBetween(Integer value1, Integer value2) {
            addCriterion("treasureValue between", value1, value2, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andTreasurevalueNotBetween(Integer value1, Integer value2) {
            addCriterion("treasureValue not between", value1, value2, "treasurevalue");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNull() {
            addCriterion("longtitude is null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIsNotNull() {
            addCriterion("longtitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongtitudeEqualTo(String value) {
            addCriterion("longtitude =", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotEqualTo(String value) {
            addCriterion("longtitude <>", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThan(String value) {
            addCriterion("longtitude >", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longtitude >=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThan(String value) {
            addCriterion("longtitude <", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLessThanOrEqualTo(String value) {
            addCriterion("longtitude <=", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeLike(String value) {
            addCriterion("longtitude like", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotLike(String value) {
            addCriterion("longtitude not like", value, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeIn(List<String> values) {
            addCriterion("longtitude in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotIn(List<String> values) {
            addCriterion("longtitude not in", values, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeBetween(String value1, String value2) {
            addCriterion("longtitude between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLongtitudeNotBetween(String value1, String value2) {
            addCriterion("longtitude not between", value1, value2, "longtitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("\" latitude\" is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("\" latitude\" is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("\" latitude\" =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("\" latitude\" <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("\" latitude\" >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("\" latitude\" >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("\" latitude\" <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("\" latitude\" <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("\" latitude\" like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("\" latitude\" not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("\" latitude\" in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("\" latitude\" not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("\" latitude\" between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("\" latitude\" not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeIsNull() {
            addCriterion("treasureCode is null");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeIsNotNull() {
            addCriterion("treasureCode is not null");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeEqualTo(Integer value) {
            addCriterion("treasureCode =", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeNotEqualTo(Integer value) {
            addCriterion("treasureCode <>", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeGreaterThan(Integer value) {
            addCriterion("treasureCode >", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("treasureCode >=", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeLessThan(Integer value) {
            addCriterion("treasureCode <", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeLessThanOrEqualTo(Integer value) {
            addCriterion("treasureCode <=", value, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeIn(List<Integer> values) {
            addCriterion("treasureCode in", values, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeNotIn(List<Integer> values) {
            addCriterion("treasureCode not in", values, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeBetween(Integer value1, Integer value2) {
            addCriterion("treasureCode between", value1, value2, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andTreasurecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("treasureCode not between", value1, value2, "treasurecode");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
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
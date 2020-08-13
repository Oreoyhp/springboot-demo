package com.crsc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YyRenshiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyRenshiExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVersonIsNull() {
            addCriterion("VERSON is null");
            return (Criteria) this;
        }

        public Criteria andVersonIsNotNull() {
            addCriterion("VERSON is not null");
            return (Criteria) this;
        }

        public Criteria andVersonEqualTo(Integer value) {
            addCriterion("VERSON =", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonNotEqualTo(Integer value) {
            addCriterion("VERSON <>", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonGreaterThan(Integer value) {
            addCriterion("VERSON >", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSON >=", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonLessThan(Integer value) {
            addCriterion("VERSON <", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonLessThanOrEqualTo(Integer value) {
            addCriterion("VERSON <=", value, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonIn(List<Integer> values) {
            addCriterion("VERSON in", values, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonNotIn(List<Integer> values) {
            addCriterion("VERSON not in", values, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonBetween(Integer value1, Integer value2) {
            addCriterion("VERSON between", value1, value2, "verson");
            return (Criteria) this;
        }

        public Criteria andVersonNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSON not between", value1, value2, "verson");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("usercode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("usercode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("usercode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("usercode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("usercode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("usercode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("usercode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("usercode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("usercode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("usercode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("usercode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("usercode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("usercode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("usercode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMacidIsNull() {
            addCriterion("macid is null");
            return (Criteria) this;
        }

        public Criteria andMacidIsNotNull() {
            addCriterion("macid is not null");
            return (Criteria) this;
        }

        public Criteria andMacidEqualTo(Integer value) {
            addCriterion("macid =", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidNotEqualTo(Integer value) {
            addCriterion("macid <>", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidGreaterThan(Integer value) {
            addCriterion("macid >", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidGreaterThanOrEqualTo(Integer value) {
            addCriterion("macid >=", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidLessThan(Integer value) {
            addCriterion("macid <", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidLessThanOrEqualTo(Integer value) {
            addCriterion("macid <=", value, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidIn(List<Integer> values) {
            addCriterion("macid in", values, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidNotIn(List<Integer> values) {
            addCriterion("macid not in", values, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidBetween(Integer value1, Integer value2) {
            addCriterion("macid between", value1, value2, "macid");
            return (Criteria) this;
        }

        public Criteria andMacidNotBetween(Integer value1, Integer value2) {
            addCriterion("macid not between", value1, value2, "macid");
            return (Criteria) this;
        }

        public Criteria andDaterzrqIsNull() {
            addCriterion("daterzrq is null");
            return (Criteria) this;
        }

        public Criteria andDaterzrqIsNotNull() {
            addCriterion("daterzrq is not null");
            return (Criteria) this;
        }

        public Criteria andDaterzrqEqualTo(Date value) {
            addCriterionForJDBCDate("daterzrq =", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("daterzrq <>", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("daterzrq >", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("daterzrq >=", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqLessThan(Date value) {
            addCriterionForJDBCDate("daterzrq <", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("daterzrq <=", value, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqIn(List<Date> values) {
            addCriterionForJDBCDate("daterzrq in", values, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("daterzrq not in", values, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("daterzrq between", value1, value2, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andDaterzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("daterzrq not between", value1, value2, "daterzrq");
            return (Criteria) this;
        }

        public Criteria andIszzIsNull() {
            addCriterion("iszz is null");
            return (Criteria) this;
        }

        public Criteria andIszzIsNotNull() {
            addCriterion("iszz is not null");
            return (Criteria) this;
        }

        public Criteria andIszzEqualTo(Integer value) {
            addCriterion("iszz =", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzNotEqualTo(Integer value) {
            addCriterion("iszz <>", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzGreaterThan(Integer value) {
            addCriterion("iszz >", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzGreaterThanOrEqualTo(Integer value) {
            addCriterion("iszz >=", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzLessThan(Integer value) {
            addCriterion("iszz <", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzLessThanOrEqualTo(Integer value) {
            addCriterion("iszz <=", value, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzIn(List<Integer> values) {
            addCriterion("iszz in", values, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzNotIn(List<Integer> values) {
            addCriterion("iszz not in", values, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzBetween(Integer value1, Integer value2) {
            addCriterion("iszz between", value1, value2, "iszz");
            return (Criteria) this;
        }

        public Criteria andIszzNotBetween(Integer value1, Integer value2) {
            addCriterion("iszz not between", value1, value2, "iszz");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNull() {
            addCriterion("employer is null");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNotNull() {
            addCriterion("employer is not null");
            return (Criteria) this;
        }

        public Criteria andEmployerEqualTo(Integer value) {
            addCriterion("employer =", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotEqualTo(Integer value) {
            addCriterion("employer <>", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThan(Integer value) {
            addCriterion("employer >", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThanOrEqualTo(Integer value) {
            addCriterion("employer >=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThan(Integer value) {
            addCriterion("employer <", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThanOrEqualTo(Integer value) {
            addCriterion("employer <=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerIn(List<Integer> values) {
            addCriterion("employer in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotIn(List<Integer> values) {
            addCriterion("employer not in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerBetween(Integer value1, Integer value2) {
            addCriterion("employer between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotBetween(Integer value1, Integer value2) {
            addCriterion("employer not between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressworkIsNull() {
            addCriterion("addresswork is null");
            return (Criteria) this;
        }

        public Criteria andAddressworkIsNotNull() {
            addCriterion("addresswork is not null");
            return (Criteria) this;
        }

        public Criteria andAddressworkEqualTo(Integer value) {
            addCriterion("addresswork =", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkNotEqualTo(Integer value) {
            addCriterion("addresswork <>", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkGreaterThan(Integer value) {
            addCriterion("addresswork >", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkGreaterThanOrEqualTo(Integer value) {
            addCriterion("addresswork >=", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkLessThan(Integer value) {
            addCriterion("addresswork <", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkLessThanOrEqualTo(Integer value) {
            addCriterion("addresswork <=", value, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkIn(List<Integer> values) {
            addCriterion("addresswork in", values, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkNotIn(List<Integer> values) {
            addCriterion("addresswork not in", values, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkBetween(Integer value1, Integer value2) {
            addCriterion("addresswork between", value1, value2, "addresswork");
            return (Criteria) this;
        }

        public Criteria andAddressworkNotBetween(Integer value1, Integer value2) {
            addCriterion("addresswork not between", value1, value2, "addresswork");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNull() {
            addCriterion("parentcode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("parentcode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(String value) {
            addCriterion("parentcode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(String value) {
            addCriterion("parentcode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(String value) {
            addCriterion("parentcode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("parentcode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(String value) {
            addCriterion("parentcode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(String value) {
            addCriterion("parentcode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLike(String value) {
            addCriterion("parentcode like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotLike(String value) {
            addCriterion("parentcode not like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<String> values) {
            addCriterion("parentcode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<String> values) {
            addCriterion("parentcode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(String value1, String value2) {
            addCriterion("parentcode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(String value1, String value2) {
            addCriterion("parentcode not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andTyperyIsNull() {
            addCriterion("typery is null");
            return (Criteria) this;
        }

        public Criteria andTyperyIsNotNull() {
            addCriterion("typery is not null");
            return (Criteria) this;
        }

        public Criteria andTyperyEqualTo(Integer value) {
            addCriterion("typery =", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyNotEqualTo(Integer value) {
            addCriterion("typery <>", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyGreaterThan(Integer value) {
            addCriterion("typery >", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyGreaterThanOrEqualTo(Integer value) {
            addCriterion("typery >=", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyLessThan(Integer value) {
            addCriterion("typery <", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyLessThanOrEqualTo(Integer value) {
            addCriterion("typery <=", value, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyIn(List<Integer> values) {
            addCriterion("typery in", values, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyNotIn(List<Integer> values) {
            addCriterion("typery not in", values, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyBetween(Integer value1, Integer value2) {
            addCriterion("typery between", value1, value2, "typery");
            return (Criteria) this;
        }

        public Criteria andTyperyNotBetween(Integer value1, Integer value2) {
            addCriterion("typery not between", value1, value2, "typery");
            return (Criteria) this;
        }

        public Criteria andTypepyIsNull() {
            addCriterion("typepy is null");
            return (Criteria) this;
        }

        public Criteria andTypepyIsNotNull() {
            addCriterion("typepy is not null");
            return (Criteria) this;
        }

        public Criteria andTypepyEqualTo(Integer value) {
            addCriterion("typepy =", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyNotEqualTo(Integer value) {
            addCriterion("typepy <>", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyGreaterThan(Integer value) {
            addCriterion("typepy >", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyGreaterThanOrEqualTo(Integer value) {
            addCriterion("typepy >=", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyLessThan(Integer value) {
            addCriterion("typepy <", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyLessThanOrEqualTo(Integer value) {
            addCriterion("typepy <=", value, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyIn(List<Integer> values) {
            addCriterion("typepy in", values, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyNotIn(List<Integer> values) {
            addCriterion("typepy not in", values, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyBetween(Integer value1, Integer value2) {
            addCriterion("typepy between", value1, value2, "typepy");
            return (Criteria) this;
        }

        public Criteria andTypepyNotBetween(Integer value1, Integer value2) {
            addCriterion("typepy not between", value1, value2, "typepy");
            return (Criteria) this;
        }

        public Criteria andDategqhtIsNull() {
            addCriterion("dategqht is null");
            return (Criteria) this;
        }

        public Criteria andDategqhtIsNotNull() {
            addCriterion("dategqht is not null");
            return (Criteria) this;
        }

        public Criteria andDategqhtEqualTo(Date value) {
            addCriterionForJDBCDate("dategqht =", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtNotEqualTo(Date value) {
            addCriterionForJDBCDate("dategqht <>", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtGreaterThan(Date value) {
            addCriterionForJDBCDate("dategqht >", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dategqht >=", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtLessThan(Date value) {
            addCriterionForJDBCDate("dategqht <", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dategqht <=", value, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtIn(List<Date> values) {
            addCriterionForJDBCDate("dategqht in", values, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtNotIn(List<Date> values) {
            addCriterionForJDBCDate("dategqht not in", values, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dategqht between", value1, value2, "dategqht");
            return (Criteria) this;
        }

        public Criteria andDategqhtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dategqht not between", value1, value2, "dategqht");
            return (Criteria) this;
        }

        public Criteria andSyhtrIsNull() {
            addCriterion("syhtr is null");
            return (Criteria) this;
        }

        public Criteria andSyhtrIsNotNull() {
            addCriterion("syhtr is not null");
            return (Criteria) this;
        }

        public Criteria andSyhtrEqualTo(Integer value) {
            addCriterion("syhtr =", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrNotEqualTo(Integer value) {
            addCriterion("syhtr <>", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrGreaterThan(Integer value) {
            addCriterion("syhtr >", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrGreaterThanOrEqualTo(Integer value) {
            addCriterion("syhtr >=", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrLessThan(Integer value) {
            addCriterion("syhtr <", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrLessThanOrEqualTo(Integer value) {
            addCriterion("syhtr <=", value, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrIn(List<Integer> values) {
            addCriterion("syhtr in", values, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrNotIn(List<Integer> values) {
            addCriterion("syhtr not in", values, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrBetween(Integer value1, Integer value2) {
            addCriterion("syhtr between", value1, value2, "syhtr");
            return (Criteria) this;
        }

        public Criteria andSyhtrNotBetween(Integer value1, Integer value2) {
            addCriterion("syhtr not between", value1, value2, "syhtr");
            return (Criteria) this;
        }

        public Criteria andDatezzrqIsNull() {
            addCriterion("datezzrq is null");
            return (Criteria) this;
        }

        public Criteria andDatezzrqIsNotNull() {
            addCriterion("datezzrq is not null");
            return (Criteria) this;
        }

        public Criteria andDatezzrqEqualTo(Date value) {
            addCriterionForJDBCDate("datezzrq =", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("datezzrq <>", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("datezzrq >", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datezzrq >=", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqLessThan(Date value) {
            addCriterionForJDBCDate("datezzrq <", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datezzrq <=", value, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqIn(List<Date> values) {
            addCriterionForJDBCDate("datezzrq in", values, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("datezzrq not in", values, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datezzrq between", value1, value2, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andDatezzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datezzrq not between", value1, value2, "datezzrq");
            return (Criteria) this;
        }

        public Criteria andHtqxIsNull() {
            addCriterion("htqx is null");
            return (Criteria) this;
        }

        public Criteria andHtqxIsNotNull() {
            addCriterion("htqx is not null");
            return (Criteria) this;
        }

        public Criteria andHtqxEqualTo(Integer value) {
            addCriterion("htqx =", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotEqualTo(Integer value) {
            addCriterion("htqx <>", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxGreaterThan(Integer value) {
            addCriterion("htqx >", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxGreaterThanOrEqualTo(Integer value) {
            addCriterion("htqx >=", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxLessThan(Integer value) {
            addCriterion("htqx <", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxLessThanOrEqualTo(Integer value) {
            addCriterion("htqx <=", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxIn(List<Integer> values) {
            addCriterion("htqx in", values, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotIn(List<Integer> values) {
            addCriterion("htqx not in", values, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxBetween(Integer value1, Integer value2) {
            addCriterion("htqx between", value1, value2, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotBetween(Integer value1, Integer value2) {
            addCriterion("htqx not between", value1, value2, "htqx");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrIsNull() {
            addCriterion("datecchtdqr is null");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrIsNotNull() {
            addCriterion("datecchtdqr is not null");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrEqualTo(Date value) {
            addCriterionForJDBCDate("datecchtdqr =", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrNotEqualTo(Date value) {
            addCriterionForJDBCDate("datecchtdqr <>", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrGreaterThan(Date value) {
            addCriterionForJDBCDate("datecchtdqr >", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecchtdqr >=", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrLessThan(Date value) {
            addCriterionForJDBCDate("datecchtdqr <", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecchtdqr <=", value, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrIn(List<Date> values) {
            addCriterionForJDBCDate("datecchtdqr in", values, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrNotIn(List<Date> values) {
            addCriterionForJDBCDate("datecchtdqr not in", values, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecchtdqr between", value1, value2, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatecchtdqrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecchtdqr not between", value1, value2, "datecchtdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrIsNull() {
            addCriterion("datehtzcdqr is null");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrIsNotNull() {
            addCriterion("datehtzcdqr is not null");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrEqualTo(Date value) {
            addCriterionForJDBCDate("datehtzcdqr =", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrNotEqualTo(Date value) {
            addCriterionForJDBCDate("datehtzcdqr <>", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrGreaterThan(Date value) {
            addCriterionForJDBCDate("datehtzcdqr >", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datehtzcdqr >=", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrLessThan(Date value) {
            addCriterionForJDBCDate("datehtzcdqr <", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datehtzcdqr <=", value, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrIn(List<Date> values) {
            addCriterionForJDBCDate("datehtzcdqr in", values, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrNotIn(List<Date> values) {
            addCriterionForJDBCDate("datehtzcdqr not in", values, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datehtzcdqr between", value1, value2, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andDatehtzcdqrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datehtzcdqr not between", value1, value2, "datehtzcdqr");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(Integer value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(Integer value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(Integer value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(Integer value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(Integer value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<Integer> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<Integer> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(Integer value1, Integer value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(Integer value1, Integer value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNull() {
            addCriterion("sfzhm is null");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNotNull() {
            addCriterion("sfzhm is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhmEqualTo(String value) {
            addCriterion("sfzhm =", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotEqualTo(String value) {
            addCriterion("sfzhm <>", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThan(String value) {
            addCriterion("sfzhm >", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("sfzhm >=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThan(String value) {
            addCriterion("sfzhm <", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThanOrEqualTo(String value) {
            addCriterion("sfzhm <=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLike(String value) {
            addCriterion("sfzhm like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotLike(String value) {
            addCriterion("sfzhm not like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmIn(List<String> values) {
            addCriterion("sfzhm in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotIn(List<String> values) {
            addCriterion("sfzhm not in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmBetween(String value1, String value2) {
            addCriterion("sfzhm between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotBetween(String value1, String value2) {
            addCriterion("sfzhm not between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(Integer value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(Integer value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(Integer value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(Integer value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(Integer value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(Integer value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<Integer> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<Integer> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(Integer value1, Integer value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(Integer value1, Integer value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterionForJDBCDate("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterionForJDBCDate("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterionForJDBCDate("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHfIsNull() {
            addCriterion("hf is null");
            return (Criteria) this;
        }

        public Criteria andHfIsNotNull() {
            addCriterion("hf is not null");
            return (Criteria) this;
        }

        public Criteria andHfEqualTo(Integer value) {
            addCriterion("hf =", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotEqualTo(Integer value) {
            addCriterion("hf <>", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfGreaterThan(Integer value) {
            addCriterion("hf >", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfGreaterThanOrEqualTo(Integer value) {
            addCriterion("hf >=", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfLessThan(Integer value) {
            addCriterion("hf <", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfLessThanOrEqualTo(Integer value) {
            addCriterion("hf <=", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfIn(List<Integer> values) {
            addCriterion("hf in", values, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotIn(List<Integer> values) {
            addCriterion("hf not in", values, "hf");
            return (Criteria) this;
        }

        public Criteria andHfBetween(Integer value1, Integer value2) {
            addCriterion("hf between", value1, value2, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotBetween(Integer value1, Integer value2) {
            addCriterion("hf not between", value1, value2, "hf");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCsdIsNull() {
            addCriterion("csd is null");
            return (Criteria) this;
        }

        public Criteria andCsdIsNotNull() {
            addCriterion("csd is not null");
            return (Criteria) this;
        }

        public Criteria andCsdEqualTo(String value) {
            addCriterion("csd =", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotEqualTo(String value) {
            addCriterion("csd <>", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThan(String value) {
            addCriterion("csd >", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThanOrEqualTo(String value) {
            addCriterion("csd >=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThan(String value) {
            addCriterion("csd <", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThanOrEqualTo(String value) {
            addCriterion("csd <=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLike(String value) {
            addCriterion("csd like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotLike(String value) {
            addCriterion("csd not like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdIn(List<String> values) {
            addCriterion("csd in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotIn(List<String> values) {
            addCriterion("csd not in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdBetween(String value1, String value2) {
            addCriterion("csd between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotBetween(String value1, String value2) {
            addCriterion("csd not between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(Integer value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(Integer value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(Integer value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(Integer value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(Integer value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<Integer> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<Integer> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(Integer value1, Integer value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(Integer value1, Integer value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andHkszdIsNull() {
            addCriterion("hkszd is null");
            return (Criteria) this;
        }

        public Criteria andHkszdIsNotNull() {
            addCriterion("hkszd is not null");
            return (Criteria) this;
        }

        public Criteria andHkszdEqualTo(String value) {
            addCriterion("hkszd =", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotEqualTo(String value) {
            addCriterion("hkszd <>", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdGreaterThan(String value) {
            addCriterion("hkszd >", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdGreaterThanOrEqualTo(String value) {
            addCriterion("hkszd >=", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLessThan(String value) {
            addCriterion("hkszd <", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLessThanOrEqualTo(String value) {
            addCriterion("hkszd <=", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLike(String value) {
            addCriterion("hkszd like", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotLike(String value) {
            addCriterion("hkszd not like", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdIn(List<String> values) {
            addCriterion("hkszd in", values, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotIn(List<String> values) {
            addCriterion("hkszd not in", values, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdBetween(String value1, String value2) {
            addCriterion("hkszd between", value1, value2, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotBetween(String value1, String value2) {
            addCriterion("hkszd not between", value1, value2, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkxzIsNull() {
            addCriterion("hkxz is null");
            return (Criteria) this;
        }

        public Criteria andHkxzIsNotNull() {
            addCriterion("hkxz is not null");
            return (Criteria) this;
        }

        public Criteria andHkxzEqualTo(Integer value) {
            addCriterion("hkxz =", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotEqualTo(Integer value) {
            addCriterion("hkxz <>", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzGreaterThan(Integer value) {
            addCriterion("hkxz >", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("hkxz >=", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzLessThan(Integer value) {
            addCriterion("hkxz <", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzLessThanOrEqualTo(Integer value) {
            addCriterion("hkxz <=", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzIn(List<Integer> values) {
            addCriterion("hkxz in", values, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotIn(List<Integer> values) {
            addCriterion("hkxz not in", values, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzBetween(Integer value1, Integer value2) {
            addCriterion("hkxz between", value1, value2, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotBetween(Integer value1, Integer value2) {
            addCriterion("hkxz not between", value1, value2, "hkxz");
            return (Criteria) this;
        }

        public Criteria andByyxIsNull() {
            addCriterion("byyx is null");
            return (Criteria) this;
        }

        public Criteria andByyxIsNotNull() {
            addCriterion("byyx is not null");
            return (Criteria) this;
        }

        public Criteria andByyxEqualTo(String value) {
            addCriterion("byyx =", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotEqualTo(String value) {
            addCriterion("byyx <>", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThan(String value) {
            addCriterion("byyx >", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThanOrEqualTo(String value) {
            addCriterion("byyx >=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThan(String value) {
            addCriterion("byyx <", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThanOrEqualTo(String value) {
            addCriterion("byyx <=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLike(String value) {
            addCriterion("byyx like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotLike(String value) {
            addCriterion("byyx not like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxIn(List<String> values) {
            addCriterion("byyx in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotIn(List<String> values) {
            addCriterion("byyx not in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxBetween(String value1, String value2) {
            addCriterion("byyx between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotBetween(String value1, String value2) {
            addCriterion("byyx not between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("xl is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("xl is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(Integer value) {
            addCriterion("xl =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(Integer value) {
            addCriterion("xl <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(Integer value) {
            addCriterion("xl >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(Integer value) {
            addCriterion("xl >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(Integer value) {
            addCriterion("xl <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(Integer value) {
            addCriterion("xl <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<Integer> values) {
            addCriterion("xl in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<Integer> values) {
            addCriterion("xl not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(Integer value1, Integer value2) {
            addCriterion("xl between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(Integer value1, Integer value2) {
            addCriterion("xl not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIsNull() {
            addCriterion("cjgzsj is null");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIsNotNull() {
            addCriterion("cjgzsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjgzsjEqualTo(Date value) {
            addCriterion("cjgzsj =", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotEqualTo(Date value) {
            addCriterion("cjgzsj <>", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjGreaterThan(Date value) {
            addCriterion("cjgzsj >", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjgzsj >=", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjLessThan(Date value) {
            addCriterion("cjgzsj <", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjLessThanOrEqualTo(Date value) {
            addCriterion("cjgzsj <=", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIn(List<Date> values) {
            addCriterion("cjgzsj in", values, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotIn(List<Date> values) {
            addCriterion("cjgzsj not in", values, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjBetween(Date value1, Date value2) {
            addCriterion("cjgzsj between", value1, value2, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotBetween(Date value1, Date value2) {
            addCriterion("cjgzsj not between", value1, value2, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andGlIsNull() {
            addCriterion("gl is null");
            return (Criteria) this;
        }

        public Criteria andGlIsNotNull() {
            addCriterion("gl is not null");
            return (Criteria) this;
        }

        public Criteria andGlEqualTo(String value) {
            addCriterion("gl =", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotEqualTo(String value) {
            addCriterion("gl <>", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThan(String value) {
            addCriterion("gl >", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThanOrEqualTo(String value) {
            addCriterion("gl >=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThan(String value) {
            addCriterion("gl <", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThanOrEqualTo(String value) {
            addCriterion("gl <=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLike(String value) {
            addCriterion("gl like", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotLike(String value) {
            addCriterion("gl not like", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlIn(List<String> values) {
            addCriterion("gl in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotIn(List<String> values) {
            addCriterion("gl not in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlBetween(String value1, String value2) {
            addCriterion("gl between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotBetween(String value1, String value2) {
            addCriterion("gl not between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andJjuserIsNull() {
            addCriterion("jjuser is null");
            return (Criteria) this;
        }

        public Criteria andJjuserIsNotNull() {
            addCriterion("jjuser is not null");
            return (Criteria) this;
        }

        public Criteria andJjuserEqualTo(String value) {
            addCriterion("jjuser =", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserNotEqualTo(String value) {
            addCriterion("jjuser <>", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserGreaterThan(String value) {
            addCriterion("jjuser >", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserGreaterThanOrEqualTo(String value) {
            addCriterion("jjuser >=", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserLessThan(String value) {
            addCriterion("jjuser <", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserLessThanOrEqualTo(String value) {
            addCriterion("jjuser <=", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserLike(String value) {
            addCriterion("jjuser like", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserNotLike(String value) {
            addCriterion("jjuser not like", value, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserIn(List<String> values) {
            addCriterion("jjuser in", values, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserNotIn(List<String> values) {
            addCriterion("jjuser not in", values, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserBetween(String value1, String value2) {
            addCriterion("jjuser between", value1, value2, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjuserNotBetween(String value1, String value2) {
            addCriterion("jjuser not between", value1, value2, "jjuser");
            return (Criteria) this;
        }

        public Criteria andJjtelIsNull() {
            addCriterion("jjtel is null");
            return (Criteria) this;
        }

        public Criteria andJjtelIsNotNull() {
            addCriterion("jjtel is not null");
            return (Criteria) this;
        }

        public Criteria andJjtelEqualTo(String value) {
            addCriterion("jjtel =", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelNotEqualTo(String value) {
            addCriterion("jjtel <>", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelGreaterThan(String value) {
            addCriterion("jjtel >", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelGreaterThanOrEqualTo(String value) {
            addCriterion("jjtel >=", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelLessThan(String value) {
            addCriterion("jjtel <", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelLessThanOrEqualTo(String value) {
            addCriterion("jjtel <=", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelLike(String value) {
            addCriterion("jjtel like", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelNotLike(String value) {
            addCriterion("jjtel not like", value, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelIn(List<String> values) {
            addCriterion("jjtel in", values, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelNotIn(List<String> values) {
            addCriterion("jjtel not in", values, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelBetween(String value1, String value2) {
            addCriterion("jjtel between", value1, value2, "jjtel");
            return (Criteria) this;
        }

        public Criteria andJjtelNotBetween(String value1, String value2) {
            addCriterion("jjtel not between", value1, value2, "jjtel");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNull() {
            addCriterion("yhlb is null");
            return (Criteria) this;
        }

        public Criteria andYhlbIsNotNull() {
            addCriterion("yhlb is not null");
            return (Criteria) this;
        }

        public Criteria andYhlbEqualTo(String value) {
            addCriterion("yhlb =", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotEqualTo(String value) {
            addCriterion("yhlb <>", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThan(String value) {
            addCriterion("yhlb >", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbGreaterThanOrEqualTo(String value) {
            addCriterion("yhlb >=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThan(String value) {
            addCriterion("yhlb <", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLessThanOrEqualTo(String value) {
            addCriterion("yhlb <=", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbLike(String value) {
            addCriterion("yhlb like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotLike(String value) {
            addCriterion("yhlb not like", value, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbIn(List<String> values) {
            addCriterion("yhlb in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotIn(List<String> values) {
            addCriterion("yhlb not in", values, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbBetween(String value1, String value2) {
            addCriterion("yhlb between", value1, value2, "yhlb");
            return (Criteria) this;
        }

        public Criteria andYhlbNotBetween(String value1, String value2) {
            addCriterion("yhlb not between", value1, value2, "yhlb");
            return (Criteria) this;
        }

        public Criteria andKhzhIsNull() {
            addCriterion("khzh is null");
            return (Criteria) this;
        }

        public Criteria andKhzhIsNotNull() {
            addCriterion("khzh is not null");
            return (Criteria) this;
        }

        public Criteria andKhzhEqualTo(String value) {
            addCriterion("khzh =", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotEqualTo(String value) {
            addCriterion("khzh <>", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhGreaterThan(String value) {
            addCriterion("khzh >", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhGreaterThanOrEqualTo(String value) {
            addCriterion("khzh >=", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLessThan(String value) {
            addCriterion("khzh <", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLessThanOrEqualTo(String value) {
            addCriterion("khzh <=", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLike(String value) {
            addCriterion("khzh like", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotLike(String value) {
            addCriterion("khzh not like", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhIn(List<String> values) {
            addCriterion("khzh in", values, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotIn(List<String> values) {
            addCriterion("khzh not in", values, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhBetween(String value1, String value2) {
            addCriterion("khzh between", value1, value2, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotBetween(String value1, String value2) {
            addCriterion("khzh not between", value1, value2, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhyhqcIsNull() {
            addCriterion("khyhqc is null");
            return (Criteria) this;
        }

        public Criteria andKhyhqcIsNotNull() {
            addCriterion("khyhqc is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhqcEqualTo(String value) {
            addCriterion("khyhqc =", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcNotEqualTo(String value) {
            addCriterion("khyhqc <>", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcGreaterThan(String value) {
            addCriterion("khyhqc >", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcGreaterThanOrEqualTo(String value) {
            addCriterion("khyhqc >=", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcLessThan(String value) {
            addCriterion("khyhqc <", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcLessThanOrEqualTo(String value) {
            addCriterion("khyhqc <=", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcLike(String value) {
            addCriterion("khyhqc like", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcNotLike(String value) {
            addCriterion("khyhqc not like", value, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcIn(List<String> values) {
            addCriterion("khyhqc in", values, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcNotIn(List<String> values) {
            addCriterion("khyhqc not in", values, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcBetween(String value1, String value2) {
            addCriterion("khyhqc between", value1, value2, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andKhyhqcNotBetween(String value1, String value2) {
            addCriterion("khyhqc not between", value1, value2, "khyhqc");
            return (Criteria) this;
        }

        public Criteria andZhdzIsNull() {
            addCriterion("zhdz is null");
            return (Criteria) this;
        }

        public Criteria andZhdzIsNotNull() {
            addCriterion("zhdz is not null");
            return (Criteria) this;
        }

        public Criteria andZhdzEqualTo(String value) {
            addCriterion("zhdz =", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzNotEqualTo(String value) {
            addCriterion("zhdz <>", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzGreaterThan(String value) {
            addCriterion("zhdz >", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzGreaterThanOrEqualTo(String value) {
            addCriterion("zhdz >=", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzLessThan(String value) {
            addCriterion("zhdz <", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzLessThanOrEqualTo(String value) {
            addCriterion("zhdz <=", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzLike(String value) {
            addCriterion("zhdz like", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzNotLike(String value) {
            addCriterion("zhdz not like", value, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzIn(List<String> values) {
            addCriterion("zhdz in", values, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzNotIn(List<String> values) {
            addCriterion("zhdz not in", values, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzBetween(String value1, String value2) {
            addCriterion("zhdz between", value1, value2, "zhdz");
            return (Criteria) this;
        }

        public Criteria andZhdzNotBetween(String value1, String value2) {
            addCriterion("zhdz not between", value1, value2, "zhdz");
            return (Criteria) this;
        }

        public Criteria andSbjsIsNull() {
            addCriterion("sbjs is null");
            return (Criteria) this;
        }

        public Criteria andSbjsIsNotNull() {
            addCriterion("sbjs is not null");
            return (Criteria) this;
        }

        public Criteria andSbjsEqualTo(String value) {
            addCriterion("sbjs =", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsNotEqualTo(String value) {
            addCriterion("sbjs <>", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsGreaterThan(String value) {
            addCriterion("sbjs >", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsGreaterThanOrEqualTo(String value) {
            addCriterion("sbjs >=", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsLessThan(String value) {
            addCriterion("sbjs <", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsLessThanOrEqualTo(String value) {
            addCriterion("sbjs <=", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsLike(String value) {
            addCriterion("sbjs like", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsNotLike(String value) {
            addCriterion("sbjs not like", value, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsIn(List<String> values) {
            addCriterion("sbjs in", values, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsNotIn(List<String> values) {
            addCriterion("sbjs not in", values, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsBetween(String value1, String value2) {
            addCriterion("sbjs between", value1, value2, "sbjs");
            return (Criteria) this;
        }

        public Criteria andSbjsNotBetween(String value1, String value2) {
            addCriterion("sbjs not between", value1, value2, "sbjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsIsNull() {
            addCriterion("gjjjfjs is null");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsIsNotNull() {
            addCriterion("gjjjfjs is not null");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsEqualTo(String value) {
            addCriterion("gjjjfjs =", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsNotEqualTo(String value) {
            addCriterion("gjjjfjs <>", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsGreaterThan(String value) {
            addCriterion("gjjjfjs >", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsGreaterThanOrEqualTo(String value) {
            addCriterion("gjjjfjs >=", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsLessThan(String value) {
            addCriterion("gjjjfjs <", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsLessThanOrEqualTo(String value) {
            addCriterion("gjjjfjs <=", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsLike(String value) {
            addCriterion("gjjjfjs like", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsNotLike(String value) {
            addCriterion("gjjjfjs not like", value, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsIn(List<String> values) {
            addCriterion("gjjjfjs in", values, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsNotIn(List<String> values) {
            addCriterion("gjjjfjs not in", values, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsBetween(String value1, String value2) {
            addCriterion("gjjjfjs between", value1, value2, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andGjjjfjsNotBetween(String value1, String value2) {
            addCriterion("gjjjfjs not between", value1, value2, "gjjjfjs");
            return (Criteria) this;
        }

        public Criteria andWxyjdIsNull() {
            addCriterion("wxyjd is null");
            return (Criteria) this;
        }

        public Criteria andWxyjdIsNotNull() {
            addCriterion("wxyjd is not null");
            return (Criteria) this;
        }

        public Criteria andWxyjdEqualTo(String value) {
            addCriterion("wxyjd =", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdNotEqualTo(String value) {
            addCriterion("wxyjd <>", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdGreaterThan(String value) {
            addCriterion("wxyjd >", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdGreaterThanOrEqualTo(String value) {
            addCriterion("wxyjd >=", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdLessThan(String value) {
            addCriterion("wxyjd <", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdLessThanOrEqualTo(String value) {
            addCriterion("wxyjd <=", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdLike(String value) {
            addCriterion("wxyjd like", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdNotLike(String value) {
            addCriterion("wxyjd not like", value, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdIn(List<String> values) {
            addCriterion("wxyjd in", values, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdNotIn(List<String> values) {
            addCriterion("wxyjd not in", values, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdBetween(String value1, String value2) {
            addCriterion("wxyjd between", value1, value2, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andWxyjdNotBetween(String value1, String value2) {
            addCriterion("wxyjd not between", value1, value2, "wxyjd");
            return (Criteria) this;
        }

        public Criteria andXzjzrqIsNull() {
            addCriterion("xzjzrq is null");
            return (Criteria) this;
        }

        public Criteria andXzjzrqIsNotNull() {
            addCriterion("xzjzrq is not null");
            return (Criteria) this;
        }

        public Criteria andXzjzrqEqualTo(Date value) {
            addCriterionForJDBCDate("xzjzrq =", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("xzjzrq <>", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("xzjzrq >", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xzjzrq >=", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqLessThan(Date value) {
            addCriterionForJDBCDate("xzjzrq <", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xzjzrq <=", value, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqIn(List<Date> values) {
            addCriterionForJDBCDate("xzjzrq in", values, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("xzjzrq not in", values, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xzjzrq between", value1, value2, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andXzjzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xzjzrq not between", value1, value2, "xzjzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqIsNull() {
            addCriterion("lzrq is null");
            return (Criteria) this;
        }

        public Criteria andLzrqIsNotNull() {
            addCriterion("lzrq is not null");
            return (Criteria) this;
        }

        public Criteria andLzrqEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq =", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq <>", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("lzrq >", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq >=", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqLessThan(Date value) {
            addCriterionForJDBCDate("lzrq <", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lzrq <=", value, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqIn(List<Date> values) {
            addCriterionForJDBCDate("lzrq in", values, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("lzrq not in", values, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lzrq between", value1, value2, "lzrq");
            return (Criteria) this;
        }

        public Criteria andLzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lzrq not between", value1, value2, "lzrq");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("`valid` is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("`valid` is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("`valid` =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("`valid` <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("`valid` >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`valid` >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("`valid` <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("`valid` <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("`valid` in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("`valid` not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("`valid` between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("`valid` not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("operatorid is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("operatorid is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(Integer value) {
            addCriterion("operatorid =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(Integer value) {
            addCriterion("operatorid <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(Integer value) {
            addCriterion("operatorid >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("operatorid >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(Integer value) {
            addCriterion("operatorid <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(Integer value) {
            addCriterion("operatorid <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<Integer> values) {
            addCriterion("operatorid in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<Integer> values) {
            addCriterion("operatorid not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(Integer value1, Integer value2) {
            addCriterion("operatorid between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("operatorid not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andUdateIsNull() {
            addCriterion("udate is null");
            return (Criteria) this;
        }

        public Criteria andUdateIsNotNull() {
            addCriterion("udate is not null");
            return (Criteria) this;
        }

        public Criteria andUdateEqualTo(Date value) {
            addCriterion("udate =", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotEqualTo(Date value) {
            addCriterion("udate <>", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThan(Date value) {
            addCriterion("udate >", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThanOrEqualTo(Date value) {
            addCriterion("udate >=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThan(Date value) {
            addCriterion("udate <", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThanOrEqualTo(Date value) {
            addCriterion("udate <=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateIn(List<Date> values) {
            addCriterion("udate in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotIn(List<Date> values) {
            addCriterion("udate not in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateBetween(Date value1, Date value2) {
            addCriterion("udate between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotBetween(Date value1, Date value2) {
            addCriterion("udate not between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
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
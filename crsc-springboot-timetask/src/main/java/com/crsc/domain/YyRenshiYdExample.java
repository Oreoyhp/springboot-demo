package com.crsc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YyRenshiYdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyRenshiYdExample() {
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

        public Criteria andXjIsNull() {
            addCriterion("xj is null");
            return (Criteria) this;
        }

        public Criteria andXjIsNotNull() {
            addCriterion("xj is not null");
            return (Criteria) this;
        }

        public Criteria andXjEqualTo(String value) {
            addCriterion("xj =", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotEqualTo(String value) {
            addCriterion("xj <>", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjGreaterThan(String value) {
            addCriterion("xj >", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjGreaterThanOrEqualTo(String value) {
            addCriterion("xj >=", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjLessThan(String value) {
            addCriterion("xj <", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjLessThanOrEqualTo(String value) {
            addCriterion("xj <=", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjLike(String value) {
            addCriterion("xj like", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotLike(String value) {
            addCriterion("xj not like", value, "xj");
            return (Criteria) this;
        }

        public Criteria andXjIn(List<String> values) {
            addCriterion("xj in", values, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotIn(List<String> values) {
            addCriterion("xj not in", values, "xj");
            return (Criteria) this;
        }

        public Criteria andXjBetween(String value1, String value2) {
            addCriterion("xj between", value1, value2, "xj");
            return (Criteria) this;
        }

        public Criteria andXjNotBetween(String value1, String value2) {
            addCriterion("xj not between", value1, value2, "xj");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andXzlbIsNull() {
            addCriterion("xzlb is null");
            return (Criteria) this;
        }

        public Criteria andXzlbIsNotNull() {
            addCriterion("xzlb is not null");
            return (Criteria) this;
        }

        public Criteria andXzlbEqualTo(Integer value) {
            addCriterion("xzlb =", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbNotEqualTo(Integer value) {
            addCriterion("xzlb <>", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbGreaterThan(Integer value) {
            addCriterion("xzlb >", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbGreaterThanOrEqualTo(Integer value) {
            addCriterion("xzlb >=", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbLessThan(Integer value) {
            addCriterion("xzlb <", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbLessThanOrEqualTo(Integer value) {
            addCriterion("xzlb <=", value, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbIn(List<Integer> values) {
            addCriterion("xzlb in", values, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbNotIn(List<Integer> values) {
            addCriterion("xzlb not in", values, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbBetween(Integer value1, Integer value2) {
            addCriterion("xzlb between", value1, value2, "xzlb");
            return (Criteria) this;
        }

        public Criteria andXzlbNotBetween(Integer value1, Integer value2) {
            addCriterion("xzlb not between", value1, value2, "xzlb");
            return (Criteria) this;
        }

        public Criteria andTeamischeckIsNull() {
            addCriterion("teamischeck is null");
            return (Criteria) this;
        }

        public Criteria andTeamischeckIsNotNull() {
            addCriterion("teamischeck is not null");
            return (Criteria) this;
        }

        public Criteria andTeamischeckEqualTo(Integer value) {
            addCriterion("teamischeck =", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckNotEqualTo(Integer value) {
            addCriterion("teamischeck <>", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckGreaterThan(Integer value) {
            addCriterion("teamischeck >", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamischeck >=", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckLessThan(Integer value) {
            addCriterion("teamischeck <", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckLessThanOrEqualTo(Integer value) {
            addCriterion("teamischeck <=", value, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckIn(List<Integer> values) {
            addCriterion("teamischeck in", values, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckNotIn(List<Integer> values) {
            addCriterion("teamischeck not in", values, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckBetween(Integer value1, Integer value2) {
            addCriterion("teamischeck between", value1, value2, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andTeamischeckNotBetween(Integer value1, Integer value2) {
            addCriterion("teamischeck not between", value1, value2, "teamischeck");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("isadmin is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("isadmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Integer value) {
            addCriterion("isadmin =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Integer value) {
            addCriterion("isadmin <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Integer value) {
            addCriterion("isadmin >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("isadmin >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Integer value) {
            addCriterion("isadmin <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Integer value) {
            addCriterion("isadmin <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Integer> values) {
            addCriterion("isadmin in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Integer> values) {
            addCriterion("isadmin not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Integer value1, Integer value2) {
            addCriterion("isadmin between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Integer value1, Integer value2) {
            addCriterion("isadmin not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIscjqIsNull() {
            addCriterion("iscjq is null");
            return (Criteria) this;
        }

        public Criteria andIscjqIsNotNull() {
            addCriterion("iscjq is not null");
            return (Criteria) this;
        }

        public Criteria andIscjqEqualTo(Integer value) {
            addCriterion("iscjq =", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqNotEqualTo(Integer value) {
            addCriterion("iscjq <>", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqGreaterThan(Integer value) {
            addCriterion("iscjq >", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqGreaterThanOrEqualTo(Integer value) {
            addCriterion("iscjq >=", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqLessThan(Integer value) {
            addCriterion("iscjq <", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqLessThanOrEqualTo(Integer value) {
            addCriterion("iscjq <=", value, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqIn(List<Integer> values) {
            addCriterion("iscjq in", values, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqNotIn(List<Integer> values) {
            addCriterion("iscjq not in", values, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqBetween(Integer value1, Integer value2) {
            addCriterion("iscjq between", value1, value2, "iscjq");
            return (Criteria) this;
        }

        public Criteria andIscjqNotBetween(Integer value1, Integer value2) {
            addCriterion("iscjq not between", value1, value2, "iscjq");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzIsNull() {
            addCriterion("syqjbgz is null");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzIsNotNull() {
            addCriterion("syqjbgz is not null");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzEqualTo(String value) {
            addCriterion("syqjbgz =", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzNotEqualTo(String value) {
            addCriterion("syqjbgz <>", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzGreaterThan(String value) {
            addCriterion("syqjbgz >", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzGreaterThanOrEqualTo(String value) {
            addCriterion("syqjbgz >=", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzLessThan(String value) {
            addCriterion("syqjbgz <", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzLessThanOrEqualTo(String value) {
            addCriterion("syqjbgz <=", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzLike(String value) {
            addCriterion("syqjbgz like", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzNotLike(String value) {
            addCriterion("syqjbgz not like", value, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzIn(List<String> values) {
            addCriterion("syqjbgz in", values, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzNotIn(List<String> values) {
            addCriterion("syqjbgz not in", values, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzBetween(String value1, String value2) {
            addCriterion("syqjbgz between", value1, value2, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSyqjbgzNotBetween(String value1, String value2) {
            addCriterion("syqjbgz not between", value1, value2, "syqjbgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzIsNull() {
            addCriterion("sygwgz is null");
            return (Criteria) this;
        }

        public Criteria andSygwgzIsNotNull() {
            addCriterion("sygwgz is not null");
            return (Criteria) this;
        }

        public Criteria andSygwgzEqualTo(String value) {
            addCriterion("sygwgz =", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzNotEqualTo(String value) {
            addCriterion("sygwgz <>", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzGreaterThan(String value) {
            addCriterion("sygwgz >", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzGreaterThanOrEqualTo(String value) {
            addCriterion("sygwgz >=", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzLessThan(String value) {
            addCriterion("sygwgz <", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzLessThanOrEqualTo(String value) {
            addCriterion("sygwgz <=", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzLike(String value) {
            addCriterion("sygwgz like", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzNotLike(String value) {
            addCriterion("sygwgz not like", value, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzIn(List<String> values) {
            addCriterion("sygwgz in", values, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzNotIn(List<String> values) {
            addCriterion("sygwgz not in", values, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzBetween(String value1, String value2) {
            addCriterion("sygwgz between", value1, value2, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSygwgzNotBetween(String value1, String value2) {
            addCriterion("sygwgz not between", value1, value2, "sygwgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzIsNull() {
            addCriterion("syjxgz is null");
            return (Criteria) this;
        }

        public Criteria andSyjxgzIsNotNull() {
            addCriterion("syjxgz is not null");
            return (Criteria) this;
        }

        public Criteria andSyjxgzEqualTo(String value) {
            addCriterion("syjxgz =", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzNotEqualTo(String value) {
            addCriterion("syjxgz <>", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzGreaterThan(String value) {
            addCriterion("syjxgz >", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzGreaterThanOrEqualTo(String value) {
            addCriterion("syjxgz >=", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzLessThan(String value) {
            addCriterion("syjxgz <", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzLessThanOrEqualTo(String value) {
            addCriterion("syjxgz <=", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzLike(String value) {
            addCriterion("syjxgz like", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzNotLike(String value) {
            addCriterion("syjxgz not like", value, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzIn(List<String> values) {
            addCriterion("syjxgz in", values, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzNotIn(List<String> values) {
            addCriterion("syjxgz not in", values, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzBetween(String value1, String value2) {
            addCriterion("syjxgz between", value1, value2, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyjxgzNotBetween(String value1, String value2) {
            addCriterion("syjxgz not between", value1, value2, "syjxgz");
            return (Criteria) this;
        }

        public Criteria andSyyjjtIsNull() {
            addCriterion("syyjjt is null");
            return (Criteria) this;
        }

        public Criteria andSyyjjtIsNotNull() {
            addCriterion("syyjjt is not null");
            return (Criteria) this;
        }

        public Criteria andSyyjjtEqualTo(String value) {
            addCriterion("syyjjt =", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtNotEqualTo(String value) {
            addCriterion("syyjjt <>", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtGreaterThan(String value) {
            addCriterion("syyjjt >", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtGreaterThanOrEqualTo(String value) {
            addCriterion("syyjjt >=", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtLessThan(String value) {
            addCriterion("syyjjt <", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtLessThanOrEqualTo(String value) {
            addCriterion("syyjjt <=", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtLike(String value) {
            addCriterion("syyjjt like", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtNotLike(String value) {
            addCriterion("syyjjt not like", value, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtIn(List<String> values) {
            addCriterion("syyjjt in", values, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtNotIn(List<String> values) {
            addCriterion("syyjjt not in", values, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtBetween(String value1, String value2) {
            addCriterion("syyjjt between", value1, value2, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSyyjjtNotBetween(String value1, String value2) {
            addCriterion("syyjjt not between", value1, value2, "syyjjt");
            return (Criteria) this;
        }

        public Criteria andSytotalIsNull() {
            addCriterion("sytotal is null");
            return (Criteria) this;
        }

        public Criteria andSytotalIsNotNull() {
            addCriterion("sytotal is not null");
            return (Criteria) this;
        }

        public Criteria andSytotalEqualTo(String value) {
            addCriterion("sytotal =", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalNotEqualTo(String value) {
            addCriterion("sytotal <>", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalGreaterThan(String value) {
            addCriterion("sytotal >", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalGreaterThanOrEqualTo(String value) {
            addCriterion("sytotal >=", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalLessThan(String value) {
            addCriterion("sytotal <", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalLessThanOrEqualTo(String value) {
            addCriterion("sytotal <=", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalLike(String value) {
            addCriterion("sytotal like", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalNotLike(String value) {
            addCriterion("sytotal not like", value, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalIn(List<String> values) {
            addCriterion("sytotal in", values, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalNotIn(List<String> values) {
            addCriterion("sytotal not in", values, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalBetween(String value1, String value2) {
            addCriterion("sytotal between", value1, value2, "sytotal");
            return (Criteria) this;
        }

        public Criteria andSytotalNotBetween(String value1, String value2) {
            addCriterion("sytotal not between", value1, value2, "sytotal");
            return (Criteria) this;
        }

        public Criteria andZzjbgzIsNull() {
            addCriterion("zzjbgz is null");
            return (Criteria) this;
        }

        public Criteria andZzjbgzIsNotNull() {
            addCriterion("zzjbgz is not null");
            return (Criteria) this;
        }

        public Criteria andZzjbgzEqualTo(String value) {
            addCriterion("zzjbgz =", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzNotEqualTo(String value) {
            addCriterion("zzjbgz <>", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzGreaterThan(String value) {
            addCriterion("zzjbgz >", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzGreaterThanOrEqualTo(String value) {
            addCriterion("zzjbgz >=", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzLessThan(String value) {
            addCriterion("zzjbgz <", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzLessThanOrEqualTo(String value) {
            addCriterion("zzjbgz <=", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzLike(String value) {
            addCriterion("zzjbgz like", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzNotLike(String value) {
            addCriterion("zzjbgz not like", value, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzIn(List<String> values) {
            addCriterion("zzjbgz in", values, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzNotIn(List<String> values) {
            addCriterion("zzjbgz not in", values, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzBetween(String value1, String value2) {
            addCriterion("zzjbgz between", value1, value2, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzjbgzNotBetween(String value1, String value2) {
            addCriterion("zzjbgz not between", value1, value2, "zzjbgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzIsNull() {
            addCriterion("zzgwgz is null");
            return (Criteria) this;
        }

        public Criteria andZzgwgzIsNotNull() {
            addCriterion("zzgwgz is not null");
            return (Criteria) this;
        }

        public Criteria andZzgwgzEqualTo(String value) {
            addCriterion("zzgwgz =", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzNotEqualTo(String value) {
            addCriterion("zzgwgz <>", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzGreaterThan(String value) {
            addCriterion("zzgwgz >", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzGreaterThanOrEqualTo(String value) {
            addCriterion("zzgwgz >=", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzLessThan(String value) {
            addCriterion("zzgwgz <", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzLessThanOrEqualTo(String value) {
            addCriterion("zzgwgz <=", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzLike(String value) {
            addCriterion("zzgwgz like", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzNotLike(String value) {
            addCriterion("zzgwgz not like", value, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzIn(List<String> values) {
            addCriterion("zzgwgz in", values, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzNotIn(List<String> values) {
            addCriterion("zzgwgz not in", values, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzBetween(String value1, String value2) {
            addCriterion("zzgwgz between", value1, value2, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzgwgzNotBetween(String value1, String value2) {
            addCriterion("zzgwgz not between", value1, value2, "zzgwgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzIsNull() {
            addCriterion("zzjxgz is null");
            return (Criteria) this;
        }

        public Criteria andZzjxgzIsNotNull() {
            addCriterion("zzjxgz is not null");
            return (Criteria) this;
        }

        public Criteria andZzjxgzEqualTo(String value) {
            addCriterion("zzjxgz =", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzNotEqualTo(String value) {
            addCriterion("zzjxgz <>", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzGreaterThan(String value) {
            addCriterion("zzjxgz >", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzGreaterThanOrEqualTo(String value) {
            addCriterion("zzjxgz >=", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzLessThan(String value) {
            addCriterion("zzjxgz <", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzLessThanOrEqualTo(String value) {
            addCriterion("zzjxgz <=", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzLike(String value) {
            addCriterion("zzjxgz like", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzNotLike(String value) {
            addCriterion("zzjxgz not like", value, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzIn(List<String> values) {
            addCriterion("zzjxgz in", values, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzNotIn(List<String> values) {
            addCriterion("zzjxgz not in", values, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzBetween(String value1, String value2) {
            addCriterion("zzjxgz between", value1, value2, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzjxgzNotBetween(String value1, String value2) {
            addCriterion("zzjxgz not between", value1, value2, "zzjxgz");
            return (Criteria) this;
        }

        public Criteria andZzyjjtIsNull() {
            addCriterion("zzyjjt is null");
            return (Criteria) this;
        }

        public Criteria andZzyjjtIsNotNull() {
            addCriterion("zzyjjt is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjjtEqualTo(String value) {
            addCriterion("zzyjjt =", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtNotEqualTo(String value) {
            addCriterion("zzyjjt <>", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtGreaterThan(String value) {
            addCriterion("zzyjjt >", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjjt >=", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtLessThan(String value) {
            addCriterion("zzyjjt <", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtLessThanOrEqualTo(String value) {
            addCriterion("zzyjjt <=", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtLike(String value) {
            addCriterion("zzyjjt like", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtNotLike(String value) {
            addCriterion("zzyjjt not like", value, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtIn(List<String> values) {
            addCriterion("zzyjjt in", values, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtNotIn(List<String> values) {
            addCriterion("zzyjjt not in", values, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtBetween(String value1, String value2) {
            addCriterion("zzyjjt between", value1, value2, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZzyjjtNotBetween(String value1, String value2) {
            addCriterion("zzyjjt not between", value1, value2, "zzyjjt");
            return (Criteria) this;
        }

        public Criteria andZztotalIsNull() {
            addCriterion("zztotal is null");
            return (Criteria) this;
        }

        public Criteria andZztotalIsNotNull() {
            addCriterion("zztotal is not null");
            return (Criteria) this;
        }

        public Criteria andZztotalEqualTo(String value) {
            addCriterion("zztotal =", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalNotEqualTo(String value) {
            addCriterion("zztotal <>", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalGreaterThan(String value) {
            addCriterion("zztotal >", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalGreaterThanOrEqualTo(String value) {
            addCriterion("zztotal >=", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalLessThan(String value) {
            addCriterion("zztotal <", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalLessThanOrEqualTo(String value) {
            addCriterion("zztotal <=", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalLike(String value) {
            addCriterion("zztotal like", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalNotLike(String value) {
            addCriterion("zztotal not like", value, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalIn(List<String> values) {
            addCriterion("zztotal in", values, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalNotIn(List<String> values) {
            addCriterion("zztotal not in", values, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalBetween(String value1, String value2) {
            addCriterion("zztotal between", value1, value2, "zztotal");
            return (Criteria) this;
        }

        public Criteria andZztotalNotBetween(String value1, String value2) {
            addCriterion("zztotal not between", value1, value2, "zztotal");
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
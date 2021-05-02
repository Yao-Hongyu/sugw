package com.biber.sugw.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStdidIsNull() {
            addCriterion("stdId is null");
            return (Criteria) this;
        }

        public Criteria andStdidIsNotNull() {
            addCriterion("stdId is not null");
            return (Criteria) this;
        }

        public Criteria andStdidEqualTo(Integer value) {
            addCriterion("stdId =", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidNotEqualTo(Integer value) {
            addCriterion("stdId <>", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidGreaterThan(Integer value) {
            addCriterion("stdId >", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stdId >=", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidLessThan(Integer value) {
            addCriterion("stdId <", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidLessThanOrEqualTo(Integer value) {
            addCriterion("stdId <=", value, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidIn(List<Integer> values) {
            addCriterion("stdId in", values, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidNotIn(List<Integer> values) {
            addCriterion("stdId not in", values, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidBetween(Integer value1, Integer value2) {
            addCriterion("stdId between", value1, value2, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdidNotBetween(Integer value1, Integer value2) {
            addCriterion("stdId not between", value1, value2, "stdid");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNull() {
            addCriterion("stdName is null");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNotNull() {
            addCriterion("stdName is not null");
            return (Criteria) this;
        }

        public Criteria andStdnameEqualTo(String value) {
            addCriterion("stdName =", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotEqualTo(String value) {
            addCriterion("stdName <>", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThan(String value) {
            addCriterion("stdName >", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThanOrEqualTo(String value) {
            addCriterion("stdName >=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThan(String value) {
            addCriterion("stdName <", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThanOrEqualTo(String value) {
            addCriterion("stdName <=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLike(String value) {
            addCriterion("stdName like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotLike(String value) {
            addCriterion("stdName not like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameIn(List<String> values) {
            addCriterion("stdName in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotIn(List<String> values) {
            addCriterion("stdName not in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameBetween(String value1, String value2) {
            addCriterion("stdName between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotBetween(String value1, String value2) {
            addCriterion("stdName not between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(Integer value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(Integer value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(Integer value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(Integer value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(Integer value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<Integer> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<Integer> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(Integer value1, Integer value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNull() {
            addCriterion("classNum is null");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNotNull() {
            addCriterion("classNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassnumEqualTo(String value) {
            addCriterion("classNum =", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotEqualTo(String value) {
            addCriterion("classNum <>", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThan(String value) {
            addCriterion("classNum >", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThanOrEqualTo(String value) {
            addCriterion("classNum >=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThan(String value) {
            addCriterion("classNum <", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThanOrEqualTo(String value) {
            addCriterion("classNum <=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLike(String value) {
            addCriterion("classNum like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotLike(String value) {
            addCriterion("classNum not like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIn(List<String> values) {
            addCriterion("classNum in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotIn(List<String> values) {
            addCriterion("classNum not in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumBetween(String value1, String value2) {
            addCriterion("classNum between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotBetween(String value1, String value2) {
            addCriterion("classNum not between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andStdqqIsNull() {
            addCriterion("stdQQ is null");
            return (Criteria) this;
        }

        public Criteria andStdqqIsNotNull() {
            addCriterion("stdQQ is not null");
            return (Criteria) this;
        }

        public Criteria andStdqqEqualTo(String value) {
            addCriterion("stdQQ =", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotEqualTo(String value) {
            addCriterion("stdQQ <>", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqGreaterThan(String value) {
            addCriterion("stdQQ >", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqGreaterThanOrEqualTo(String value) {
            addCriterion("stdQQ >=", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLessThan(String value) {
            addCriterion("stdQQ <", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLessThanOrEqualTo(String value) {
            addCriterion("stdQQ <=", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLike(String value) {
            addCriterion("stdQQ like", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotLike(String value) {
            addCriterion("stdQQ not like", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqIn(List<String> values) {
            addCriterion("stdQQ in", values, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotIn(List<String> values) {
            addCriterion("stdQQ not in", values, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqBetween(String value1, String value2) {
            addCriterion("stdQQ between", value1, value2, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotBetween(String value1, String value2) {
            addCriterion("stdQQ not between", value1, value2, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdphoneIsNull() {
            addCriterion("stdPhone is null");
            return (Criteria) this;
        }

        public Criteria andStdphoneIsNotNull() {
            addCriterion("stdPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStdphoneEqualTo(String value) {
            addCriterion("stdPhone =", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotEqualTo(String value) {
            addCriterion("stdPhone <>", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneGreaterThan(String value) {
            addCriterion("stdPhone >", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stdPhone >=", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLessThan(String value) {
            addCriterion("stdPhone <", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLessThanOrEqualTo(String value) {
            addCriterion("stdPhone <=", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLike(String value) {
            addCriterion("stdPhone like", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotLike(String value) {
            addCriterion("stdPhone not like", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneIn(List<String> values) {
            addCriterion("stdPhone in", values, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotIn(List<String> values) {
            addCriterion("stdPhone not in", values, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneBetween(String value1, String value2) {
            addCriterion("stdPhone between", value1, value2, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotBetween(String value1, String value2) {
            addCriterion("stdPhone not between", value1, value2, "stdphone");
            return (Criteria) this;
        }

        public Criteria andWillfirstIsNull() {
            addCriterion("willFirst is null");
            return (Criteria) this;
        }

        public Criteria andWillfirstIsNotNull() {
            addCriterion("willFirst is not null");
            return (Criteria) this;
        }

        public Criteria andWillfirstEqualTo(Integer value) {
            addCriterion("willFirst =", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstNotEqualTo(Integer value) {
            addCriterion("willFirst <>", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstGreaterThan(Integer value) {
            addCriterion("willFirst >", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("willFirst >=", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstLessThan(Integer value) {
            addCriterion("willFirst <", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstLessThanOrEqualTo(Integer value) {
            addCriterion("willFirst <=", value, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstIn(List<Integer> values) {
            addCriterion("willFirst in", values, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstNotIn(List<Integer> values) {
            addCriterion("willFirst not in", values, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstBetween(Integer value1, Integer value2) {
            addCriterion("willFirst between", value1, value2, "willfirst");
            return (Criteria) this;
        }

        public Criteria andWillfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("willFirst not between", value1, value2, "willfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstIsNull() {
            addCriterion("reasonFirst is null");
            return (Criteria) this;
        }

        public Criteria andReasonfirstIsNotNull() {
            addCriterion("reasonFirst is not null");
            return (Criteria) this;
        }

        public Criteria andReasonfirstEqualTo(String value) {
            addCriterion("reasonFirst =", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstNotEqualTo(String value) {
            addCriterion("reasonFirst <>", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstGreaterThan(String value) {
            addCriterion("reasonFirst >", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstGreaterThanOrEqualTo(String value) {
            addCriterion("reasonFirst >=", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstLessThan(String value) {
            addCriterion("reasonFirst <", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstLessThanOrEqualTo(String value) {
            addCriterion("reasonFirst <=", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstLike(String value) {
            addCriterion("reasonFirst like", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstNotLike(String value) {
            addCriterion("reasonFirst not like", value, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstIn(List<String> values) {
            addCriterion("reasonFirst in", values, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstNotIn(List<String> values) {
            addCriterion("reasonFirst not in", values, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstBetween(String value1, String value2) {
            addCriterion("reasonFirst between", value1, value2, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andReasonfirstNotBetween(String value1, String value2) {
            addCriterion("reasonFirst not between", value1, value2, "reasonfirst");
            return (Criteria) this;
        }

        public Criteria andWillsecondIsNull() {
            addCriterion("willSecond is null");
            return (Criteria) this;
        }

        public Criteria andWillsecondIsNotNull() {
            addCriterion("willSecond is not null");
            return (Criteria) this;
        }

        public Criteria andWillsecondEqualTo(Integer value) {
            addCriterion("willSecond =", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondNotEqualTo(Integer value) {
            addCriterion("willSecond <>", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondGreaterThan(Integer value) {
            addCriterion("willSecond >", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("willSecond >=", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondLessThan(Integer value) {
            addCriterion("willSecond <", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondLessThanOrEqualTo(Integer value) {
            addCriterion("willSecond <=", value, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondIn(List<Integer> values) {
            addCriterion("willSecond in", values, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondNotIn(List<Integer> values) {
            addCriterion("willSecond not in", values, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondBetween(Integer value1, Integer value2) {
            addCriterion("willSecond between", value1, value2, "willsecond");
            return (Criteria) this;
        }

        public Criteria andWillsecondNotBetween(Integer value1, Integer value2) {
            addCriterion("willSecond not between", value1, value2, "willsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondIsNull() {
            addCriterion("reasonSecond is null");
            return (Criteria) this;
        }

        public Criteria andReasonsecondIsNotNull() {
            addCriterion("reasonSecond is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsecondEqualTo(String value) {
            addCriterion("reasonSecond =", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondNotEqualTo(String value) {
            addCriterion("reasonSecond <>", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondGreaterThan(String value) {
            addCriterion("reasonSecond >", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondGreaterThanOrEqualTo(String value) {
            addCriterion("reasonSecond >=", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondLessThan(String value) {
            addCriterion("reasonSecond <", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondLessThanOrEqualTo(String value) {
            addCriterion("reasonSecond <=", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondLike(String value) {
            addCriterion("reasonSecond like", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondNotLike(String value) {
            addCriterion("reasonSecond not like", value, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondIn(List<String> values) {
            addCriterion("reasonSecond in", values, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondNotIn(List<String> values) {
            addCriterion("reasonSecond not in", values, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondBetween(String value1, String value2) {
            addCriterion("reasonSecond between", value1, value2, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andReasonsecondNotBetween(String value1, String value2) {
            addCriterion("reasonSecond not between", value1, value2, "reasonsecond");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIsNull() {
            addCriterion("isDispensing is null");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIsNotNull() {
            addCriterion("isDispensing is not null");
            return (Criteria) this;
        }

        public Criteria andIsdispensingEqualTo(String value) {
            addCriterion("isDispensing =", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotEqualTo(String value) {
            addCriterion("isDispensing <>", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingGreaterThan(String value) {
            addCriterion("isDispensing >", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingGreaterThanOrEqualTo(String value) {
            addCriterion("isDispensing >=", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingLessThan(String value) {
            addCriterion("isDispensing <", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingLessThanOrEqualTo(String value) {
            addCriterion("isDispensing <=", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingLike(String value) {
            addCriterion("isDispensing like", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotLike(String value) {
            addCriterion("isDispensing not like", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIn(List<String> values) {
            addCriterion("isDispensing in", values, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotIn(List<String> values) {
            addCriterion("isDispensing not in", values, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingBetween(String value1, String value2) {
            addCriterion("isDispensing between", value1, value2, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotBetween(String value1, String value2) {
            addCriterion("isDispensing not between", value1, value2, "isdispensing");
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
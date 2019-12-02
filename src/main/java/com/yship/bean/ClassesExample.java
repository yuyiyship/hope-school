package com.yship.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassesExample() {
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

        public Criteria andGradeidIsNull() {
            addCriterion("gradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeId =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeId <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeId >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeId >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeId <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeId <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeId in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeId not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeId between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeId not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNull() {
            addCriterion("specialtyId is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNotNull() {
            addCriterion("specialtyId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidEqualTo(Integer value) {
            addCriterion("specialtyId =", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotEqualTo(Integer value) {
            addCriterion("specialtyId <>", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThan(Integer value) {
            addCriterion("specialtyId >", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialtyId >=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThan(Integer value) {
            addCriterion("specialtyId <", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThanOrEqualTo(Integer value) {
            addCriterion("specialtyId <=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIn(List<Integer> values) {
            addCriterion("specialtyId in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotIn(List<Integer> values) {
            addCriterion("specialtyId not in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidBetween(Integer value1, Integer value2) {
            addCriterion("specialtyId between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotBetween(Integer value1, Integer value2) {
            addCriterion("specialtyId not between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("className like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("className not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("className not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassadviserIsNull() {
            addCriterion("classAdviser is null");
            return (Criteria) this;
        }

        public Criteria andClassadviserIsNotNull() {
            addCriterion("classAdviser is not null");
            return (Criteria) this;
        }

        public Criteria andClassadviserEqualTo(String value) {
            addCriterion("classAdviser =", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserNotEqualTo(String value) {
            addCriterion("classAdviser <>", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserGreaterThan(String value) {
            addCriterion("classAdviser >", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserGreaterThanOrEqualTo(String value) {
            addCriterion("classAdviser >=", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserLessThan(String value) {
            addCriterion("classAdviser <", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserLessThanOrEqualTo(String value) {
            addCriterion("classAdviser <=", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserLike(String value) {
            addCriterion("classAdviser like", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserNotLike(String value) {
            addCriterion("classAdviser not like", value, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserIn(List<String> values) {
            addCriterion("classAdviser in", values, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserNotIn(List<String> values) {
            addCriterion("classAdviser not in", values, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserBetween(String value1, String value2) {
            addCriterion("classAdviser between", value1, value2, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassadviserNotBetween(String value1, String value2) {
            addCriterion("classAdviser not between", value1, value2, "classadviser");
            return (Criteria) this;
        }

        public Criteria andClassteacherIsNull() {
            addCriterion("classTeacher is null");
            return (Criteria) this;
        }

        public Criteria andClassteacherIsNotNull() {
            addCriterion("classTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andClassteacherEqualTo(String value) {
            addCriterion("classTeacher =", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherNotEqualTo(String value) {
            addCriterion("classTeacher <>", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherGreaterThan(String value) {
            addCriterion("classTeacher >", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherGreaterThanOrEqualTo(String value) {
            addCriterion("classTeacher >=", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherLessThan(String value) {
            addCriterion("classTeacher <", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherLessThanOrEqualTo(String value) {
            addCriterion("classTeacher <=", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherLike(String value) {
            addCriterion("classTeacher like", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherNotLike(String value) {
            addCriterion("classTeacher not like", value, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherIn(List<String> values) {
            addCriterion("classTeacher in", values, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherNotIn(List<String> values) {
            addCriterion("classTeacher not in", values, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherBetween(String value1, String value2) {
            addCriterion("classTeacher between", value1, value2, "classteacher");
            return (Criteria) this;
        }

        public Criteria andClassteacherNotBetween(String value1, String value2) {
            addCriterion("classTeacher not between", value1, value2, "classteacher");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTrainingIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andTrainingIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingEqualTo(Integer value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingNotEqualTo(Integer value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingGreaterThan(Integer value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingLessThan(Integer value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingLessThanOrEqualTo(Integer value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingIn(List<Integer> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingNotIn(List<Integer> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingBetween(Integer value1, Integer value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andTrainingNotBetween(Integer value1, Integer value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andBacktrainingIsNull() {
            addCriterion("backTraining is null");
            return (Criteria) this;
        }

        public Criteria andBacktrainingIsNotNull() {
            addCriterion("backTraining is not null");
            return (Criteria) this;
        }

        public Criteria andBacktrainingEqualTo(Integer value) {
            addCriterion("backTraining =", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingNotEqualTo(Integer value) {
            addCriterion("backTraining <>", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingGreaterThan(Integer value) {
            addCriterion("backTraining >", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingGreaterThanOrEqualTo(Integer value) {
            addCriterion("backTraining >=", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingLessThan(Integer value) {
            addCriterion("backTraining <", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingLessThanOrEqualTo(Integer value) {
            addCriterion("backTraining <=", value, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingIn(List<Integer> values) {
            addCriterion("backTraining in", values, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingNotIn(List<Integer> values) {
            addCriterion("backTraining not in", values, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingBetween(Integer value1, Integer value2) {
            addCriterion("backTraining between", value1, value2, "backtraining");
            return (Criteria) this;
        }

        public Criteria andBacktrainingNotBetween(Integer value1, Integer value2) {
            addCriterion("backTraining not between", value1, value2, "backtraining");
            return (Criteria) this;
        }

        public Criteria andQuitschoolIsNull() {
            addCriterion("quitSchool is null");
            return (Criteria) this;
        }

        public Criteria andQuitschoolIsNotNull() {
            addCriterion("quitSchool is not null");
            return (Criteria) this;
        }

        public Criteria andQuitschoolEqualTo(Integer value) {
            addCriterion("quitSchool =", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolNotEqualTo(Integer value) {
            addCriterion("quitSchool <>", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolGreaterThan(Integer value) {
            addCriterion("quitSchool >", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("quitSchool >=", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolLessThan(Integer value) {
            addCriterion("quitSchool <", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolLessThanOrEqualTo(Integer value) {
            addCriterion("quitSchool <=", value, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolIn(List<Integer> values) {
            addCriterion("quitSchool in", values, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolNotIn(List<Integer> values) {
            addCriterion("quitSchool not in", values, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolBetween(Integer value1, Integer value2) {
            addCriterion("quitSchool between", value1, value2, "quitschool");
            return (Criteria) this;
        }

        public Criteria andQuitschoolNotBetween(Integer value1, Integer value2) {
            addCriterion("quitSchool not between", value1, value2, "quitschool");
            return (Criteria) this;
        }

        public Criteria andHavejobsIsNull() {
            addCriterion("haveJobs is null");
            return (Criteria) this;
        }

        public Criteria andHavejobsIsNotNull() {
            addCriterion("haveJobs is not null");
            return (Criteria) this;
        }

        public Criteria andHavejobsEqualTo(Integer value) {
            addCriterion("haveJobs =", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsNotEqualTo(Integer value) {
            addCriterion("haveJobs <>", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsGreaterThan(Integer value) {
            addCriterion("haveJobs >", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsGreaterThanOrEqualTo(Integer value) {
            addCriterion("haveJobs >=", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsLessThan(Integer value) {
            addCriterion("haveJobs <", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsLessThanOrEqualTo(Integer value) {
            addCriterion("haveJobs <=", value, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsIn(List<Integer> values) {
            addCriterion("haveJobs in", values, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsNotIn(List<Integer> values) {
            addCriterion("haveJobs not in", values, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsBetween(Integer value1, Integer value2) {
            addCriterion("haveJobs between", value1, value2, "havejobs");
            return (Criteria) this;
        }

        public Criteria andHavejobsNotBetween(Integer value1, Integer value2) {
            addCriterion("haveJobs not between", value1, value2, "havejobs");
            return (Criteria) this;
        }

        public Criteria andUnemployedIsNull() {
            addCriterion("unemployed is null");
            return (Criteria) this;
        }

        public Criteria andUnemployedIsNotNull() {
            addCriterion("unemployed is not null");
            return (Criteria) this;
        }

        public Criteria andUnemployedEqualTo(Integer value) {
            addCriterion("unemployed =", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedNotEqualTo(Integer value) {
            addCriterion("unemployed <>", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedGreaterThan(Integer value) {
            addCriterion("unemployed >", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedGreaterThanOrEqualTo(Integer value) {
            addCriterion("unemployed >=", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedLessThan(Integer value) {
            addCriterion("unemployed <", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedLessThanOrEqualTo(Integer value) {
            addCriterion("unemployed <=", value, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedIn(List<Integer> values) {
            addCriterion("unemployed in", values, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedNotIn(List<Integer> values) {
            addCriterion("unemployed not in", values, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedBetween(Integer value1, Integer value2) {
            addCriterion("unemployed between", value1, value2, "unemployed");
            return (Criteria) this;
        }

        public Criteria andUnemployedNotBetween(Integer value1, Integer value2) {
            addCriterion("unemployed not between", value1, value2, "unemployed");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateIsNull() {
            addCriterion("employmentRate is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateIsNotNull() {
            addCriterion("employmentRate is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateEqualTo(Float value) {
            addCriterion("employmentRate =", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateNotEqualTo(Float value) {
            addCriterion("employmentRate <>", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateGreaterThan(Float value) {
            addCriterion("employmentRate >", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateGreaterThanOrEqualTo(Float value) {
            addCriterion("employmentRate >=", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateLessThan(Float value) {
            addCriterion("employmentRate <", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateLessThanOrEqualTo(Float value) {
            addCriterion("employmentRate <=", value, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateIn(List<Float> values) {
            addCriterion("employmentRate in", values, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateNotIn(List<Float> values) {
            addCriterion("employmentRate not in", values, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateBetween(Float value1, Float value2) {
            addCriterion("employmentRate between", value1, value2, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andEmploymentrateNotBetween(Float value1, Float value2) {
            addCriterion("employmentRate not between", value1, value2, "employmentrate");
            return (Criteria) this;
        }

        public Criteria andActivitiesIsNull() {
            addCriterion("activities is null");
            return (Criteria) this;
        }

        public Criteria andActivitiesIsNotNull() {
            addCriterion("activities is not null");
            return (Criteria) this;
        }

        public Criteria andActivitiesEqualTo(Integer value) {
            addCriterion("activities =", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotEqualTo(Integer value) {
            addCriterion("activities <>", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesGreaterThan(Integer value) {
            addCriterion("activities >", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("activities >=", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesLessThan(Integer value) {
            addCriterion("activities <", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesLessThanOrEqualTo(Integer value) {
            addCriterion("activities <=", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesIn(List<Integer> values) {
            addCriterion("activities in", values, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotIn(List<Integer> values) {
            addCriterion("activities not in", values, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesBetween(Integer value1, Integer value2) {
            addCriterion("activities between", value1, value2, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotBetween(Integer value1, Integer value2) {
            addCriterion("activities not between", value1, value2, "activities");
            return (Criteria) this;
        }

        public Criteria andExceptionsIsNull() {
            addCriterion("exceptions is null");
            return (Criteria) this;
        }

        public Criteria andExceptionsIsNotNull() {
            addCriterion("exceptions is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionsEqualTo(Integer value) {
            addCriterion("exceptions =", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsNotEqualTo(Integer value) {
            addCriterion("exceptions <>", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsGreaterThan(Integer value) {
            addCriterion("exceptions >", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("exceptions >=", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsLessThan(Integer value) {
            addCriterion("exceptions <", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsLessThanOrEqualTo(Integer value) {
            addCriterion("exceptions <=", value, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsIn(List<Integer> values) {
            addCriterion("exceptions in", values, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsNotIn(List<Integer> values) {
            addCriterion("exceptions not in", values, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsBetween(Integer value1, Integer value2) {
            addCriterion("exceptions between", value1, value2, "exceptions");
            return (Criteria) this;
        }

        public Criteria andExceptionsNotBetween(Integer value1, Integer value2) {
            addCriterion("exceptions not between", value1, value2, "exceptions");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Boolean value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Boolean value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Boolean value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Boolean value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Boolean value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Boolean> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Boolean> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Boolean value1, Boolean value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("close not between", value1, value2, "close");
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
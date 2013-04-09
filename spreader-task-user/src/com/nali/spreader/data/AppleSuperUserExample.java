package com.nali.spreader.data;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppleSuperUserExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public AppleSuperUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    protected AppleSuperUserExample(AppleSuperUserExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_apple_super_user
     *
     * @ibatorgenerated Mon Apr 08 17:25:13 CST 2013
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }
    }
}
package com.nali.spreader.model;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RobotUserExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public RobotUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    protected RobotUserExample(RobotUserExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
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
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Fri Aug 22 16:07:18 CST 2014
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

        public Criteria andWebsiteIdIsNull() {
            addCriterion("website_id is null");
            return this;
        }

        public Criteria andWebsiteIdIsNotNull() {
            addCriterion("website_id is not null");
            return this;
        }

        public Criteria andWebsiteIdEqualTo(Integer value) {
            addCriterion("website_id =", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotEqualTo(Integer value) {
            addCriterion("website_id <>", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdGreaterThan(Integer value) {
            addCriterion("website_id >", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("website_id >=", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdLessThan(Integer value) {
            addCriterion("website_id <", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("website_id <=", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdIn(List<Integer> values) {
            addCriterion("website_id in", values, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotIn(List<Integer> values) {
            addCriterion("website_id not in", values, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("website_id between", value1, value2, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("website_id not between", value1, value2, "websiteId");
            return this;
        }

        public Criteria andWebsiteUidIsNull() {
            addCriterion("website_uid is null");
            return this;
        }

        public Criteria andWebsiteUidIsNotNull() {
            addCriterion("website_uid is not null");
            return this;
        }

        public Criteria andWebsiteUidEqualTo(Long value) {
            addCriterion("website_uid =", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotEqualTo(Long value) {
            addCriterion("website_uid <>", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidGreaterThan(Long value) {
            addCriterion("website_uid >", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidGreaterThanOrEqualTo(Long value) {
            addCriterion("website_uid >=", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidLessThan(Long value) {
            addCriterion("website_uid <", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidLessThanOrEqualTo(Long value) {
            addCriterion("website_uid <=", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidIn(List<Long> values) {
            addCriterion("website_uid in", values, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotIn(List<Long> values) {
            addCriterion("website_uid not in", values, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidBetween(Long value1, Long value2) {
            addCriterion("website_uid between", value1, value2, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotBetween(Long value1, Long value2) {
            addCriterion("website_uid not between", value1, value2, "websiteUid");
            return this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
            return this;
        }

        public Criteria andRobotRegisterIdIsNull() {
            addCriterion("robot_register_id is null");
            return this;
        }

        public Criteria andRobotRegisterIdIsNotNull() {
            addCriterion("robot_register_id is not null");
            return this;
        }

        public Criteria andRobotRegisterIdEqualTo(Long value) {
            addCriterion("robot_register_id =", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdNotEqualTo(Long value) {
            addCriterion("robot_register_id <>", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdGreaterThan(Long value) {
            addCriterion("robot_register_id >", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("robot_register_id >=", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdLessThan(Long value) {
            addCriterion("robot_register_id <", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdLessThanOrEqualTo(Long value) {
            addCriterion("robot_register_id <=", value, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdIn(List<Long> values) {
            addCriterion("robot_register_id in", values, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdNotIn(List<Long> values) {
            addCriterion("robot_register_id not in", values, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdBetween(Long value1, Long value2) {
            addCriterion("robot_register_id between", value1, value2, "robotRegisterId");
            return this;
        }

        public Criteria andRobotRegisterIdNotBetween(Long value1, Long value2) {
            addCriterion("robot_register_id not between", value1, value2, "robotRegisterId");
            return this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("account_state is null");
            return this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("account_state is not null");
            return this;
        }

        public Criteria andAccountStateEqualTo(Integer value) {
            addCriterion("account_state =", value, "accountState");
            return this;
        }

        public Criteria andAccountStateNotEqualTo(Integer value) {
            addCriterion("account_state <>", value, "accountState");
            return this;
        }

        public Criteria andAccountStateGreaterThan(Integer value) {
            addCriterion("account_state >", value, "accountState");
            return this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_state >=", value, "accountState");
            return this;
        }

        public Criteria andAccountStateLessThan(Integer value) {
            addCriterion("account_state <", value, "accountState");
            return this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(Integer value) {
            addCriterion("account_state <=", value, "accountState");
            return this;
        }

        public Criteria andAccountStateIn(List<Integer> values) {
            addCriterion("account_state in", values, "accountState");
            return this;
        }

        public Criteria andAccountStateNotIn(List<Integer> values) {
            addCriterion("account_state not in", values, "accountState");
            return this;
        }

        public Criteria andAccountStateBetween(Integer value1, Integer value2) {
            addCriterion("account_state between", value1, value2, "accountState");
            return this;
        }

        public Criteria andAccountStateNotBetween(Integer value1, Integer value2) {
            addCriterion("account_state not between", value1, value2, "accountState");
            return this;
        }

        public Criteria andPayingTagIsNull() {
            addCriterion("paying_tag is null");
            return this;
        }

        public Criteria andPayingTagIsNotNull() {
            addCriterion("paying_tag is not null");
            return this;
        }

        public Criteria andPayingTagEqualTo(Integer value) {
            addCriterion("paying_tag =", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagNotEqualTo(Integer value) {
            addCriterion("paying_tag <>", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagGreaterThan(Integer value) {
            addCriterion("paying_tag >", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("paying_tag >=", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagLessThan(Integer value) {
            addCriterion("paying_tag <", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagLessThanOrEqualTo(Integer value) {
            addCriterion("paying_tag <=", value, "payingTag");
            return this;
        }

        public Criteria andPayingTagIn(List<Integer> values) {
            addCriterion("paying_tag in", values, "payingTag");
            return this;
        }

        public Criteria andPayingTagNotIn(List<Integer> values) {
            addCriterion("paying_tag not in", values, "payingTag");
            return this;
        }

        public Criteria andPayingTagBetween(Integer value1, Integer value2) {
            addCriterion("paying_tag between", value1, value2, "payingTag");
            return this;
        }

        public Criteria andPayingTagNotBetween(Integer value1, Integer value2) {
            addCriterion("paying_tag not between", value1, value2, "payingTag");
            return this;
        }
    }
}
package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;

public class Admin extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String userName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.pwd
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String pwd;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.role
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer role;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.employee_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer employeeId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String realName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_admin.last_login_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Date lastLoginTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.id
     *
     * @return the value of spreader.tb_admin.id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.id
     *
     * @param id the value for spreader.tb_admin.id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.user_name
     *
     * @return the value of spreader.tb_admin.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.user_name
     *
     * @param userName the value for spreader.tb_admin.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.pwd
     *
     * @return the value of spreader.tb_admin.pwd
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.pwd
     *
     * @param pwd the value for spreader.tb_admin.pwd
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.role
     *
     * @return the value of spreader.tb_admin.role
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.role
     *
     * @param role the value for spreader.tb_admin.role
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.employee_id
     *
     * @return the value of spreader.tb_admin.employee_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.employee_id
     *
     * @param employeeId the value for spreader.tb_admin.employee_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.real_name
     *
     * @return the value of spreader.tb_admin.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.real_name
     *
     * @param realName the value for spreader.tb_admin.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.create_time
     *
     * @return the value of spreader.tb_admin.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.create_time
     *
     * @param createTime the value for spreader.tb_admin.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_admin.last_login_time
     *
     * @return the value of spreader.tb_admin.last_login_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_admin.last_login_time
     *
     * @param lastLoginTime the value for spreader.tb_admin.last_login_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
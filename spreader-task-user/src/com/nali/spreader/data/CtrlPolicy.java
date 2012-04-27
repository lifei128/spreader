package com.nali.spreader.data;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;
import com.nali.stat.dc.util.TimeUnit;

public class CtrlPolicy extends BaseModel implements Serializable {

    public static final CtrlPolicy DEFAULT_CTRL_POLICY;

    static {
        DEFAULT_CTRL_POLICY = new CtrlPolicy();
        DEFAULT_CTRL_POLICY.setCount(Integer.MAX_VALUE);
        DEFAULT_CTRL_POLICY.setId(0L);
        DEFAULT_CTRL_POLICY.setCtrlGid(-1L);
        DEFAULT_CTRL_POLICY.setTimeunit(TimeUnit.DAY.getVal());
    }

    private TimeUnit timeUnitEnum;


    public TimeUnit getTimeUnitEnum() {
        return timeUnitEnum;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.id
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.ctrl_gid
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Long ctrlGid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.task_code
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private String taskCode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Integer count;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.timeunit
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Integer timeunit;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.create_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.last_modified_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Date lastModifiedTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_ctrl_policy.unit_count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    private Integer unitCount;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.id
     *
     * @return the value of spreader.tb_ctrl_policy.id
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.id
     *
     * @param id the value for spreader.tb_ctrl_policy.id
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.ctrl_gid
     *
     * @return the value of spreader.tb_ctrl_policy.ctrl_gid
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Long getCtrlGid() {
        return ctrlGid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.ctrl_gid
     *
     * @param ctrlGid the value for spreader.tb_ctrl_policy.ctrl_gid
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setCtrlGid(Long ctrlGid) {
        this.ctrlGid = ctrlGid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.task_code
     *
     * @return the value of spreader.tb_ctrl_policy.task_code
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.task_code
     *
     * @param taskCode the value for spreader.tb_ctrl_policy.task_code
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.count
     *
     * @return the value of spreader.tb_ctrl_policy.count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.count
     *
     * @param count the value for spreader.tb_ctrl_policy.count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.timeunit
     *
     * @return the value of spreader.tb_ctrl_policy.timeunit
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Integer getTimeunit() {
        return timeunit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.timeunit
     *
     * @param timeunit the value for spreader.tb_ctrl_policy.timeunit
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setTimeunit(Integer timeunit) {
        this.timeunit = timeunit;
        this.timeUnitEnum = TimeUnit.getTimeUnitByVal(timeunit);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.create_time
     *
     * @return the value of spreader.tb_ctrl_policy.create_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.create_time
     *
     * @param createTime the value for spreader.tb_ctrl_policy.create_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.last_modified_time
     *
     * @return the value of spreader.tb_ctrl_policy.last_modified_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.last_modified_time
     *
     * @param lastModifiedTime the value for spreader.tb_ctrl_policy.last_modified_time
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_ctrl_policy.unit_count
     *
     * @return the value of spreader.tb_ctrl_policy.unit_count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_ctrl_policy.unit_count
     *
     * @param unitCount the value for spreader.tb_ctrl_policy.unit_count
     *
     * @ibatorgenerated Mon Apr 09 16:55:01 CST 2012
     */
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }
}
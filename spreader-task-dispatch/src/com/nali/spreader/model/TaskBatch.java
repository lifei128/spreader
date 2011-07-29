package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;

import com.nali.common.model.BaseModel;

public class TaskBatch extends BaseModel implements Serializable {
    private static final long serialVersionUID = 8273136403174708236L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_batch.id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_batch.uid
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    private Long uid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_batch.client_id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    private Long clientId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_batch.expire_time
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    private Date expireTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_batch.id
     *
     * @return the value of spreader.tb_task_batch.id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_batch.id
     *
     * @param id the value for spreader.tb_task_batch.id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_batch.uid
     *
     * @return the value of spreader.tb_task_batch.uid
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_batch.uid
     *
     * @param uid the value for spreader.tb_task_batch.uid
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_batch.client_id
     *
     * @return the value of spreader.tb_task_batch.client_id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_batch.client_id
     *
     * @param clientId the value for spreader.tb_task_batch.client_id
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_batch.expire_time
     *
     * @return the value of spreader.tb_task_batch.expire_time
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_batch.expire_time
     *
     * @param expireTime the value for spreader.tb_task_batch.expire_time
     *
     * @ibatorgenerated Wed Jul 20 16:44:35 CST 2011
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}
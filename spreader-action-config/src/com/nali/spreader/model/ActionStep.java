package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;

public class ActionStep extends BaseModel implements Serializable {
    private static final long serialVersionUID = 904266762982248510L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private Long actionId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private String urlConfig;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.type
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private String type;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.post_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private String postConfig;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.fetch_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    private String fetchConfig;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.id
     *
     * @return the value of spreader.tb_action_step.id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.id
     *
     * @param id the value for spreader.tb_action_step.id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.action_id
     *
     * @return the value of spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.action_id
     *
     * @param actionId the value for spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.url_config
     *
     * @return the value of spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public String getUrlConfig() {
        return urlConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.url_config
     *
     * @param urlConfig the value for spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setUrlConfig(String urlConfig) {
        this.urlConfig = urlConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.type
     *
     * @return the value of spreader.tb_action_step.type
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.type
     *
     * @param type the value for spreader.tb_action_step.type
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.post_config
     *
     * @return the value of spreader.tb_action_step.post_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public String getPostConfig() {
        return postConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.post_config
     *
     * @param postConfig the value for spreader.tb_action_step.post_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setPostConfig(String postConfig) {
        this.postConfig = postConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.fetch_config
     *
     * @return the value of spreader.tb_action_step.fetch_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public String getFetchConfig() {
        return fetchConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.fetch_config
     *
     * @param fetchConfig the value for spreader.tb_action_step.fetch_config
     *
     * @ibatorgenerated Wed Jul 20 16:30:56 CST 2011
     */
    public void setFetchConfig(String fetchConfig) {
        this.fetchConfig = fetchConfig;
    }
}
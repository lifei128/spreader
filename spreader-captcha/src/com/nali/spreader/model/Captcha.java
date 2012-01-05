package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;

public class Captcha extends BaseModel implements Serializable {

    private static final long serialVersionUID = -6747910756252222626L;

    public static final Integer TYPE_FINISH = 0;

    public static final Integer TYPE_HANDLING = 1;

    public static final Integer TYPE_MANUAL = 2;
    
    private Long timeLeftMillis;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.expire_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Date expireTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.type
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Integer type;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.result
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private String result;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.post_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Long postClient;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.handle_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Long handleClient;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.handle_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Date handleTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.task_id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Long taskId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.seq
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private Integer seq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_captcha.data
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    private byte[] data;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.id
     *
     * @return the value of spreader.tb_captcha.id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.id
     *
     * @param id the value for spreader.tb_captcha.id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.expire_time
     *
     * @return the value of spreader.tb_captcha.expire_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.expire_time
     *
     * @param expireTime the value for spreader.tb_captcha.expire_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.type
     *
     * @return the value of spreader.tb_captcha.type
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.type
     *
     * @param type the value for spreader.tb_captcha.type
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.result
     *
     * @return the value of spreader.tb_captcha.result
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.result
     *
     * @param result the value for spreader.tb_captcha.result
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.post_client
     *
     * @return the value of spreader.tb_captcha.post_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Long getPostClient() {
        return postClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.post_client
     *
     * @param postClient the value for spreader.tb_captcha.post_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setPostClient(Long postClient) {
        this.postClient = postClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.handle_client
     *
     * @return the value of spreader.tb_captcha.handle_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Long getHandleClient() {
        return handleClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.handle_client
     *
     * @param handleClient the value for spreader.tb_captcha.handle_client
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setHandleClient(Long handleClient) {
        this.handleClient = handleClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.handle_time
     *
     * @return the value of spreader.tb_captcha.handle_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.handle_time
     *
     * @param handleTime the value for spreader.tb_captcha.handle_time
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.task_id
     *
     * @return the value of spreader.tb_captcha.task_id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.task_id
     *
     * @param taskId the value for spreader.tb_captcha.task_id
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.seq
     *
     * @return the value of spreader.tb_captcha.seq
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.seq
     *
     * @param seq the value for spreader.tb_captcha.seq
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_captcha.data
     *
     * @return the value of spreader.tb_captcha.data
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public byte[] getData() {
        return data;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_captcha.data
     *
     * @param data the value for spreader.tb_captcha.data
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    public void setData(byte[] data) {
        this.data = data;
    }

	public Long getTimeLeftMillis() {
		return timeLeftMillis;
	}

	public void setTimeLeftMillis(Long timeLeftMillis) {
		this.timeLeftMillis = timeLeftMillis;
	}
}

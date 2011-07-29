package com.nali.spreader.model;

import java.io.Serializable;
import com.nali.common.model.BaseModel;

public class Parameters extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_parameters.param_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Long paramId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_parameters.tempate_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer tempateId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_parameters.name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String name;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_parameters.param_id
     *
     * @return the value of spreader.tb_parameters.param_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Long getParamId() {
        return paramId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_parameters.param_id
     *
     * @param paramId the value for spreader.tb_parameters.param_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_parameters.tempate_id
     *
     * @return the value of spreader.tb_parameters.tempate_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getTempateId() {
        return tempateId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_parameters.tempate_id
     *
     * @param tempateId the value for spreader.tb_parameters.tempate_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setTempateId(Integer tempateId) {
        this.tempateId = tempateId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_parameters.name
     *
     * @return the value of spreader.tb_parameters.name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_parameters.name
     *
     * @param name the value for spreader.tb_parameters.name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setName(String name) {
        this.name = name;
    }
}
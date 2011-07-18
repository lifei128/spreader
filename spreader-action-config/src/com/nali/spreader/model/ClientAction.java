package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;
import java.util.List;

public class ClientAction extends BaseModel implements Serializable {
	private static final long serialVersionUID = -1616478963855814084L;

	private List<ActionStep> stepList;
	
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_action.id
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_action.logic_type
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    private Integer logicType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_action.cool_down_seconds
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    private Long coolDownSeconds;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_action.return_config
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    private String returnConfig;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_action.id
     *
     * @return the value of spreader.tb_client_action.id
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_action.id
     *
     * @param id the value for spreader.tb_client_action.id
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_action.logic_type
     *
     * @return the value of spreader.tb_client_action.logic_type
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public Integer getLogicType() {
        return logicType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_action.logic_type
     *
     * @param logicType the value for spreader.tb_client_action.logic_type
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void setLogicType(Integer logicType) {
        this.logicType = logicType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_action.cool_down_seconds
     *
     * @return the value of spreader.tb_client_action.cool_down_seconds
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public Long getCoolDownSeconds() {
        return coolDownSeconds;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_action.cool_down_seconds
     *
     * @param coolDownSeconds the value for spreader.tb_client_action.cool_down_seconds
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void setCoolDownSeconds(Long coolDownSeconds) {
        this.coolDownSeconds = coolDownSeconds;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_action.return_config
     *
     * @return the value of spreader.tb_client_action.return_config
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public String getReturnConfig() {
        return returnConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_action.return_config
     *
     * @param returnConfig the value for spreader.tb_client_action.return_config
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void setReturnConfig(String returnConfig) {
        this.returnConfig = returnConfig;
    }

	public List<ActionStep> getStepList() {
		return stepList;
	}

	public void setStepList(List<ActionStep> stepList) {
		this.stepList = stepList;
	}
}
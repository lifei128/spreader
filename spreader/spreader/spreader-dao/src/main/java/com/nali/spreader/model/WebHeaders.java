package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;

public class WebHeaders extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_web_headers.id
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_web_headers.name
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_web_headers.value
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private String value;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_web_headers.id
     *
     * @return the value of spreader.tb_web_headers.id
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_web_headers.id
     *
     * @param id the value for spreader.tb_web_headers.id
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_web_headers.name
     *
     * @return the value of spreader.tb_web_headers.name
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_web_headers.name
     *
     * @param name the value for spreader.tb_web_headers.name
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_web_headers.value
     *
     * @return the value of spreader.tb_web_headers.value
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_web_headers.value
     *
     * @param value the value for spreader.tb_web_headers.value
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setValue(String value) {
        this.value = value;
    }
}

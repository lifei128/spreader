package com.nali.spreader.dao;

import com.nali.spreader.model.Captcha;
import com.nali.spreader.model.CaptchaExample;
import java.util.List;

public interface ICrudCaptchaDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int countByExample(CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int deleteByExample(CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    void insert(Captcha record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    void insertSelective(Captcha record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    List<Captcha> selectByExampleWithBLOBs(CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    List<Captcha> selectByExampleWithoutBLOBs(CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    Captcha selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByExampleSelective(Captcha record, CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByExampleWithBLOBs(Captcha record, CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByExampleWithoutBLOBs(Captcha record, CaptchaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByPrimaryKeySelective(Captcha record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByPrimaryKeyWithBLOBs(Captcha record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_captcha
     *
     * @ibatorgenerated Thu Jan 05 11:29:34 CST 2012
     */
    int updateByPrimaryKeyWithoutBLOBs(Captcha record);
}

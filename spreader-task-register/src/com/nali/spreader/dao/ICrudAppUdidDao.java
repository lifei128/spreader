package com.nali.spreader.dao;

import java.util.List;
import com.nali.spreader.data.AppUdid;
import com.nali.spreader.data.AppUdidExample;

public interface ICrudAppUdidDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int countByExample(AppUdidExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int deleteByExample(AppUdidExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int deleteByPrimaryKey(Long registerId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    void insert(AppUdid record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    void insertSelective(AppUdid record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    List<AppUdid> selectByExample(AppUdidExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    AppUdid selectByPrimaryKey(Long registerId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int updateByExampleSelective(AppUdid record, AppUdidExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int updateByExample(AppUdid record, AppUdidExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int updateByPrimaryKeySelective(AppUdid record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_app_udid
     *
     * @ibatorgenerated Mon Apr 08 16:58:06 CST 2013
     */
    int updateByPrimaryKey(AppUdid record);
}

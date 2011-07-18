package com.nali.spreader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.spreader.dao.ICrudWebsitesDao;
import com.nali.spreader.model.Websites;
import com.nali.spreader.model.WebsitesExample;

@Repository
public class CrudWebsitesDao implements ICrudWebsitesDao {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public CrudWebsitesDao() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int countByExample(WebsitesExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("spreader_tb_websites.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int deleteByExample(WebsitesExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_websites.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int deleteByPrimaryKey(Integer id) {
        Websites key = new Websites();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_websites.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void insert(Websites record) {
        getSqlMapClientTemplate().insert("spreader_tb_websites.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public void insertSelective(Websites record) {
        getSqlMapClientTemplate().insert("spreader_tb_websites.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<Websites> selectByExample(WebsitesExample example) {
        List<Websites> list = getSqlMapClientTemplate().queryForList("spreader_tb_websites.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public Websites selectByPrimaryKey(Integer id) {
        Websites key = new Websites();
        key.setId(id);
        Websites record = (Websites) getSqlMapClientTemplate().queryForObject("spreader_tb_websites.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int updateByExampleSelective(Websites record, WebsitesExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_websites.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int updateByExample(Websites record, WebsitesExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_websites.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int updateByPrimaryKeySelective(Websites record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_websites.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public int updateByPrimaryKey(Websites record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_websites.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_websites
     *
     * @ibatorgenerated Mon Jul 18 15:02:49 CST 2011
     */
    private static class UpdateByExampleParms extends WebsitesExample {
        private Object record;

        public UpdateByExampleParms(Object record, WebsitesExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
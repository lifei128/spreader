package com.nali.spreader.dao.impl;

import com.nali.spreader.dao.ICrudDataTypeDao;
import com.nali.spreader.model.DataType;
import com.nali.spreader.model.DataTypeExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CrudDataTypeDao implements ICrudDataTypeDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Sat Mar 12 17:19:21 CST 2011
     */
    public CrudDataTypeDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int countByExample(DataTypeExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_data_type.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int deleteByExample(DataTypeExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_data_type.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int deleteByPrimaryKey(Integer id) {
        DataType key = new DataType();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_data_type.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void insert(DataType record) {
        getSqlMapClientTemplate().insert("spreader_tb_data_type.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public void insertSelective(DataType record) {
        getSqlMapClientTemplate().insert("spreader_tb_data_type.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public List selectByExample(DataTypeExample example) {
        List list = getSqlMapClientTemplate().queryForList("spreader_tb_data_type.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public DataType selectByPrimaryKey(Integer id) {
        DataType key = new DataType();
        key.setId(id);
        DataType record = (DataType) getSqlMapClientTemplate().queryForObject("spreader_tb_data_type.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int updateByExampleSelective(DataType record, DataTypeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_data_type.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int updateByExample(DataType record, DataTypeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_data_type.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int updateByPrimaryKeySelective(DataType record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_data_type.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public int updateByPrimaryKey(DataType record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_data_type.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_data_type
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    private static class UpdateByExampleParms extends DataTypeExample {

        private Object record;

        public UpdateByExampleParms(Object record, DataTypeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
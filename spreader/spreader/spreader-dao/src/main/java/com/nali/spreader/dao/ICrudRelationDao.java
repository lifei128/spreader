package com.nali.spreader.dao;

import com.nali.spreader.model.Relation;
import com.nali.spreader.model.RelationExample;
import java.util.List;

public interface ICrudRelationDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int countByExample(RelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int deleteByExample(RelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    void insert(Relation record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    void insertSelective(Relation record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    List selectByExample(RelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByExampleSelective(Relation record, RelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_relation
     *
     * @ibatorgenerated Thu Mar 31 15:39:48 CST 2011
     */
    int updateByExample(Relation record, RelationExample example);
}
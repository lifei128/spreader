package com.nali.spreader.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.common.model.Limit;
import com.nali.common.util.CollectionUtils;
import com.nali.lang.StringUtils;
import com.nali.spreader.constants.Website;
import com.nali.spreader.dao.IUserGroupDao;
import com.nali.spreader.data.UserGroup;
import com.nali.spreader.group.meta.UserGroupType;

@Repository
public class UserGroupDao implements IUserGroupDao {

	@Autowired
	private SqlMapClientTemplate sqlMap;
	
	@Override
	public List<UserGroup> queryUserGroups(Website website, String gname,
			UserGroupType userGroupType, int propVal, Date fromModifiedTime,
			Date toModifiedTime, Limit limit) {
		Map<String,Object> parameterMap = CollectionUtils.newHashMap(7);
		this.assembleParamterMap(parameterMap, website, gname, userGroupType, propVal, fromModifiedTime, toModifiedTime);
		
		if(limit != null) {
			parameterMap.put("limit", limit);
		}
		return this.sqlMap.queryForList("spreader_user_group.queryUserGroupByCriteria", parameterMap);
	}

	@Override
	public int getUserGroupCount(Website website, String gname,
			UserGroupType userGroupType, int propVal, Date fromModifiedTime,
			Date toModifiedTime) {
		Map<String,Object> parameterMap = CollectionUtils.newHashMap(6);
		this.assembleParamterMap(parameterMap, website, gname, userGroupType, propVal, fromModifiedTime, toModifiedTime);
		return (Integer) this.sqlMap.queryForObject("spreader_user_group.getUserGroupCountByCriteria", parameterMap);
	}
	
	private void assembleParamterMap(Map<String, Object> parameterMap, Website website, String gname,
			UserGroupType userGroupType, int propVal, Date fromModifiedTime,
			Date toModifiedTime) {
		if(website != null) {
			parameterMap.put("website", website.getId());
		}
		
		if(StringUtils.isNotEmptyNoOffset(gname)) {
			parameterMap.put("gname", gname);
		}
		
		if(userGroupType != null) {
			parameterMap.put("gtype", userGroupType.getTypeVal());
		}
		
		if(propVal > 0) {
			parameterMap.put("propVal", propVal);
		}
		
		if(fromModifiedTime != null) {
			parameterMap.put("fromModifiedTime", fromModifiedTime);
		}
		
		if(toModifiedTime != null) {
			parameterMap.put("toModifiedTime", toModifiedTime);
		}
	}
}
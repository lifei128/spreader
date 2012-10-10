package com.nali.spreader.service.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nali.common.util.CollectionUtils;
import com.nali.spreader.constants.Website;
import com.nali.spreader.dao.ICrudRobotUserDao;
import com.nali.spreader.model.RobotUser;
import com.nali.spreader.remote.ILoginConfigManageService;
import com.nali.spreader.service.IGlobalRobotUserService;

@Service
public class GlobalRobotUserService implements IGlobalRobotUserService {
	private static Logger logger = Logger.getLogger(GlobalRobotUserService.class);
	private static ObjectMapper objectMapper = new ObjectMapper();
	@Autowired
	private ILoginConfigManageService loginConfigManageService;
	@Autowired
	private ICrudRobotUserDao crudRobotUserDao;

	//TODO temp code
	private Long getLoginActionId(Integer websiteId) {
		if(Website.weibo.getId().equals(websiteId)) {
			return 3L;
		} else if(Website.apple.getId().equals(websiteId)) {
			return 2003L;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void disableAccount(Long uid) {
		changeAccountStatus(uid, RobotUser.ACCOUNT_STATE_DISABLE);
	}
	
	@Override
	public void accountLimited(Long uid) {
		changeAccountStatus(uid, RobotUser.ACCOUNT_STATE_LIMITED);
	}
	
	@Override
	public void changeAccountStatus(Long uid, Integer status) {
		RobotUser record = new RobotUser();
		record.setUid(uid);
		record.setAccountState(status);
		crudRobotUserDao.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public void resumeAccount(Long uid) {
		RobotUser record = new RobotUser();
		record.setUid(uid);
		record.setAccountState(RobotUser.ACCOUNT_STATE_NORMAL);
		crudRobotUserDao.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public void syncLoginConfig(RobotUser robotUser) {
		try {//TODO delete "if else if" statement...
			if(Website.weibo.getId().equals(robotUser.getWebsiteId())) {
				Map<String, Object> contentObjects = CollectionUtils.newHashMap(2);
				contentObjects.put("name", robotUser.getLoginName());
				contentObjects.put("password", robotUser.getLoginPwd());
				String contents = objectMapper.writeValueAsString(contentObjects);
				loginConfigManageService.mergeLoginConfigByUid(robotUser.getUid(), getLoginActionId(robotUser.getWebsiteId()), contents);
			} else if(Website.apple.getId().equals(robotUser.getWebsiteId())) {
				Map<String, Object> contentObjects = CollectionUtils.newHashMap(2);
				String[] loginNames = robotUser.getLoginName().split("\\#");
				contentObjects.put("name", loginNames[0]);
				contentObjects.put("udid", loginNames[1]);
				contentObjects.put("password", robotUser.getLoginPwd());
				String contents = objectMapper.writeValueAsString(contentObjects);
				loginConfigManageService.mergeLoginConfigByUid(robotUser.getUid(), getLoginActionId(robotUser.getWebsiteId()), contents);
			} else {
				throw new IllegalArgumentException("unknown website id:"+robotUser.getWebsiteId());
			}
		} catch (Exception e) {
			logger.error(e, e);
		}
	}

	@Override
	public RobotUser getRobotUser(Long uid) {
		return crudRobotUserDao.selectByPrimaryKey(uid);
	}

}

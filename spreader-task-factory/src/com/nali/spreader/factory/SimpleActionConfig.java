package com.nali.spreader.factory;

public enum SimpleActionConfig {
	fetchWeiboStarUser(1L),
	fetchWeiboUserMainPage(2L),
	fetchUserAttentions(7L),//3有人用
	registerRobotUserEmail(8L),
	registerWeibo(9L),
	activeWeibo(10L),
	;
	private Long actionId;
	private String taskCode;
	private SimpleActionConfig(String taskCode, Long actionId) {
		this.actionId = actionId;
		setTaskCode(taskCode);//TODO 对code加密
	}
	private SimpleActionConfig(Long actionId) {
		this.actionId = actionId;
		setTaskCode(name());
	}
	public Long getActionId() {
		return actionId;
	}
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	public String getTaskCode() {
		return taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
}
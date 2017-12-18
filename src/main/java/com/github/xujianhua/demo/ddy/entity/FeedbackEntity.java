
package com.github.xujianhua.demo.ddy.entity;


public class FeedbackEntity  {
	
	private String userId;		// 用户ID
	private String details;		// 反馈内容
	private String rewards;		// 奖励
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getRewards() {
		return rewards;
	}
	public void setRewards(String rewards) {
		this.rewards = rewards;
	}
}
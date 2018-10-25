package com.yidu.fz.bean;

/**
 * 
 * @author fanzhu范柱
 * 后端用户信息
 * 2018年10月23日
 *
 */

public class AfterUser {
	private String userId;
	private String userName;
	private String userPassword;
	private String lastLoginTime;
	private String userSex;
	private String userPhone;
	private String userAddress;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "afterUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", lastLoginTime=" + lastLoginTime + ", userSex=" + userSex + ", userPhone=" + userPhone
				+ ", userAddress=" + userAddress + "]";
	}
	public AfterUser(String userId, String userName, String userPassword, String lastLoginTime, String userSex,
			String userPhone, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.lastLoginTime = lastLoginTime;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	public AfterUser() {
		super();
	}
	
	
}

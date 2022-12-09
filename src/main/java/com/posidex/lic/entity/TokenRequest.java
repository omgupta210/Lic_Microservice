package com.posidex.lic.entity;

public class TokenRequest {
	private String userId;
	private String password;
	private String userType;
	private String authType;
	  
	private Boolean reLogin;
	private Boolean isPlainPassword;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public Boolean getReLogin() {
		return reLogin;
	}
	public void setReLogin(Boolean reLogin) {
		this.reLogin = reLogin;
	}
	public Boolean getIsPlainPassword() {
		return isPlainPassword;
	}
	public void setIsPlainPassword(Boolean isPlainPassword) {
		this.isPlainPassword = isPlainPassword;
	}
	@Override
	public String toString() {
		return "LoginEntity [userId=" + userId + ", password=" + password + ", userType=" + userType + ", authType="
				+ authType + ", reLogin=" + reLogin + ", isPlainPassword=" + isPlainPassword + "]";
	}
	
}

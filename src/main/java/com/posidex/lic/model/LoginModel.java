package com.posidex.lic.model;

public class LoginModel {

	private String token;
	private User user;
	private Boolean status;
	private String userType;
	private String operationMsg;
	private String landingPage;

	public LoginModel() {
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getOperationMsg() {
		return operationMsg;
	}

	public void setOperationMsg(String operationMsg) {
		this.operationMsg = operationMsg;
	}

	public String getLandingPage() {
		return landingPage;
	}

	public void setLandingPage(String landingPage) {
		this.landingPage = landingPage;
	}
}

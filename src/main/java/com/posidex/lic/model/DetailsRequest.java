package com.posidex.lic.model;

import java.util.Date;



public class DetailsRequest {
	private String name;
	private Date dob;

	private String relationName;
	private String pan;
	private String aadhar;
	private String CLN_ADDRESS_TYPE;
	private String CLN_CITY;
	private String CLN_STATE;
	private String CLN_PINCODE;
	private String PHONE;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getCLN_ADDRESS_TYPE() {
		return CLN_ADDRESS_TYPE;
	}
	public void setCLN_ADDRESS_TYPE(String cLN_ADDRESS_TYPE) {
		CLN_ADDRESS_TYPE = cLN_ADDRESS_TYPE;
	}
	public String getCLN_CITY() {
		return CLN_CITY;
	}
	public void setCLN_CITY(String cLN_CITY) {
		CLN_CITY = cLN_CITY;
	}
	public String getCLN_STATE() {
		return CLN_STATE;
	}
	public void setCLN_STATE(String cLN_STATE) {
		CLN_STATE = cLN_STATE;
	}
	public String getCLN_PINCODE() {
		return CLN_PINCODE;
	}
	public void setCLN_PINCODE(String cLN_PINCODE) {
		CLN_PINCODE = cLN_PINCODE;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	
	

}

package com.posidex.lic.impl.bean;

import java.io.Serializable;
import java.util.Date;

public class  Address implements Serializable{

	// CLN_ADDRESS_TYPE1  CLN_ADDRESS2  CLN_CITY2  CLN_PINCODE2  CLN_STATE2  CLN_ADDRESS_TYPE2  PHONE1   
	private String CLN_ADDRESS_TYPE;
	private String CLN_CITY;
	private String CLN_STATE;
	private String CLN_PINCODE;
	private String PHONE;
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
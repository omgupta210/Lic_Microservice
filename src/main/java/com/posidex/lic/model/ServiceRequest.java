package com.posidex.lic.model;

import lombok.Data;


public class ServiceRequest {

	

	private String name;
	private String dob;
	private String phoneNumber;
	private String address;
	private String pincode;
	private String email;
	private String pan;
	private String gender;
	private String bankAccountNo;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public ServiceRequest() {

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public ServiceRequest(String name, String dob, String phoneNumber, String address, String pincode, String email,
			String pan, String gender, String bankAccountNo) {
		super();
		this.name = name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pincode = pincode;
		this.email = email;
		this.pan = pan;
		this.gender = gender;
		this.bankAccountNo = bankAccountNo;
	}

	@Override
	public String toString() {
		return "ServiceRequest [name=" + name + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", pincode=" + pincode + ", email=" + email + ", pan=" + pan + ", gender=" + gender
				+ ", bankAccountNo=" + bankAccountNo + "]";
	}

	


}

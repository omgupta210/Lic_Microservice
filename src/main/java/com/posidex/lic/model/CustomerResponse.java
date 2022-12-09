package com.posidex.lic.model;

import java.util.List;

public class CustomerResponse {
	private List<String> apiHeader;
	private List<List<String>> apiResults;
	private String statusMessage;
	private RetValue retValue;
	public List<String> getApiHeader() {
		return apiHeader;
	}
	public void setApiHeader(List<String> apiHeader) {
		this.apiHeader = apiHeader;
	}
	

	

	public List<List<String>> getApiResults() {
		return apiResults;
	}
	public void setApiResults(List<List<String>> apiResults) {
		this.apiResults = apiResults;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public RetValue getRetValue() {
		return retValue;
	}
	public void setRetValue(RetValue retValue) {
		this.retValue = retValue;
	}
	@Override
	public String toString() {
		return "CustomerResponse [apiHeader=" + apiHeader + ", apiResults=" + apiResults + ", statusMessage="
				+ statusMessage + ", retValue=" + retValue + "]";
	}
	
	
	
}

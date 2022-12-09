package com.posidex.lic.model;

import java.util.List;

public class ApiResult {
   private List<String> apiResults;

public List<String> getApiResults() {
	return apiResults;
}

public void setApiResults(List<String> apiResults) {
	this.apiResults = apiResults;
}

@Override
public String toString() {
	return "ApiResult [apiResults=" + apiResults + "]";
}
   
}

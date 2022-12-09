package com.posidex.lic.model;

public class ProfileDetails {
	 private String matchingRuleCSV;
     private String residualCSV;
     private String weightagesCSV;
     private String scalesCSV;
     private String rankingCSV;
	public String getMatchingRuleCSV() {
		return matchingRuleCSV;
	}
	public void setMatchingRuleCSV(String matchingRuleCSV) {
		this.matchingRuleCSV = matchingRuleCSV;
	}
	public String getResidualCSV() {
		return residualCSV;
	}
	public void setResidualCSV(String residualCSV) {
		this.residualCSV = residualCSV;
	}
	public String getWeightagesCSV() {
		return weightagesCSV;
	}
	public void setWeightagesCSV(String weightagesCSV) {
		this.weightagesCSV = weightagesCSV;
	}
	public String getScalesCSV() {
		return scalesCSV;
	}
	public void setScalesCSV(String scalesCSV) {
		this.scalesCSV = scalesCSV;
	}
	public String getRankingCSV() {
		return rankingCSV;
	}
	public void setRankingCSV(String rankingCSV) {
		this.rankingCSV = rankingCSV;
	}
	@Override
	public String toString() {
		return "ProfileDetails [matchingRuleCSV=" + matchingRuleCSV + ", residualCSV=" + residualCSV
				+ ", weightagesCSV=" + weightagesCSV + ", scalesCSV=" + scalesCSV + ", rankingCSV=" + rankingCSV + "]";
	}
     
}

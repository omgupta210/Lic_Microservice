package com.posidex.lic.model;

public class RetValue {
	 private int matchCount;
     private int ProcessTime;
	public int getMatchCount() {
		return matchCount;
	}
	public void setMatchCount(int matchCount) {
		this.matchCount = matchCount;
	}
	public int getProcessTime() {
		return ProcessTime;
	}
	public void setProcessTime(int processTime) {
		ProcessTime = processTime;
	}
	@Override
	public String toString() {
		return "RetValue [matchCount=" + matchCount + ", ProcessTime=" + ProcessTime + "]";
	}
	
     
}

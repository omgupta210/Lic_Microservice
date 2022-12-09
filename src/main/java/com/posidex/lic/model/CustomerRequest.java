package com.posidex.lic.model;

import java.util.List;

public class CustomerRequest {
	private List<PSX_DG_BLK_TRG> PSX_DG_BLK_TRG;
	private ProfileDetails profileDetails;
	
	public ProfileDetails getProfileDetails() {
		return profileDetails;
	}
	public void setProfileDetails(ProfileDetails profileDetails) {
		this.profileDetails = profileDetails;
	}

	public List<PSX_DG_BLK_TRG> getPSX_DG_BLK_TRG() {
		return PSX_DG_BLK_TRG;
	}
	public void setPSX_DG_BLK_TRG(List<PSX_DG_BLK_TRG> pSX_DG_BLK_TRG) {
		PSX_DG_BLK_TRG = pSX_DG_BLK_TRG;
	}
	@Override
	public String toString() {
		return "CustomerRequest [PSX_DG_BLK_TRG=" + PSX_DG_BLK_TRG + ", profileDetails=" + profileDetails + "]";
	}
	
}

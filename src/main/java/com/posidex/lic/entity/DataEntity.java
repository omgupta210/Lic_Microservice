package com.posidex.lic.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p0_psx_dg_blk_trg")
public class DataEntity {

	@Id
    @Column(name="CUST_UNQ_ID")
	private String custunqid;
	
	@Column(name="BATCH_ID")
	private String batchid;
	
	@Column(name="CUST_ID")
	private String custid;
	
	 @Column(name="LEAD_ID")
	private String leadid;
	 
	 @Column(name="DEAL_ID_APP_ID")
	private String dealidappid;
	 
	 @Column(name="PSX_BATCH_ID")
	private String psxbatchid;
	 
	 @Column(name="OLD_PSX_BATCH_ID")
	private String oldpsxbatchid;
	 
	 @Column(name="LCHGTIME")
	private Timestamp lchgtime;
	 
	 @Column(name="DUIFLAG")
	private String duiflag;
	 
	 @Column(name="EVENTTYPE")
	private String eventtypt;
	 
	 @Column(name="INSERT_TIME")
	private Timestamp inserttime;
	 
	 @Column(name="PARTITION_NUMBER")
	private String partitionnumber;
	 
	 @Column(name="NSPKEY")
	private String nspkey;
	 
	 @Column(name="RECORD_ID")
	private Integer recordid;
	 
	 @Column(name="ICCLEANING_SPECTRUM")
	private String iccleaningspectrum;
	 
	 @Column(name="NAME")
	private String name;
	 
	 @Column(name="EMPLOYER_NAME")
	private String employername;
	 
	 @Column(name="RELATION_NAME")
	private String relationname;
	 
	 @Column(name="FIRST_NAME")
	private String firstname;
	 
	 @Column(name="MIDDLE_NAME")
	private String middlename;
	 
	 @Column(name="LAST_NAME")
	private String lastname;
	 
	 @Column(name="EXTRA_NAME_1")
	private String extraname1;
	 
	 @Column(name="EXTRA_NAME_2")
	private String extraname2;
	 
	 @Column(name="DOB_DOI")
	private Date dobdoi;
	 
	 @Column(name="CLN_NAME")
	private String clnname;
	 
	 @Column(name="CLN_EMPLOYER_NAME")
	private String clnemployername;
	 
	 @Column(name="CLN_RELATION_NAME")
	private String clnrelationname;
	 
	 @Column(name="CLN_FIRST_NAME")
	private String clnfirstname;
	 
	 @Column(name="CLN_MIDDLE_NAME")
	private String clnmiddlename;
	 
	 @Column(name="CLN_LAST_NAME")
	private String clnlastname;
	 
	 @Column(name="CLN_EXTRA_NAME_1")
	private String clnextraname1;
	 
	 @Column(name="CLN_EXTRA_NAME_2")
	private String clnextraname2;
	 
	 @Column(name="CLN_DOB_DOI")
	private Date clndobdoi;
	 
	 @Column(name="PAN")
	private String pan;
	 
	 @Column(name="PASSPORT")
	private String passport;
	 
	 @Column(name="VOTER_ID")
	private String voterid;
	 
	 @Column(name="AADHAAR")
	private String aadhaar;
	 
	 @Column(name="DRIVING_LICENSE")
	private String drivinglicense;
	 
	 @Column(name="RATION_CARD")
	private String rationcard;
	 
	 @Column(name="CLN_PAN")
	private String clnpan;
	 
	 @Column(name="CLN_PASSPORT")
	private String clnpassport;
	 
	 @Column(name="CLN_VOTER_ID")
	private String clnvoterid;
	 
	 @Column(name="CLN_AADHAAR")
	private String clnaadhaar;
	 
	 @Column(name="CLN_DRIVING_LICENSE")
	private String clndrivinglicense;
	 
	 @Column(name="CLN_RATION_CARD")
	private String clnrationcard;
	 
	 @Column(name="UCIC")
	private String ucic;
	 
	 @Column(name="DG_FILLER_COLUMN_1")
	private String dgfillercolumn1;
	 
	 @Column(name="DG_FILLER_COLUMN_2")
	private String dgfillercolumn2;
	 
	 @Column(name="SOURCE_SYSTEM")
	private String sourcesystem;
	 
	 @Column(name="CUSTOMER_TYPE")
	private String customertype;
	 
	 @Column(name="GENDER")
	private String gender;
	 
	 @Column(name="RELATION_TYPE")
	private String relationtype;
	 
	 @Column(name="CUSTOMER_STATUS")
	private String customerstatus;
	 
	 @Column(name="NAME_SALUTATION")
	private String namesalutation;
	 
	 @Column(name="REMARKS")
	private String remarks;
	 
	 @Column(name="ADDRESS1")
	private String address1;
	 
	 @Column(name="CITY1")
	private String city1;
	 
	 @Column(name="PINCODE1")
	private String pincode1;
	 
	 @Column(name="STATE1")
	private String state1;
	 
	 @Column(name="COUNTRY")
	private String country;
	 
	 @Column(name="ADDRESS_TYPE1")
	private String addresstype1;
	 
	 @Column(name="ADDRESS2")
	private String address2;
	 
	 @Column(name="CITY2")
	private String city2;
	 
	 @Column(name="PINCODE2")
	private String pincode2;
	 
	 @Column(name="STATE2")
	private String state2;
	 
	 @Column(name="ADDRESS_TYPE2")
	private String addresstype2;
	 
	 @Column(name="ADDRESS_LINE_1")
	private String addressline1;
	 
	 @Column(name="ADDRESS_LINE_2")
	private String addressline2;
	 
	 @Column(name="ADDRESS_LINE_3")
	private String addressline3;
	 
	 @Column(name="CLN_ADDRESS1")
	private String clnaddress1;
	 
	 @Column(name="CLN_CITY1")
	private String clncity1;
	 
	 @Column(name="CLN_PINCODE1")
	private String clnpincode1;
	 
	 @Column(name="CLN_STATE1")
	private String clnstate1;
	 
	 @Column(name="CLN_ADDRESS_TYPE1")
	private String clnaddresstype1;
	 
	 @Column(name="CLN_ADDRESS2")
	private String clnaddress2;
	 
	 @Column(name="CLN_CITY2")
	private String clncity2;
	 
	 @Column(name="CLN_PINCODE2")
	private String clnpincode2;
	 
	 @Column(name="CLN_STATE2")
	private String clnstate2;
	 
	 @Column(name="CLN_ADDRESS_TYPE2")
	private String clnaddresstype2;
	 
	 @Column(name="PHONE1")
	private String phone1;
	 
	 @Column(name="PHONE_TYPE1")
	private String phonetype1;
	 
	 @Column(name="PHONE2")
	private String phone2;
	 
	 @Column(name="PHONE_TYPE2")
	private String phonetype2;
	 
	 @Column(name="CLN_PHONE1")
	private String clnphone1;
	 
	 @Column(name="CLN_PHONE_TYPE1")
	private String clnphonetype1;
	 
	 @Column(name="CLN_PHONE2")
	private String clnphone2;
	 
	 @Column(name="CLN_PHONE_TYPE2")
	private String clnphonetype2;
	 
	 @Column(name="EMAIL_ID1")
	private String emailid1;
	 
	 @Column(name="EMAIL_TYPE1")
	private String emailtype1;
	 
	 @Column(name="EMAIL_ID2")
	private String emailid2;
	 
	 @Column(name="EMAIL_TYPE2")
	private String emailtype2;
	 
	 @Column(name="CLN_EMAIL_ID1")
	private String clnemailid1;
	 
	 @Column(name="CLN_EMAIL_TYPE1")
	private String clnemailtype1;
	 
	 @Column(name="CLN_EMAIL_ID2")
	private String clnemailid2;
	 
	 @Column(name="CLN_EMAIL_TYPE2")
	private String clnemailtype2;
	 
	 @Column(name="ADJACENCYLIST")
	private String adjacencylist;
	 
	 @Column(name="ISPARTIAL")
	private String ispartial;
	 
	 @Column(name="CLUSTERING_0")
	private Integer clustering0;
	 
	 @Column(name="CLUSTERING_CNT_0")
	private Integer clusteringcnt0;
	 
	 @Column(name="EQUATION_0")
	private String equation0;
	 
	 @Column(name="CLUSTERING_1")
	private Integer clustering1;
	 
	 @Column(name="CLUSTERING_CNT_1")
	private Integer clusteringcnt1;
	 
	 @Column(name="EQUATION_1")
	private String equation1;
	 
	 @Column(name="CLUSTERING_2")
	private Integer clustering2;
	 
	 @Column(name="CLUSTERING_CNT_2")
	private Integer clusteringcnt2;
	 
	 @Column(name="EQUATION_2")
	private String equation2;
	 
	 @Column(name="CLUSTERING_3")
	private Integer clustering3;
	 
	 @Column(name="CLUSTERING_CNT_3")
	private Integer clusteringcnt3;
	 
	 @Column(name="EQUATION_3")
	private String equation3;

	public String getCustunqid() {
		return custunqid;
	}

	public void setCustunqid(String custunqid) {
		this.custunqid = custunqid;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getLeadid() {
		return leadid;
	}

	public void setLeadid(String leadid) {
		this.leadid = leadid;
	}

	public String getDealidappid() {
		return dealidappid;
	}

	public void setDealidappid(String dealidappid) {
		this.dealidappid = dealidappid;
	}

	public String getPsxbatchid() {
		return psxbatchid;
	}

	public void setPsxbatchid(String psxbatchid) {
		this.psxbatchid = psxbatchid;
	}

	public String getOldpsxbatchid() {
		return oldpsxbatchid;
	}

	public void setOldpsxbatchid(String oldpsxbatchid) {
		this.oldpsxbatchid = oldpsxbatchid;
	}

	public Timestamp getLchgtime() {
		return lchgtime;
	}

	public void setLchgtime(Timestamp lchgtime) {
		this.lchgtime = lchgtime;
	}

	public String getDuiflag() {
		return duiflag;
	}

	public void setDuiflag(String duiflag) {
		this.duiflag = duiflag;
	}

	public String getEventtypt() {
		return eventtypt;
	}

	public void setEventtypt(String eventtypt) {
		this.eventtypt = eventtypt;
	}

	public Timestamp getInserttime() {
		return inserttime;
	}

	public void setInserttime(Timestamp inserttime) {
		this.inserttime = inserttime;
	}

	public String getPartitionnumber() {
		return partitionnumber;
	}

	public void setPartitionnumber(String partitionnumber) {
		this.partitionnumber = partitionnumber;
	}

	public String getNspkey() {
		return nspkey;
	}

	public void setNspkey(String nspkey) {
		this.nspkey = nspkey;
	}

	public Integer getRecordid() {
		return recordid;
	}

	public void setRecordid(Integer recordid) {
		this.recordid = recordid;
	}

	public String getIccleaningspectrum() {
		return iccleaningspectrum;
	}

	public void setIccleaningspectrum(String iccleaningspectrum) {
		this.iccleaningspectrum = iccleaningspectrum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployername() {
		return employername;
	}

	public void setEmployername(String employername) {
		this.employername = employername;
	}

	public String getRelationname() {
		return relationname;
	}

	public void setRelationname(String relationname) {
		this.relationname = relationname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getExtraname1() {
		return extraname1;
	}

	public void setExtraname1(String extraname1) {
		this.extraname1 = extraname1;
	}

	public String getExtraname2() {
		return extraname2;
	}

	public void setExtraname2(String extraname2) {
		this.extraname2 = extraname2;
	}

	public Date getDobdoi() {
		return dobdoi;
	}

	public void setDobdoi(Date dobdoi) {
		this.dobdoi = dobdoi;
	}

	public String getClnname() {
		return clnname;
	}

	public void setClnname(String clnname) {
		this.clnname = clnname;
	}

	public String getClnemployername() {
		return clnemployername;
	}

	public void setClnemployername(String clnemployername) {
		this.clnemployername = clnemployername;
	}

	public String getClnrelationname() {
		return clnrelationname;
	}

	public void setClnrelationname(String clnrelationname) {
		this.clnrelationname = clnrelationname;
	}

	public String getClnfirstname() {
		return clnfirstname;
	}

	public void setClnfirstname(String clnfirstname) {
		this.clnfirstname = clnfirstname;
	}

	public String getClnmiddlename() {
		return clnmiddlename;
	}

	public void setClnmiddlename(String clnmiddlename) {
		this.clnmiddlename = clnmiddlename;
	}

	public String getClnlastname() {
		return clnlastname;
	}

	public void setClnlastname(String clnlastname) {
		this.clnlastname = clnlastname;
	}

	public String getClnextraname1() {
		return clnextraname1;
	}

	public void setClnextraname1(String clnextraname1) {
		this.clnextraname1 = clnextraname1;
	}

	public String getClnextraname2() {
		return clnextraname2;
	}

	public void setClnextraname2(String clnextraname2) {
		this.clnextraname2 = clnextraname2;
	}

	public Date getClndobdoi() {
		return clndobdoi;
	}

	public void setClndobdoi(Date clndobdoi) {
		this.clndobdoi = clndobdoi;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getDrivinglicense() {
		return drivinglicense;
	}

	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}

	public String getRationcard() {
		return rationcard;
	}

	public void setRationcard(String rationcard) {
		this.rationcard = rationcard;
	}

	public String getClnpan() {
		return clnpan;
	}

	public void setClnpan(String clnpan) {
		this.clnpan = clnpan;
	}

	public String getClnpassport() {
		return clnpassport;
	}

	public void setClnpassport(String clnpassport) {
		this.clnpassport = clnpassport;
	}

	public String getClnvoterid() {
		return clnvoterid;
	}

	public void setClnvoterid(String clnvoterid) {
		this.clnvoterid = clnvoterid;
	}

	public String getClnaadhaar() {
		return clnaadhaar;
	}

	public void setClnaadhaar(String clnaadhaar) {
		this.clnaadhaar = clnaadhaar;
	}

	public String getClndrivinglicense() {
		return clndrivinglicense;
	}

	public void setClndrivinglicense(String clndrivinglicense) {
		this.clndrivinglicense = clndrivinglicense;
	}

	public String getClnrationcard() {
		return clnrationcard;
	}

	public void setClnrationcard(String clnrationcard) {
		this.clnrationcard = clnrationcard;
	}

	public String getUcic() {
		return ucic;
	}

	public void setUcic(String ucic) {
		this.ucic = ucic;
	}

	public String getDgfillercolumn1() {
		return dgfillercolumn1;
	}

	public void setDgfillercolumn1(String dgfillercolumn1) {
		this.dgfillercolumn1 = dgfillercolumn1;
	}

	public String getDgfillercolumn2() {
		return dgfillercolumn2;
	}

	public void setDgfillercolumn2(String dgfillercolumn2) {
		this.dgfillercolumn2 = dgfillercolumn2;
	}

	public String getSourcesystem() {
		return sourcesystem;
	}

	public void setSourcesystem(String sourcesystem) {
		this.sourcesystem = sourcesystem;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelationtype() {
		return relationtype;
	}

	public void setRelationtype(String relationtype) {
		this.relationtype = relationtype;
	}

	public String getCustomerstatus() {
		return customerstatus;
	}

	public void setCustomerstatus(String customerstatus) {
		this.customerstatus = customerstatus;
	}

	public String getNamesalutation() {
		return namesalutation;
	}

	public void setNamesalutation(String namesalutation) {
		this.namesalutation = namesalutation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getPincode1() {
		return pincode1;
	}

	public void setPincode1(String pincode1) {
		this.pincode1 = pincode1;
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddresstype1() {
		return addresstype1;
	}

	public void setAddresstype1(String addresstype1) {
		this.addresstype1 = addresstype1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getPincode2() {
		return pincode2;
	}

	public void setPincode2(String pincode2) {
		this.pincode2 = pincode2;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getAddresstype2() {
		return addresstype2;
	}

	public void setAddresstype2(String addresstype2) {
		this.addresstype2 = addresstype2;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getAddressline3() {
		return addressline3;
	}

	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}

	public String getClnaddress1() {
		return clnaddress1;
	}

	public void setClnaddress1(String clnaddress1) {
		this.clnaddress1 = clnaddress1;
	}

	public String getClncity1() {
		return clncity1;
	}

	public void setClncity1(String clncity1) {
		this.clncity1 = clncity1;
	}

	public String getClnpincode1() {
		return clnpincode1;
	}

	public void setClnpincode1(String clnpincode1) {
		this.clnpincode1 = clnpincode1;
	}

	public String getClnstate1() {
		return clnstate1;
	}

	public void setClnstate1(String clnstate1) {
		this.clnstate1 = clnstate1;
	}

	public String getClnaddresstype1() {
		return clnaddresstype1;
	}

	public void setClnaddresstype1(String clnaddresstype1) {
		this.clnaddresstype1 = clnaddresstype1;
	}

	public String getClnaddress2() {
		return clnaddress2;
	}

	public void setClnaddress2(String clnaddress2) {
		this.clnaddress2 = clnaddress2;
	}

	public String getClncity2() {
		return clncity2;
	}

	public void setClncity2(String clncity2) {
		this.clncity2 = clncity2;
	}

	public String getClnpincode2() {
		return clnpincode2;
	}

	public void setClnpincode2(String clnpincode2) {
		this.clnpincode2 = clnpincode2;
	}

	public String getClnstate2() {
		return clnstate2;
	}

	public void setClnstate2(String clnstate2) {
		this.clnstate2 = clnstate2;
	}

	public String getClnaddresstype2() {
		return clnaddresstype2;
	}

	public void setClnaddresstype2(String clnaddresstype2) {
		this.clnaddresstype2 = clnaddresstype2;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhonetype1() {
		return phonetype1;
	}

	public void setPhonetype1(String phonetype1) {
		this.phonetype1 = phonetype1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhonetype2() {
		return phonetype2;
	}

	public void setPhonetype2(String phonetype2) {
		this.phonetype2 = phonetype2;
	}

	public String getClnphone1() {
		return clnphone1;
	}

	public void setClnphone1(String clnphone1) {
		this.clnphone1 = clnphone1;
	}

	public String getClnphonetype1() {
		return clnphonetype1;
	}

	public void setClnphonetype1(String clnphonetype1) {
		this.clnphonetype1 = clnphonetype1;
	}

	public String getClnphone2() {
		return clnphone2;
	}

	public void setClnphone2(String clnphone2) {
		this.clnphone2 = clnphone2;
	}

	public String getClnphonetype2() {
		return clnphonetype2;
	}

	public void setClnphonetype2(String clnphonetype2) {
		this.clnphonetype2 = clnphonetype2;
	}

	public String getEmailid1() {
		return emailid1;
	}

	public void setEmailid1(String emailid1) {
		this.emailid1 = emailid1;
	}

	public String getEmailtype1() {
		return emailtype1;
	}

	public void setEmailtype1(String emailtype1) {
		this.emailtype1 = emailtype1;
	}

	public String getEmailid2() {
		return emailid2;
	}

	public void setEmailid2(String emailid2) {
		this.emailid2 = emailid2;
	}

	public String getEmailtype2() {
		return emailtype2;
	}

	public void setEmailtype2(String emailtype2) {
		this.emailtype2 = emailtype2;
	}

	public String getClnemailid1() {
		return clnemailid1;
	}

	public void setClnemailid1(String clnemailid1) {
		this.clnemailid1 = clnemailid1;
	}

	public String getClnemailtype1() {
		return clnemailtype1;
	}

	public void setClnemailtype1(String clnemailtype1) {
		this.clnemailtype1 = clnemailtype1;
	}

	public String getClnemailid2() {
		return clnemailid2;
	}

	public void setClnemailid2(String clnemailid2) {
		this.clnemailid2 = clnemailid2;
	}

	public String getClnemailtype2() {
		return clnemailtype2;
	}

	public void setClnemailtype2(String clnemailtype2) {
		this.clnemailtype2 = clnemailtype2;
	}

	public String getAdjacencylist() {
		return adjacencylist;
	}

	public void setAdjacencylist(String adjacencylist) {
		this.adjacencylist = adjacencylist;
	}

	public String getIspartial() {
		return ispartial;
	}

	public void setIspartial(String ispartial) {
		this.ispartial = ispartial;
	}

	public Integer getClustering0() {
		return clustering0;
	}

	public void setClustering0(Integer clustering0) {
		this.clustering0 = clustering0;
	}

	public Integer getClusteringcnt0() {
		return clusteringcnt0;
	}

	public void setClusteringcnt0(Integer clusteringcnt0) {
		this.clusteringcnt0 = clusteringcnt0;
	}

	public String getEquation0() {
		return equation0;
	}

	public void setEquation0(String equation0) {
		this.equation0 = equation0;
	}

	public Integer getClustering1() {
		return clustering1;
	}

	public void setClustering1(Integer clustering1) {
		this.clustering1 = clustering1;
	}

	public Integer getClusteringcnt1() {
		return clusteringcnt1;
	}

	public void setClusteringcnt1(Integer clusteringcnt1) {
		this.clusteringcnt1 = clusteringcnt1;
	}

	public String getEquation1() {
		return equation1;
	}

	public void setEquation1(String equation1) {
		this.equation1 = equation1;
	}

	public Integer getClustering2() {
		return clustering2;
	}

	public void setClustering2(Integer clustering2) {
		this.clustering2 = clustering2;
	}

	public Integer getClusteringcnt2() {
		return clusteringcnt2;
	}

	public void setClusteringcnt2(Integer clusteringcnt2) {
		this.clusteringcnt2 = clusteringcnt2;
	}

	public String getEquation2() {
		return equation2;
	}

	public void setEquation2(String equation2) {
		this.equation2 = equation2;
	}

	public Integer getClustering3() {
		return clustering3;
	}

	public void setClustering3(Integer clustering3) {
		this.clustering3 = clustering3;
	}

	public Integer getClusteringcnt3() {
		return clusteringcnt3;
	}

	public void setClusteringcnt3(Integer clusteringcnt3) {
		this.clusteringcnt3 = clusteringcnt3;
	}

	public String getEquation3() {
		return equation3;
	}

	public void setEquation3(String equation3) {
		this.equation3 = equation3;
	}

}

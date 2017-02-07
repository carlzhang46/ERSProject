package com.revature.pojo;


public class Reimbursement {

	private int rId;
	private double rAmount;
	private String rDescription;
	
	private String rReceipt;
	
	private String rSubmitted;
	private String rResolved;
	private int uIdAuthor;
	private int uIdResolver;
	private int rtType;
	private int rtStatus;
	
	
	public Reimbursement() {}
	
	
	
	public Reimbursement(int rId, double rAmount, String rDescription, String rReceipt, String rSubmitted,
			String rResolved, int uIdAuthor, int uIdResolver, int rtType, int rtStatus) {
		super();
		this.rId = rId;
		this.rAmount = rAmount;
		this.rDescription = rDescription;
		this.rReceipt = rReceipt;
		this.rSubmitted = rSubmitted;
		this.rResolved = rResolved;
		this.uIdAuthor = uIdAuthor;
		this.uIdResolver = uIdResolver;
		this.rtType = rtType;
		this.rtStatus = rtStatus;
	}



	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public double getrAmount() {
		return rAmount;
	}
	public void setrAmount(double rAmount) {
		this.rAmount = rAmount;
	}
	public String getrDescription() {
		return rDescription;
	}
	public void setrDescription(String rDescription) {
		this.rDescription = rDescription;
	}
	public String getrReceipt() {
		return rReceipt;
	}
	public void setrReceipt(String rReceipt) {
		this.rReceipt = rReceipt;
	}
	public String getrSubmitted() {
		return rSubmitted;
	}
	public void setrSubmitted(String rSubmitted) {
		this.rSubmitted = rSubmitted;
	}
	public String getrResolved() {
		return rResolved;
	}
	public void setrResolved(String rResolved) {
		this.rResolved = rResolved;
	}
	public int getuIdAuthor() {
		return uIdAuthor;
	}
	public void setuIdAuthor(int uIdAuthor) {
		this.uIdAuthor = uIdAuthor;
	}
	public int getuIdResolver() {
		return uIdResolver;
	}
	public void setuIdResolver(int uIdResolver) {
		this.uIdResolver = uIdResolver;
	}
	public int getRtType() {
		return rtType;
	}
	public void setRtType(int rtType) {
		this.rtType = rtType;
	}
	public int getRtStatus() {
		return rtStatus;
	}
	public void setRtStatus(int rtStatus) {
		this.rtStatus = rtStatus;
	}
	@Override
	public String toString() {
		return "ReimbursementPOJO [rId=" + rId + ", rAmount=" + rAmount + ", rDescription=" + rDescription
				+ ", rReceipt=" + rReceipt + ", rSubmitted=" + rSubmitted + ", rResolved=" + rResolved + ", uIdAuthor="
				+ uIdAuthor + ", uIdResolver=" + uIdResolver + ", rtType=" + rtType + ", rtStatus=" + rtStatus + "]";
	}
	
	
	
	
}

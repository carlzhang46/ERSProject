package com.revature.pojo;

public class ReimbursementType {

	private int rtId;
	private String rtType;
	
	public ReimbursementType() {}
	
	public ReimbursementType(int rtId, String rtType) {
		super();
		this.rtId = rtId;
		this.rtType = rtType;
	}

	public int getRtId() {
		return rtId;
	}

	public void setRtId(int rtId) {
		this.rtId = rtId;
	}

	public String getRtType() {
		return rtType;
	}

	public void setRtType(String rtType) {
		this.rtType = rtType;
	}
	
	
}

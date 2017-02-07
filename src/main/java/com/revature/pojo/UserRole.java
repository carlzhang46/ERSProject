package com.revature.pojo;

public class UserRole {
	private int urId;
	
	public UserRole() {}

	public UserRole(int urId) {
		super();
		this.urId = urId;
	}

	public int getUrId() {
		return urId;
	}

	public void setUrId(int urId) {
		this.urId = urId;
	}

	@Override
	public String toString() {
		return "UserRole [urId=" + urId + "]";
	}
	
	
}

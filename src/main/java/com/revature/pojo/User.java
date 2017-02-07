package com.revature.pojo;

public class User {
	private int u_id;
	private String uUsername;
	private String uPassword;
	private String uFirstname;
	private String uLastname;
	private String uEmail;
	private int urId;
	
	public User() {}

	
	
	public User(int u_id, String uUsername, String uPassword, String uFirstname, String uLastname, String uEmail,
			int urId) {
		super();
		this.u_id = u_id;
		this.uUsername = uUsername;
		this.uPassword = uPassword;
		this.uFirstname = uFirstname;
		this.uLastname = uLastname;
		this.uEmail = uEmail;
		this.urId = urId;
	}



	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuFirstname() {
		return uFirstname;
	}

	public void setuFirstname(String uFirstname) {
		this.uFirstname = uFirstname;
	}

	public String getuLastname() {
		return uLastname;
	}

	public void setuLastname(String uLastname) {
		this.uLastname = uLastname;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public int getUrId() {
		return urId;
	}

	public void setUrId(int urId) {
		this.urId = urId;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", uUsername=" + uUsername + ", uPassword=" + uPassword + ", uFirstname="
				+ uFirstname + ", uLastname=" + uLastname + ", uEmail=" + uEmail + ", urId=" + urId + "]";
	}
	
	
}

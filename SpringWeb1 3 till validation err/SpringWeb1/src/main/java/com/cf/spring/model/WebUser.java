package com.cf.spring.model;

import javax.validation.constraints.Size;

public class WebUser {
	
	private int uid;
	 @Size(min = 3, max = 20,message = "enter more than 3 characters")
	private String uname;
	 
	private String email;
	private String mobile;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public WebUser() {
		// TODO Auto-generated constructor stub
	}
	public WebUser(String uname, String email, String mobile) {
		super();
		this.uname = uname;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "WebUser [uid=" + uid + ", name=" + uname + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
}

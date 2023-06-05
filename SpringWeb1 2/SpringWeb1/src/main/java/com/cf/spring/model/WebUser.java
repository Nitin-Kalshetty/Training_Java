package com.cf.spring.model;

public class WebUser {
	private int uid;
	private String name;
	private String email;
	private String mobile;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public WebUser(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "WebUser [uid=" + uid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
}

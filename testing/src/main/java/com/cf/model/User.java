package com.cf.model;

import java.util.UUID;

public class User {

	private String uid = UUID.randomUUID().toString();
	private String name;
	private String mobile;
	private String city;
	
	
	public User(String uid, String name, String mobile, String city) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", mobile=" + mobile + ", city=" + city + "]";
	}
	
	
}

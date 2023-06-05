package com.cf.model;

import java.util.UUID;

public class User {

	private String uid = UUID.randomUUID().toString();
	private String name;
	private String mobile;
	private String email;
	private Address address;
	public User(String uid, String name, String mobile, String email, Address address) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address + "]";
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
}

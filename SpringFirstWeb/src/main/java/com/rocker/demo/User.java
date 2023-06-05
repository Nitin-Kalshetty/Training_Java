package com.rocker.demo;

import lombok.Data;

@Data
public class User {

	private String uid;
	private String name;
	private String address;
	public User(String uid, String name, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.address = address;
	}
	public User() {
		super();
	}
	
	
}

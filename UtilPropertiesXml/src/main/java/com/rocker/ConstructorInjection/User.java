package com.rocker.ConstructorInjection;

public class User {

	private String myName;
	private String myContact;
	public User(String myName, String myContact) {
		super();
		this.myName = myName;
		this.myContact = myContact;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getMyContact() {
		return myContact;
	}
	public void setMyContact(String myContact) {
		this.myContact = myContact;
	}
	public User() {
		super();
	}
	
	
}

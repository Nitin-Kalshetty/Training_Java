package com.cf.model;

public class Helper {
	
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Helper(User user) {
		super();
		this.user = user;
	}
	public Helper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Helper [user=" + user + "]";
	}
	

}

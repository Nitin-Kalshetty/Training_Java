package com.cf.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;





public class User {

	
	private String uid=UUID.randomUUID().toString();
	
//	@NotNull
//	@NotBlank
//	@NotEmpty
//	@Size(min = 3,max = 15,message = "The length should be min 3 and max 15")

	@NotNull
	@NotEmpty
	@NotBlank
	private String name;
	
//	@Email
	@Email
	private String email;
	
//	@Pattern(regexp = "^[6-9]\\\\d{9}$")
	private String mobile;
	
//	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate accountCreated;

	public User(String uid, String name, String email, String mobile, LocalDate accountCreated) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.accountCreated = accountCreated;
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

	public LocalDate getAccountCreated() {
		return accountCreated;
	}

	public void setAccountCreated(LocalDate accountCreated) {
		this.accountCreated = accountCreated;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", accountCreated="
				+ accountCreated + "]";
	}

	public User() {
		super();
	}
	
	
}

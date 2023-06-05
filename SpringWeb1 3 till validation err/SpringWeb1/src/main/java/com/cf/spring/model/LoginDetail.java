package com.cf.spring.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class LoginDetail {
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date loginDate;
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal salary;
	public LoginDetail() {
		// TODO Auto-generated constructor stub
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "LoginDetail [loginDate=" + loginDate + ", salary=" + salary + "]";
	}
	
}

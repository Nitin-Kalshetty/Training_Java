package com.cf.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:${mysql.properties}")
public class CommonClass {
	@Value("${url}")
	private String url;
	
	@Value("${driverClassName}")
	private String driver;
	
	@Value("${username}")
	private String user;
	
	@Value("${password}")
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "CommonClass [url=" + url + ", driver=" + driver + ", user=" + user + ", password=" + password + "]";
	}
	public CommonClass(String url, String driver, String user, String password) {
		super();
		this.url = url;
		this.driver = driver;
		this.user = user;
		this.password = password;
	}
	
	public CommonClass() {
		// TODO Auto-generated constructor stub
	}
	

}

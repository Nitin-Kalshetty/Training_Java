package com.rocker.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;




@ConfigurationProperties(prefix = "main")
@Component
public class MainProp {

	private String height;
	private String width;
	@Override
	public String toString() {
		return "MainProp [height=" + height + ", width=" + width + "]";
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public MainProp(String height, String width) {
		super();
		this.height = height;
		this.width = width;
	}
	public MainProp() {
		super();
	}
	
	
	
	
	
}



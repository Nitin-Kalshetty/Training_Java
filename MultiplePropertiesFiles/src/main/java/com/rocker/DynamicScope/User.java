package com.rocker.DynamicScope;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component(value="user")
@PropertySources(value= {@PropertySource("application1.properties"),
						 @PropertySource("application2.properties"),
						 @PropertySource("application3.properties")})
public class User {

	public User() {
		super();
	}

	@Value("${firstUserId}")
	private Integer userId;
	
	@Value("${firstUsername}")
	private String userName;
	
	@Value("#{'${firstCourses}'.split(',')}")
	private List<String> courses;
	
	@Value("#{${firstMapList}}")
	private Map<Integer, String> mapList;

	private Integer secondUserId;
	
	private String secondUserName;
	
	private List<String> secondCourses;
	
	private Map<Integer,String> secondMapList;
	
}

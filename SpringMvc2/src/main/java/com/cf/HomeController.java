package com.cf;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@RequestMapping("/register")
	public String homepage(HttpSession session) {
		return "register";
	}
	@Autowired
	private CommonClass commonClass;
	
	@PostMapping("/loadProperties")
	public String loadProperties(@RequestParam(name = "database",required = false) Integer database) {
		
		System.out.println("I am working...");
		String databasePropertiesName = "" ;
		if(database==1) {
			databasePropertiesName = "oracle.properties";
		}else if(database==2) {
			databasePropertiesName = "mysql.properties";
		}else {
			System.out.println("Invalid Input");
		}
		System.setProperty("property.file", databasePropertiesName);
		
		
		System.out.println("driver : "+commonClass.getDriver()+" url : "+commonClass.getUrl()+" user : "+commonClass.getUser()+" password : "+commonClass.getPassword());
		return "home";
	}
	
	@PostMapping("/loadProperties1")
	public String loadProperties1() {
		
		System.out.println("I am working...");
		return "register";
		
	}

}

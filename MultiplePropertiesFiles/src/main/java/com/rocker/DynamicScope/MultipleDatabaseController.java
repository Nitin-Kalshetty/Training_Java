package com.rocker.DynamicScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rocker.model.CommonClass;

@Controller
public class MultipleDatabaseController {

	@Autowired
	private CommonClass commonClass;
	
	@GetMapping("/loadProperties")
	public String loadProperties(@RequestParam String database) {
		String databasePropertiesName ;
		if(database.equals("oracle")) {
			databasePropertiesName = "oracle.properties";
		}else if(database.equals("mysql")) {
			databasePropertiesName = "mysql.properties";
		}else {
			return "Invalid Input";
		}
		System.setProperty("property.file", databasePropertiesName);
		
		return "driver : "+commonClass.getDriver()+" url : "+commonClass.getUrl()+" user : "+commonClass.getUser()+" password : "+commonClass.getPassword();
	}
	
	
	
}

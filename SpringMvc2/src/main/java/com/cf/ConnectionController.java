package com.cf;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
public class ConnectionController {

	public String connectionRelatedToDatabase(HttpServletRequest request) {
		String username = (String) request.getAttribute("username");
		String password = (String) request.getAttribute("password");
		Long mobile = (Long) request.getAttribute("mobile");
		String database = (String) request.getAttribute("database");
		if(!(database.equals("oracle"))) {
			
		}
		return "";
	}
}

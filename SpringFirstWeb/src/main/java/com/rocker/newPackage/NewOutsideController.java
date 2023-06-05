package com.rocker.newPackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewOutsideController {
	
	@GetMapping("/outside")
	public String getUser() {
//	return 	new User("1","name","city");
		return "New outside controller";
	}

}

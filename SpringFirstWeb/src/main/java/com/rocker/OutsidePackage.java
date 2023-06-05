package com.rocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutsidePackage {

	@GetMapping("/demo2")
	public String getUser() {
//	return 	new User("1","name","city");
		return "demo2";
	}
}

package com.rocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/hello")
	public String registerPage() {
		System.out.println("Iam called");
		return "register";
	}
}

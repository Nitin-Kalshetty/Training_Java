package com.cf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cf.model.User;

@Controller
public class SpringFormController {
	
	
	@RequestMapping("/register")
	public String registerUser(Model m) {
		m.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping("/store")
	public String testingModelAttribute(@ModelAttribute User user) {
		System.out.println(user);
		return "";
	}
}

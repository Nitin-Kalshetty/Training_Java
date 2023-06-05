package com.cf.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cf.model.Address;
import com.cf.model.Helper;
import com.cf.model.User;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/register")
	public String register(Model model) {
		Helper helperObj = new Helper();
		helperObj.setUser(new User());
		helperObj.getUser().setAddress(new Address());
		model.addAttribute("helper", helperObj);
		return "register";
	}
	
	@PostMapping(value="/store")
	@ResponseBody
	public Helper displayJson(@ModelAttribute("helper") Helper helper) {
		System.out.println(helper);
		return helper;
	}
	
	
}
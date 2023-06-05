package com.cf.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.cf.spring.model.WebUser;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String getRegisterPage(Model m) {
		m.addAttribute("user", new WebUser());
		return "register";
	}
	@PostMapping("/store")
//	public ModelAndView store(@RequestParam("name") String name,@RequestParam("mobile") String mobile,@RequestParam("email") String email) {
	public ModelAndView store(@ModelAttribute WebUser user) {
		//HTTP Status 415 – Unsupported Media Type
		//donot use requestbody for a normal form
		//instead use Spring form
	ModelAndView mv=new ModelAndView();
	//	WebUser user=new WebUser(name, email, mobile);
		user.setUid(10001);
		System.out.println(user);
		mv.setStatus(HttpStatus.OK);
		mv.setViewName("success");
		return mv;
	}
}

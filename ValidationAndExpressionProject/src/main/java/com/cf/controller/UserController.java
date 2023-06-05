package com.cf.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cf.model.User;



@Controller
@RequestMapping("/user")
@SessionAttributes(names = "mySession")
public class UserController {

	@GetMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("user", new User());
		return "registerPage";
	}
	
	@PostMapping("/store")
	public String registeredPage(@Valid @ModelAttribute User user,Model m, @RequestHeader HashMap<String, String> map,BindingResult result,HttpSession session) {
		System.out.println(session.isNew());
		if(result.hasErrors()) {
			System.out.println("There is a error in : "+ result.getNestedPath());
		}
		System.out.println(result.hasFieldErrors());
		System.out.println("Assume I am saving user to database");
		System.out.println(map);
		m.addAttribute("user", user);
		return "registeredPage";
	}
	
}

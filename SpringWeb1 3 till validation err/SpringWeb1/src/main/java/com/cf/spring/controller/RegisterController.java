package com.cf.spring.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cf.spring.model.WebUser;

@Controller
public class RegisterController {

	@GetMapping(value={"/register","/reg"})
	public String getRegisterPage(Model m) {
		m.addAttribute("user", new WebUser());
		return "register";
	}
	@PostMapping("/store")
//	public ModelAndView store(@RequestParam("name") String name,@RequestParam("mobile") String mobile,@RequestParam("email") String email) {
	public String store(  @ModelAttribute @Valid WebUser user,Model m,BindingResult br) {
		//HTTP Status 415 – Unsupported Media Type
		//donot use requestbody for a normal form
		//instead use Spring form
		//ModelAndView mv=new ModelAndView();
	//	WebUser user=new WebUser(name, email, mobile);
		user.setUid(10001);
		if(br.hasErrors()) {
		//	m.addAttribute("user",user);
			System.out.println("error "+br);
			//mv.addObject("user",user);
			//redirAttr.addFlashAttribute("user", user);
			//redirAttr.addFlashAttribute("error", result);
			//mv.setViewName("redirect:/register");
		//	mv.setViewName("register");
			return "register"; 
		}
		else {
			System.out.println(user);
		//	mv.setStatus(HttpStatus.OK);
		//	mv.setViewName("success");
			return "success";
		}
//		return mv;
	}
}

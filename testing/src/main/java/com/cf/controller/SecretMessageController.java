package com.cf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecretMessageController {

	@RequestMapping("/print")
	public String printPage() {
		return "print";
	}
	
	@PostMapping("/successPage")
	public String successPage(Model model,@RequestParam("username") String name, @RequestParam("secretMsg") String message) {
		model.addAttribute("name", name);
		model.addAttribute("message", message);
		System.out.println("I am successpage");
		return "success";
	}
	
	@PostMapping(value="successPage",params = "customerId")
	public String successPageCustomerId(Model model,@RequestParam("username") String name, @RequestParam("secretMsg") String message) {
		model.addAttribute("name", name);
		model.addAttribute("message", message);
		System.out.println("I am in customerId");
		return "success";
	}
}

package com.cf.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cf.spring.model.LoginDetail;

@Controller
public class DateNumberController {
	 @PostMapping("/submit")
	public String getDateNumb(@ModelAttribute("lg") LoginDetail ld) {
		System.out.println("hi");
		 //Date tdy=new Date();
	//	LoginDetail ld=new LoginDetail();
	//	ld.setLoginDate(tdy);
		System.out.println(ld);
		return "success";
	}
}

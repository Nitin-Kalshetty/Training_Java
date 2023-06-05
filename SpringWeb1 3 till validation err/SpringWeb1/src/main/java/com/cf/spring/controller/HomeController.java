package com.cf.spring.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cf.spring.model.LoginDetail;
@Controller
@RequestMapping("/user")
public class HomeController {

	@RequestMapping(value = {"/home","/home.php","/h.asp"})
	public String getHomePage(HttpSession sess,Model m) {
		System.out.println(sess);
		m.addAttribute("lg",new LoginDetail());
		return "home";//same as page name in views folder inside web-inf
	}
	//@RequestMapping(value = {"/home"})
	@RequestMapping(value = {"/param"})
	public String getHomePage(HttpServletRequest req) {
		System.out.println(req.getParameter("name"));
		return "home";//same as page name in views folder inside web-inf
	}
}

package com.cf.spring.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class HomeController {

	@RequestMapping(value = {"/home","/home.php","/h.asp"})
	public String getHomePage(HttpSession sess) {
		System.out.println(sess);
		return "home";//same as page name in views folder inside web-inf
	}
	//@RequestMapping(value = {"/home"})
	@RequestMapping(value = {"/param"})
	public String getHomePage(HttpServletRequest req) {
		System.out.println(req.getParameter("name"));
		return "home";//same as page name in views folder inside web-inf
	}
}

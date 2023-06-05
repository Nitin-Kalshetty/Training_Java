package com.cf.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@Controller
public class MyRestController {

	@RequestMapping("/str")
	//@ResponseBody
	public String produceData1() {
		return "mydata";
	}
	@RequestMapping("/html")
	public String produceData2() {
		return "<h1>hi</h1>";
	}
//	
	@RequestMapping("/json")
	public String produceData3() {
		return "{\r\n"
				+ "  \"name\":\"ajay\",\r\n"
				+ "  \"age\":34\r\n"
				+ "}";
	}
}

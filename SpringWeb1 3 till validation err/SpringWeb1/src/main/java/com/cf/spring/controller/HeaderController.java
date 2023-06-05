package com.cf.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeaderController {
	@RequestMapping("/header1")
	public String handleRequestByTwoHeaders(@RequestHeader("User-Agent") String userAgent,
			@RequestHeader("Accept-Language") String acceptLanguage, Model map) {
		
		
		System.out.println(acceptLanguage+" "+userAgent);
		return "success";
		
	}
	@RequestMapping("/header2")
	public String handleRequestByTwoHeaders1(@RequestHeader String host,@RequestHeader(required = false) String refresh,@RequestHeader("User-Agent") String userAgent,
			@RequestHeader("Accept-Language") String acceptLanguage, Model map) {
		
		System.out.println(host+" "+acceptLanguage+" "+userAgent);
		return "success";
		
	}
	
	@RequestMapping("/header3")//try Hashtable
    public String handleRequestWithAllHeaders (@RequestHeader HashMap<String, String> header,
                                               Model model) {
       System.out.println(header);
        return "success";
    }
	@GetMapping("/employee1")
	  public String getEmployeeByDept3 (@RequestParam("dept") Optional<String> deptName) {
	     System.out.println("test response for dept: " + (deptName.isPresent() ? deptName.get() : "using default dept"));
	     return   "success";
	}
	 @RequestMapping("/items1")
	  public String handleRequest3(@RequestParam MultiValueMap<String, String> queryMap) {
	      String response = "";
	      List<String> itemIds = queryMap.get("items");
	      for (String itemId : itemIds) {
	          response += "item from map with String id " + itemId + "<br/>";
	      }
	      System.out.println(response);
	      return "success";
	  }
}

package com.rocker.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MyAppProperties {
	@Autowired
	private OracleProp op;
	@Autowired
	private MySqlProp mp;
	@Autowired
	private MainProp main;
	
	
	@GetMapping("/configLoadingProps")
	public String configLoadingPage() {
		StringBuilder sb = new StringBuilder();
		sb.append(op.toString()+"     "+mp.toString()+"        "+main.toString()+"       ");
		return sb.toString();
	}

}

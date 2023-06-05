package com.cf.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cf.model.Address;
import com.cf.model.Helper;
import com.cf.model.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping(value="/data",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Address getData(@RequestBody Helper helper) {
		
		return new Address("road", "area", "city", "state", "pincode");
	}

}

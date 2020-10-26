package com.uk.visaapp.reg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uk.visaapp.reg.model.User;
import com.uk.visaapp.reg.service.RegistrationService;

@RestController
public class RegistrationController{
	@Autowired
	private RegistrationService service;
	@GetMapping("/registeruser")
	public User registerUser(@RequestBody User user) {
		String tempEmailId=user.getEmailId();
		User userobj = null;
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			userobj=service.saveUser(user);
		}
		return userobj;
		
	}
	}

	
	


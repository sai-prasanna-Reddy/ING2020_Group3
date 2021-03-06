package com.uk.visaapp.reg.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uk.visaapp.reg.model.User;
import com.uk.visaapp.reg.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository repo;
	public User saveUser(User user){
		return repo.save(user);
	}

}

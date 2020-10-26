package com.uk.visaapp.reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uk.visaapp.reg.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{
		
	public User save(User user);

}

package com.uk.visaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uk.visaapp.reg.model.Alien;

@SpringBootApplication
public class VisaappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(VisaappApplication.class, args);
	
	}

}


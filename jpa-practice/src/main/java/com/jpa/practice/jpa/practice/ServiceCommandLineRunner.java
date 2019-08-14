package com.jpa.practice.jpa.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.practice.jpa.practice.entity.User;
import com.jpa.practice.jpa.practice.service.UserSevice;

@Component
public class ServiceCommandLineRunner implements CommandLineRunner {

	
	private static final Logger log= LoggerFactory.getLogger(ServiceCommandLineRunner.class);
	
	@Autowired
	private UserSevice userService;
	
	@Override
	@SuppressWarnings("unused")
	public void run(String...arg0 )throws Exception{
		
		User user = new User("Risko","developer");
		
		long insert = userService.insert(user);
		log.info("New User is created: " + user);
	
	}
}

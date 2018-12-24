package com.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.User;
import com.jpa.repository.UserDaoService;


@Component
public class UserDaoServiceCommandLineRunnner implements CommandLineRunner {

	
	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunnner.class);
	
	@Autowired
	private UserDaoService daoService;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User("Harsh", "User");
		int i = daoService.insert(user);
		log.info("User created : " + user);
		
	}

}

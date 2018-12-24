package com.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.User;
import com.jpa.repository.UserDaoService;
import com.jpa.repository.UserRepository;


@Component
public class UserRepositoryCommandLineRunnner implements CommandLineRunner {

	
	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunnner.class);
	
	@Autowired
	private UserRepository  userRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User("Nilesh", "User");
		userRepository.save(user);
		log.info("User created : " + user);
		
		
		Optional<User> u =userRepository.findById(1);
		log.info("user with id 1 = "+u);
		
		List<User> list =userRepository.findAll();
		log.info("ALL user" + list);
		
		long total =userRepository.count();
		log.info("total id" + total);
		
		
		
	}

}

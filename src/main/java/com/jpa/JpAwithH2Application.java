package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpa")
public class JpAwithH2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpAwithH2Application.class, args);
	}

}


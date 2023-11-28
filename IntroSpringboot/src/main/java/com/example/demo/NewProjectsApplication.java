package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class NewProjectsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(NewProjectsApplication.class, args);
//	
//		Home h = new Home();
//		h.connect();
		
		ConfigurableApplicationContext context = SpringApplication.run(NewProjectsApplication.class, args);
		
		Home h = context.getBean(Home.class);
		h.connect();
		//h is bean
	}

}

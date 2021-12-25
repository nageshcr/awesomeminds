package com.awesomeminds.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBeans {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeans.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeansConfig.class);
		User user1 = context.getBean(User.class);
		User user2 = context.getBean(User.class);
		user1.setUser_id(1);
		user1.setUser_name("Virat");
		System.out.println(user2);	
		
		
	
		
		
	}
	

}

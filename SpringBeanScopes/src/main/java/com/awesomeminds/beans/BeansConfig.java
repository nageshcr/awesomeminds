package com.awesomeminds.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {
	
	@Bean
	@Scope("singleton")
	public User user() {
		
		return new User();
	}

}

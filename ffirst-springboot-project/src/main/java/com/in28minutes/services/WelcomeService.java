package com.in28minutes.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	
	public String retrieveWelcomeMessage(){
		return "WElcome to the journey of Spring Boot";
	}

}

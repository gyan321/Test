package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.services.WelcomeService;

@RestController
public class WelcomeController {
	
	
	/*@RequestMapping("/welcome")
	public String welcome(){
		return "welcome to the world of spring boot application!!!!";
	}*/
	
	

	@RequestMapping("/welcome")
	public String welcome(){
		return service.retrieveWelcomeMessage();
	}
	
	@Autowired
	private WelcomeService service;

}

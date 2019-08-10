package com.vishist.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	
	public static void main(String[] args){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangleRef=  (Triangle) applicationContext.getBean("triangle2");
		triangleRef.Draw();
		 
	}
	
	

}

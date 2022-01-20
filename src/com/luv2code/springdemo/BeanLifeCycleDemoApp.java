package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");  
		
		// retrieve bean from the spring container 
		Coach theCoach = context.getBean("myCoach",Coach.class); 
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class); 
		// check if they are the same bean 
		boolean result = (theCoach==alphaCoach); 
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
	}

}

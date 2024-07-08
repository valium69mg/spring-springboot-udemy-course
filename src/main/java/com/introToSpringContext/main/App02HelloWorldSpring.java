package com.introToSpringContext.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LAUNCH SPRING CONTEXT
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// CONFIGURE THE THINGS WE WANT SPRING TO MANAGE
		System.out.println(context.getBean("name"));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(name -> System.out.println(name));

	}

}

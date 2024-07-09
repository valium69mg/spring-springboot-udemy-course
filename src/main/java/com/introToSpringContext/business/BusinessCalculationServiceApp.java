package com.introToSpringContext.business;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.introToSpringContext.business")
public class BusinessCalculationServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceApp.class);
			) {
			var businessCalculationService = context.getBean(BusinessCalculationService.class);
			System.out.println(businessCalculationService.findMax());
		}
	}

}

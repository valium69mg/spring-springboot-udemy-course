package com.introToSpringContext.jakartaCDI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	
	DataService dataService;
	
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection");
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		return dataService;
	}
	
}

@Named
class DataService {
	
}

@Configuration
@ComponentScan("com.introToSpringContext.jakartaCDI")
public class LauncherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context = new AnnotationConfigApplicationContext(LauncherApp.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(e->System.out.println(e));
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}

}

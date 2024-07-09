package com.introToSpringContext.dependencyinjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// 3 TYPES OF DEP IN SPRING

// construtor-based 
@Component
class YourBusinessClass {
	
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}
// getters and setters
@Component
class YourBusinessClass2 {
	
	Dependency4 dependency3;
	Dependency3 dependency4;
	
	
	@Autowired
	public void setDependency3(Dependency4 dependency3) {
		this.dependency3 = dependency3;
	}


	@Autowired
	public void setDependency4(Dependency3 dependency4) {
		this.dependency4 = dependency4;
	}



	public String toString() {
		return "Using " + dependency3 + " and " + dependency4;
	}
	
}

// fill injection
@Component
class YourBusinessClass3 {
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	@Autowired
	public YourBusinessClass3(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor injection - YourBusinessClass3");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
}
@Component
class Dependency1 {
	
}
@Component
class Dependency2 {
	
}

@Component
class Dependency3 {
	
}
@Component
class Dependency4 {
	
}

@Configuration
@ComponentScan("com.introToSpringContext.dependencyinjection")
public class DependencyInjectionLancherApp {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				var context = new AnnotationConfigApplicationContext(DependencyInjectionLancherApp.class);
			) {
			
			System.out.println(context.getBean(YourBusinessClass.class));
			System.out.println(context.getBean(YourBusinessClass2.class));
			System.out.println(context.getBean(YourBusinessClass3.class));


		}
	}

}

package com.introToSpringContext.postContructAndPreDestroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies ready!");
	}
	// THIS FUNCTION IS EXECUTED AFTER DEPENDENCY INJECTION IS DONE
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	// THIS FUNCTION IS EXECUTED PRIOR TO THE DESTRUCTION OF THE INSTANCE CLASS
	@PreDestroy
	public void cleanUp() {
		someDependency.cleanUp();
	}
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Some dependency doing it work!");
	}
	public void cleanUp() {
		System.out.println("Some dependency shutting of...");
	}
}


@Configuration
@ComponentScan
public class LauncherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try ( var context = new AnnotationConfigApplicationContext(LauncherApp.class);
				) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(e->System.out.println(e));
		}
	}

}

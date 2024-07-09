package com.introToSpringContext.lazyAndEagerInitializationOfSpringBeans;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//Eager Initialization
class ClassA {
	public ClassA() {
		System.out.println("Class A Inizialitation process...");
	}
}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Class B Inizialitation process...");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Class B doing something...");
	}
}

@Configuration
@ComponentScan("com.introToSpringContext.lazyAndEagerInitializationOfSpringBeans")
public class InitializationOfSpringBeansApp {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				var context = new AnnotationConfigApplicationContext(InitializationOfSpringBeansApp.class);
			) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(e -> System.out.println(e));;
			context.getBean(ClassB.class).doSomething();
		}
	}

}

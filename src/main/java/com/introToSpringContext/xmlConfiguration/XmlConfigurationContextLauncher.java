package com.introToSpringContext.xmlConfiguration;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan
public class XmlConfigurationContextLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}

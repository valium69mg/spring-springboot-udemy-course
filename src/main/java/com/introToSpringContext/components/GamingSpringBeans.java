package com.introToSpringContext.components;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.introToSpringContext.components")
public class GamingSpringBeans {

	@Bean
	public GameRunner gameRunner(@Qualifier("contraGameQualifier") GamingConsole game) { // QUALIFIER FOR CONTRA GAME
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (
				var context = new AnnotationConfigApplicationContext(GamingSpringBeans.class);
			) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
			context.getBean(GameRunner.class).run();
		}
	}

}

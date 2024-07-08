package gameWithBeans;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch.qos.logback.core.Context;

public class GameRunnerSprinApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			var context = new AnnotationConfigApplicationContext(GameRunnerConfiguration.class);
		) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
			context.getBean(GameRunner.class).run();
		}
		
		
	}

}

package com.introToSpringContext.beanScopes;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class);
		){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(e->System.out.println(e));
			// SAME HASHCODE (singleton)
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println("================================================================");
			// DIFFERENT HASHCODE (prototype)
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

		}
	}

}

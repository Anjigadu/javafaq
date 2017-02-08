package org.eduami.javafaq.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireJavaConfigDemo {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(org.eduami.javafaq.spring.autowire.Config.class);
	Car c1= (Car)context.getBean("car1");
	System.out.println(c1);
	
}
}

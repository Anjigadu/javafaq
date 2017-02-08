package org.eduami.javafaq.spring.appcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContextFromJavaConfigFileDemo {
public static void main(String[] args) {
	//Load bean definitions from Java configuration file
	ApplicationContext context = new AnnotationConfigApplicationContext(org.eduami.javafaq.spring.appcontext.Config.class);
		Car c= context.getBean(Car.class);
		System.out.println(c);
		
		Bus b= context.getBean("bus1",Bus.class);
		System.out.println(b);
		
}
}

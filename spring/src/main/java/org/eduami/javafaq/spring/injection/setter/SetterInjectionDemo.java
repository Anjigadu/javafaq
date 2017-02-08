package org.eduami.javafaq.spring.injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SetterInjectionDemo {
public static void main(String[] args) {
	//This loads beans form a file in a file system. Not class path.
	ApplicationContext context = new GenericXmlApplicationContext("file:./src/main/java/org/eduami/javafaq/spring/injection/setter/beans.xml");
	Car c1= (Car)context.getBean("car1");
	System.out.println(c1);
	
}
}

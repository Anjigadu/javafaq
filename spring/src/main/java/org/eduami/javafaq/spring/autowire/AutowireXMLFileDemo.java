package org.eduami.javafaq.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutowireXMLFileDemo {
public static void main(String[] args) {
	//This loads beans form a file in a file system. Not class path.
	ApplicationContext context = new GenericXmlApplicationContext("file:./src/main/java/org/eduami/javafaq/spring/autowire/beans.xml");
	Car c1= (Car)context.getBean("car1");
	System.out.println(c1);
	
}
}

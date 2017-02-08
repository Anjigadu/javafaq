package org.eduami.javafaq.spring.beanScope;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SingletonBeanScopeDemo {
public static void main(String[] args) {
	ApplicationContext context = new GenericXmlApplicationContext("file:./src/main/java/org/eduami/javafaq/spring/beanScope/beans.xml");
	Date d1 = context.getBean("singletonDate",Date.class);
	Date d2 = context.getBean("singletonDate",Date.class);
	System.out.println("d1 and d2 are equal: "+(d1==d2));
	
}
}

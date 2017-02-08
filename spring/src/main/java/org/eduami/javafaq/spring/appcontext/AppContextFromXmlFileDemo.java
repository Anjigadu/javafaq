package org.eduami.javafaq.spring.appcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppContextFromXmlFileDemo {
public static void main(String[] args) {
	//This loads beans form a file in a file system. Not class path.
	ApplicationContext context = new GenericXmlApplicationContext("file:./src/main/java/org/eduami/javafaq/spring/appcontext/beans.xml");
	Car c1= (Car)context.getBean("car1");
	Car c2= context.getBean("car1",Car.class);
	System.out.println(c1);  //both c1,c2 holds reference to same car object.  Refer bean scope for more examples
	System.out.println(c2);
	
}
}

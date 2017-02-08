package org.eduami.javafaq.spring.autowire;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="car1",autowire=Autowire.BY_NAME)
	public Car car(){
		return new Car("Ferrai");
	}
	
	@Bean
	public Steering steering(){
		return new Steering("Rounded Metal");
	}
	
}

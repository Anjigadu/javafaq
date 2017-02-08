package org.eduami.javafaq.spring.autowire.fields;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="car1")
	public Car car(){
		return new Car("Ferrai");
	}
	
	@Bean
	public Steering steering(){
		return new Steering("Rounded Metal");
	}
	
}

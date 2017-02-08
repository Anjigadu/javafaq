package org.eduami.javafaq.spring.appcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Car car(){
		return new Car("Ferrai");
	}
	
	@Bean(name="bus1")
	public Bus bus(){
		return new Bus("TATA");
	}
	
}

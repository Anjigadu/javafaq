package org.eduami.javafaq.spring.autowire.fields;

public class Steering {
	private String name;

	public Steering(String name) {
		super();
		this.name = name;
	}

	public Steering() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Steering [name=" + name + "]";
	}
	

}

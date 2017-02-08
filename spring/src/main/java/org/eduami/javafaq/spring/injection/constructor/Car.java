package org.eduami.javafaq.spring.injection.constructor;

public class Car {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	public Car() {
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
		return "Car [name=" + name + "]";
	}
	

}

package org.eduami.javafaq.spring.autowire;

public class Car {
	private String name;
	private Steering steering;

	public Car() {
		super();
	}

	public Car(String name, Steering steering) {
		super();
		this.name = name;
		this.steering = steering;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", steering=" + steering + "]";
	}

	public Car(Steering steering) {
		super();
		this.steering = steering;
	}

}

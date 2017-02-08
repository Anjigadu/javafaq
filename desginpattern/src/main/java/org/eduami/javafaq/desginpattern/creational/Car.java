package org.eduami.javafaq.desginpattern.creational;

public class Car implements Cloneable {
	private String name;
	private String id;
	private String color;

	public Car() {
		super();
	}

	public Car(String name, String id, String color) {
		super();
		this.name = name;
		this.id = id;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", id=" + id + ", color=" + color + "]";
	}

	
}

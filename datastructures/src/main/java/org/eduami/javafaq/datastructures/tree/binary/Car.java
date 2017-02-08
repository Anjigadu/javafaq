package org.eduami.javafaq.datastructures.tree.binary;

public class Car implements Comparable<Car> {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
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

package org.eduami.javafaq.spring.appcontext;

public class Bus {
	private String name;

	public Bus(String name) {
		super();
		this.name = name;
	}

	public Bus() {
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
		return "Bus [name=" + name + "]";
	}
	

}

package org.eduami.javafaq.desginpattern.creational;

public class Prototype {
	public static void main(String[] args) throws CloneNotSupportedException {

		Car car1 = new Car("Ferrari", "1", "Red");
		Car car2 = (Car) car1.clone();
		System.out.println(car1);
		System.out.println(car2);
		System.out.println("Note they are two different copies. Their references are not equal: "+(car1!=car2));

	}
}

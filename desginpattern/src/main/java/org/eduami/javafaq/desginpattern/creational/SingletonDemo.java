package org.eduami.javafaq.desginpattern.creational;

public class SingletonDemo {
	public static void main(String[] args) {
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		System.out.println("runtime1 and runtime2 are equal "+(runtime1==runtime2));
	}
}

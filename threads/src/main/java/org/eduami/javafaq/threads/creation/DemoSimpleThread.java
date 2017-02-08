package org.eduami.javafaq.threads.creation;

public class DemoSimpleThread {
	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		st.start();
		System.out.println("I am main thread");
	}
}

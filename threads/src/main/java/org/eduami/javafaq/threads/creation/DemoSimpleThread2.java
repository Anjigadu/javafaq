package org.eduami.javafaq.threads.creation;

public class DemoSimpleThread2 {
	public static void main(String[] args) throws InterruptedException {
		Thread st2 = new Thread(new SimpleThread2());
		st2.start();
		System.out.println("I am main thread");
	}
}

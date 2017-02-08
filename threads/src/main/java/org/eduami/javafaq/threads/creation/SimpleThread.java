package org.eduami.javafaq.threads.creation;

public class SimpleThread extends Thread{

	@Override
	public void run() {
		System.out.println("I am simple Thread in Run");
	}
}

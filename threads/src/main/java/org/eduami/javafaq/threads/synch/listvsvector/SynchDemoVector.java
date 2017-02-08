package org.eduami.javafaq.threads.synch.listvsvector;

import java.util.List;
import java.util.Vector;

public class SynchDemoVector {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new Vector<String>();
		Thread a = new Thread(new AddThread(list, "A"));
		a.start();
		Thread b = new Thread(new AddThread(list, "B"));
		b.start();

		a.join();
		b.join();

		System.out.println("Main exited");
	}
}

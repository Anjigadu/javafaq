package org.eduami.javafaq.threads.synch.listvsvector;

import java.util.List;

public class AddThread implements Runnable {

	private List<String> list;
	private String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Added by thread: " + name);
			list.add("Added by thread: " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public AddThread(List<String> list, String name) {
		super();
		this.list = list;
		this.name = name;
	}

}

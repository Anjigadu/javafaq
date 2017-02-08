package org.eduami.javafaq.jvmhook;

import java.util.ArrayList;

public class CleanThread implements Runnable {

	@Override
	public void run() {

		System.out.println("I am called");
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("I belive i can ask for more memory :)");
	}

}

package org.eduami.javafaq.threads.synch.stopthread;

import java.util.concurrent.TimeUnit;

/**
 * This program will never terminate
 * @author padma
 *
 */
public class DemoStopThread {
	private static boolean stopThread = false;

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new Runnable() {
			int i = 0;

			@Override
			public void run() {
				do {
					i++;
					System.out.println("The value of i is: " + i);
				} while (!stopThread);

			}
		});
		t.start();
		TimeUnit.SECONDS.sleep(1);
		stopThread=true; //stop the thread
	}
}

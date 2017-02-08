package org.eduami.javafaq.threads.synch.stopthread;

import java.util.concurrent.TimeUnit;

/**
 * This program will properly terminate using synchronized
 * 
 * @author padma
 *
 */
public class DemoStopThreadFixed {
	private static boolean stopThread = false;

	public synchronized static boolean isStopThread() {
		return stopThread;
	}

	public synchronized static void setStopThread(boolean stopThread) {
		DemoStopThreadFixed.stopThread = stopThread;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new Runnable() {
			int i = 0;

			@Override
			public void run() {
				do {
					i++;
					System.out.println("The value of i is: " + i);
				} while (DemoStopThreadFixed.isStopThread());

			}
		});
		t.start();
		TimeUnit.SECONDS.sleep(1);
		DemoStopThreadFixed.setStopThread(true); // stop the thread
	}
}

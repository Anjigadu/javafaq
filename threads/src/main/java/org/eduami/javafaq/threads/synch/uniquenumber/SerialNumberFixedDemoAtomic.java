package org.eduami.javafaq.threads.synch.uniquenumber;

import java.util.concurrent.TimeUnit;

public class SerialNumberFixedDemoAtomic {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					try {
						System.out.println("Thread1 " + SerialNumberFixedAtomic.getSerialNumber());
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					try {
						System.out.println("\t\t\tThread2 " + SerialNumberFixedAtomic.getSerialNumber());
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main exited");
	}// end of main
}

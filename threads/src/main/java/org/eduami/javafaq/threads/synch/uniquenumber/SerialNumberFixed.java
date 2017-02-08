package org.eduami.javafaq.threads.synch.uniquenumber;

public class SerialNumberFixed {
	private static int serialNumber = 0;

	public synchronized static int getSerialNumber() {
		return serialNumber++;
	}
}

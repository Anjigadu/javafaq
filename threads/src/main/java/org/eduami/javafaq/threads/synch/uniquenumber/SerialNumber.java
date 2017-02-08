package org.eduami.javafaq.threads.synch.uniquenumber;

public class SerialNumber {
	private static int serialNumber = 0;

	public static int getSerialNumber() {
		return serialNumber++;
	}
}

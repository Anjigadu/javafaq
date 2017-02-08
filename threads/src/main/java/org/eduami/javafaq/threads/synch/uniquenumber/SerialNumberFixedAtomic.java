package org.eduami.javafaq.threads.synch.uniquenumber;

import java.util.concurrent.atomic.AtomicLong;

public class SerialNumberFixedAtomic {
	private static AtomicLong serialNumber = new AtomicLong();

	public synchronized static long getSerialNumber() {
		return serialNumber.incrementAndGet();
	}
}

package org.eduami.javafaq.threads.creation;

import java.util.concurrent.Callable;

public class SimpleThread3 implements Callable<String> {

	public String call() throws Exception {
		return "I am SimpleThread3 in Run .. Using Callable";
	}
}

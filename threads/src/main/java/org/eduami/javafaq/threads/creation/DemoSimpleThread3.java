package org.eduami.javafaq.threads.creation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Create a thread using Callable interface
 * @author choba02
 *
 */
public class DemoSimpleThread3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<String> future = es.submit(new SimpleThread3());
		System.out.println(future.get());
		es.shutdown();
	}
}

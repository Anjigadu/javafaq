package org.eduami.javafaq.threads.creation;

public class DemoSimpleThreadWithJoin {
	public static void main(String[] args) throws InterruptedException {
		SimpleThread st= new SimpleThread();
		st.start();
		st.join();//Main thread . Please wait till i finish
		System.out.println("I am main thread");
	}
}

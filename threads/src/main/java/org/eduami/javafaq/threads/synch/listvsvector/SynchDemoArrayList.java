package org.eduami.javafaq.threads.synch.listvsvector;

import java.util.ArrayList;
import java.util.List;

public class SynchDemoArrayList {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		Thread a=new Thread(new AddThread(list,"A"));
		a.start();
		Thread b=new Thread(new AddThread(list,"B"));
		b.start();

		a.join();b.join();
//		for(String s:list){
//			System.out.println(s);
//		}
		System.out.println("Main exited");
	}
}


package org.eduami.javafaq.jvmhook;

import java.util.ArrayList;

public class HookDemo {
	public static void main(String[] args) {
		Thread cleanThread = new Thread(new CleanThread());
		Runtime.getRuntime().addShutdownHook(cleanThread);
		ArrayList<HookDemo> list = new ArrayList<HookDemo>();

		try {
			while (true) {
				list.add(new HookDemo());
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory occured");
		}

	}

}

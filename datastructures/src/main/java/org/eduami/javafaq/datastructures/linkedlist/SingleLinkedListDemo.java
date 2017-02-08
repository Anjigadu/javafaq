package org.eduami.javafaq.datastructures.linkedlist;

//It uses custom linked list class
public class SingleLinkedListDemo {
	public static void main(String[] args) {
		SingleLinkedList<String> sl = new SingleLinkedList<String>();
		sl.add("A");
		sl.add("B");
		sl.add("C");
		sl.add("E");
		sl.print();
		sl.remove("A");
		sl.print();
		sl.remove("E");
		sl.print();
		sl.remove("C");
		sl.print();
		sl.remove("B");
		sl.print();

	}
}

package org.eduami.javafaq.datastructures.linkedlist;

public class Node<T> {
	private T data;
	private Node<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node() {
		super();
	}

	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node(T data) {
		super();
		this.data = data;
	}

}

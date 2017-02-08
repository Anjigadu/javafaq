package org.eduami.javafaq.datastructures.tree.binary;

public class Node<T extends Comparable<T> > {

	private Node<T> left;
	private T data;
	private Node<T> right;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public Node(Node<T> left, T data, Node<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node() {
		super();

	}

}

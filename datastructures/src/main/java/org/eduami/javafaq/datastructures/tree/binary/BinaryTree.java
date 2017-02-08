package org.eduami.javafaq.datastructures.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

//Custom binary tree implementation
public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;

	public BinaryTree() {
		super();
	}

	public void add(T data) {
		if (root == null) {
			root = new Node<T>(null, data, null);
		} else {
			insert(root, data);
		}
	}

	/**
	 * Recursively add an element in the tree
	 * 
	 * @param node
	 * @param data
	 */
	private void insert(Node<T> node, T data) {
		if (node.getData().compareTo(data) < 0) { // add to left subtree
			if (node.getLeft() != null) {
				insert(node.getLeft(), data);
			} else {
				node.setLeft(new Node<T>(null, data, null));
			}
		} else if (node.getData().compareTo(data) > 0) { // add to right subtree

			if (node.getRight() != null) {
				insert(node.getRight(), data);
			} else {
				node.setRight(new Node<T>(null, data, null));
			}
		} else {
			System.out.println("Duplicate element");
		}
	}

	public void printElements() {
		inOrder(root);
	}

	public void printElements(BinaryTree.TraverseOrder order) {
		switch (order) {
		case INORDER:
			inOrder(root);
			break;
		case POSTORDER:
			postOrder(root);
			break;
		case PREORDER:
			preOrder(root);
			break;
		case LEVELORDER:
			levelOrder(root);
			break;	
		default:
			inOrder(root);

		}

	}
	
	
	public void printElementsAtLevel(Integer level){
		Queue<Node<T>> queue= new LinkedList<Node<T>>();
		queue.add(root);
		for(int i=1;i<=level;i++){
			Queue<Node<T>> tqueue= new LinkedList<Node<T>>();
			while(!queue.isEmpty()){
				Node<T> node=queue.poll();
				if(node.getLeft()!=null) tqueue.add(node.getLeft());
				if(node.getRight()!=null) tqueue.add(node.getRight());
			}
			queue=tqueue;
		}
		while(!queue.isEmpty()){
			System.out.println(queue.poll().getData());
		}
	}

	private void inOrder(Node<T> node) {

		if (node == null)
			return;

		inOrder(node.getLeft());

		System.out.println(node.getData());

		inOrder(node.getRight());

	}

	private void preOrder(Node<T> node) {

		if (node == null)
			return;

		System.out.println(node.getData());

		inOrder(node.getLeft());

		inOrder(node.getRight());

	}

	private void postOrder(Node<T> node) {

		if (node == null)
			return;

		inOrder(node.getLeft());

		inOrder(node.getRight());

		System.out.println(node.getData());

	}

	public boolean contains(T data) {
		return search(root, data) == null ? false : true;
	}

	private Node<T> search(Node<T> node, T data) {
		if (node == null || node.getData().compareTo(data) == 0) {
			return node;
		} else if (node.getData().compareTo(data) < 0) {
			return search(node.getLeft(), data);
		} else {
			return search(node.getRight(), data);
		}
	}

	public enum TraverseOrder {
		INORDER, PREORDER, POSTORDER, LEVELORDER
	}
	
	private void levelOrder(Node<T> node){
		Queue<Node<T>> queue= new LinkedList<Node<T>>();
		queue.add(node);
		while(!queue.isEmpty()){
			node=queue.poll();
			System.out.println(node.getData());
			if(node.getLeft()!=null) queue.add(node.getLeft());
			if(node.getRight()!=null) queue.add(node.getRight());
			}
	}
	


}

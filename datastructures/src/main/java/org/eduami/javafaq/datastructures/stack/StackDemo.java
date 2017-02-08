package org.eduami.javafaq.datastructures.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
	}
}

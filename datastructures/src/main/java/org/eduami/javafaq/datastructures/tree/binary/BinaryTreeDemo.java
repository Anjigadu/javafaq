package org.eduami.javafaq.datastructures.tree.binary;

public class BinaryTreeDemo {
	public static void main(String[] args) {

	BinaryTree<String> tree= new BinaryTree<String>();
	tree.add("1");
	tree.add("2");
	tree.printElements();
	
	BinaryTree<Car> carsTree= new BinaryTree<Car>();
	carsTree.add(new Car("Ferrari"));
	carsTree.add(new Car("Tata"));
	carsTree.printElements();
	
	System.out.println(BinaryTree.TraverseOrder.PREORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.PREORDER);
	
	System.out.println(BinaryTree.TraverseOrder.POSTORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.POSTORDER);
	
	System.out.println(BinaryTree.TraverseOrder.INORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.INORDER);
	
	
	BinaryTree<Integer> itree= new BinaryTree<Integer>();
	itree.add(40);
	itree.add(25);
	itree.add(78);
	itree.add(10);
	itree.add(32);
	
	itree.printElements(BinaryTree.TraverseOrder.INORDER);
	System.out.println(itree.contains(250));
	
	System.out.println("LEVEL ORDER Traversal");
	itree.printElements(BinaryTree.TraverseOrder.LEVELORDER);
	
	System.out.println("Elements at level 2");
	itree.printElementsAtLevel(2);
	
	}
}

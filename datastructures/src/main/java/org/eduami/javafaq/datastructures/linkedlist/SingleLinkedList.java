package org.eduami.javafaq.datastructures.linkedlist;

public class SingleLinkedList<T> {
	private Node<T> head;
	
	public void add(T data){
		if(head==null){
			head= new Node<T>(data);
		}else if(head.getNext()==null){// if we have only one element
			head.setNext(new Node<T>(data));
		}else{
			Node<T> current=head;
			while(current.getNext()!=null){ //traverse till end
				 current=current.getNext();
			}
			current.setNext(new Node<T>(data));//add at the end of list
		}
		
	}
	
	public void print(){
		Node<T> current=head;
		while(current!=null){
			System.out.print(current.getData()+" ");
			current=current.getNext();
		}
		System.out.println();
	}
		
	
	public T remove(T data){
		if(head.getData().equals(data)){ //remove the head element
			head=head.getNext();
		}else{
			Node<T>current=head;
			while(current.getNext()!=null && !current.getNext().getData().equals(data)){ //move till next to find element
				current=current.getNext();
			}
			if(current.getNext()!=null){ //not end of the list
			current.setNext(current.getNext().getNext());//remove the link
			}
		}
		return data;
	}
}

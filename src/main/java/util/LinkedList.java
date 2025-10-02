package util;

public class LinkedList<T> {

	Node<T> head;

	private static class Node<T>{
		T value;
		Node<T> next;

		public Node(T value){
			this.value = value;
			this.next = null;
		}
	}

	public void add(T value){
		addToEnd(value);
	}

	public void addToStart(T value){
		Node<T> node = new Node<>(value);
		if (this.head == null){
			this.head = node;
			return;
		}

		node.next = this.head;
		head = node;
	}

	public void addToEnd(T value){
		Node<T> node = new Node<>(value);
		if (this.head == null){
			this.head = node;
			return;
		}

		Node<T> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}

	public void printAll(){
		Node<T> temp = head;
		while (temp.next != null){
			System.out.println(temp.value);
			temp = temp.next;
		}
	}


}
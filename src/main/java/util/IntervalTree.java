package util;

public class IntervalTree {

	private static class Node<T>{
		Interval<T> interval;
		T value;
		Node<T> left, right;


		public Node(T value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
}
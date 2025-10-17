package util;

public class BinaryTree {

	Node root;

	private static class Node{
		int value;
		Node left;
		Node right;

		public Node(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public void peek() {
		printTree(root, 0);
	}
	public boolean searchFor(int value){ return TreeSearch(value);}
	public void add(int value){ root = add(root, value);}
	public void remove(int value){ root = remove(root, value);}

	private Node add(Node node, int value){
		if(node == null){
			node = new Node(value);
		} else if (value < node.value){
			node.left = add(node.left, value);
		} else {
			node.right = add(node.right, value);
		}
		return node;
	}

	private Node remove(Node root, int value){
		if(root == null){
			return null;
		}
		if(root.value < value){
			root.right = remove(root.right, value);
		} else if (root.value > value){
			root.left = remove(root.right, value);
		} else {
			if(isLeaf(root)){
				return null;
			}

			if(root.left == null){
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			Node min = min(root.right);
			root.value = min.value;
			root.right = remove (root, min.value);
		}
		return root;
	}

	private boolean isLeaf(Node root){
		return root.left == null && root.right == null;
	}

	private Node min (Node node){
		Node aux = node;
		while(aux.left != null){
			aux = aux.left;
		}
		return aux;
	}

	private boolean TreeSearch(int value) {
		Node root = this.root;

		while(root != null){
			if(root.value == value) return true;

			root = value < root.value ? root.left : root.right;
		}
		return false;
	}

	private void printTree(Node root, int level) {
		if (root == null) return;
		printTree(root.right, level + 1);
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}
		System.out.println(root.value);
		printTree(root.left, level + 1);
	}

}
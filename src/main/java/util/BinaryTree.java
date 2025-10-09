package util;

public class BinaryTree {

	Node root;

	private static class Node{
		int value;
		Node lesser;
		Node greater;

		public Node(int value){
			this.value = value;
			this.lesser = null;
			this.greater = null;
		}
	}

	public void printTree() {
		printTree(root, 0);
	}

	public boolean TreeSearch(int value)
	{
		Node root = this.root;

		while(root != null){
			if(root.value == value) return true;

			root = value < root.value ? root.lesser : root.greater;
		}
		return false;
	}

	private void printTree(Node root, int level) {
		if (root == null) return;
		printTree(root.greater, level + 1);
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}
		System.out.println(root.value);
		printTree(root.lesser, level + 1);
	}

}
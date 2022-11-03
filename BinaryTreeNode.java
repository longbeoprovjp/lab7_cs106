package binarysearchtree;

public class BinaryTreeNode {
	BinaryTreeNode left;
	BinaryTreeNode right;
	int key;

	public BinaryTreeNode(int key) {
		this.key = key; // Assign data to the new node
		this.left = null; // set left and right children to null
		this.right = null;
	}
}

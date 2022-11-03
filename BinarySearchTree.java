package binarysearchtree;

/**
 * CS 106 Theory and Practice II CRN: 38050 Assignment: Lab 7
 * 
 * @author Long Duong
 */

import static java.lang.Math.*;
import static sbcc.Core.*;

public class BinarySearchTree implements BSTInterface {

	BinaryTreeNode root;

	@Override
	public int removeNodeBST(int key) {
		BinaryTreeNode parNode = null;
		BinaryTreeNode curNode = root;
		while (curNode != null) { // Search for node
			if (curNode.key == key) { // Node found
				if (curNode.left == null && curNode.right == null) { // Remove leaf
					if (parNode == null) // Node is root
						root = null;
					else if (parNode.left == curNode)
						parNode.left = null;
					else
						parNode.right = null;
				} else if (curNode.right == null) { // Remove node with only left child
					if (parNode == null) // Node is root
						root = curNode.left;
					else if (parNode.left == curNode)
						parNode.left = curNode.left;
					else
						parNode.right = curNode.left;
				} else if (curNode.left == null) { // Remove node with only right child
					if (parNode == null) // Node is root
						root = curNode.right;
					else if (parNode.left == curNode)
						parNode.left = curNode.right;
					else
						parNode.right = curNode.right;
				} else { // Remove node with two children
					// Find successor (leftmost child of right subtree)
					BinaryTreeNode sucNode = curNode.right;
					while (sucNode.left != null)
						sucNode = sucNode.left;
					int successorData = sucNode.key;
					removeNodeBST(sucNode.key); // Remove successor
					curNode.key = successorData;
				}
				return 1;// Node found and removed
			} else if (curNode.key < key) { // Search right
				parNode = curNode;
				curNode = curNode.right;
			} else { // Search left
				parNode = curNode;
				curNode = curNode.left;
			}
		}
		return 0;// Node not found

	}


	@Override
	public BinaryTreeNode searchNodeBST(int key) {
		BinaryTreeNode curNode = root;
		while (curNode != null) {
			if (key == curNode.key) {
				return curNode; // Found
			} else if (key < curNode.key) {
				curNode = curNode.left;
			} else {
				curNode = curNode.right;
			}
		}
		return curNode; // Not found

	}


	@Override
	public void insertNodeBST(BinaryTreeNode node) {
		if (root == null) {
			root = node;
		} else {
			BinaryTreeNode currentNode = root;
			while (currentNode != null) {
				if (node.key < currentNode.key) {
					if (currentNode.left == null) {
						currentNode.left = node;
						currentNode = null;
					} else {
						currentNode = currentNode.left;
					}
				} else {
					if (currentNode.right == null) {
						currentNode.right = node;
						currentNode = null;
					} else {
						currentNode = currentNode.right;
					}
				}
			}
		}
	}


	@Override
	public void printInOrderBST(BinaryTreeNode node) {
		if (node == null)
			return;

		printInOrderBST(node.left);
		print(node.key + " ");
		printInOrderBST(node.right);

	}


	@Override
	public int getNodeHeightBST(BinaryTreeNode node) {
		if (node == null) {
			return -1;
		}
		int leftHeight = getNodeHeightBST(node.left);
		int rightHeight = getNodeHeightBST(node.right);
		return 1 + max(leftHeight, rightHeight);
	}

}

package binarysearchtree;

import static sbcc.Core.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

/**
 * CS 106 Theory and Practice II CRN: 38050 Assignment: Lab 7
 * 
 * @author Long Duong
 */
public class Main {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();// create the tree

		// put 300, 100, 775, 25, 201, 750, 925 and 11 into the tree
		BinaryTreeNode node1 = new BinaryTreeNode(300);
		BinaryTreeNode node2 = new BinaryTreeNode(100);
		BinaryTreeNode node3 = new BinaryTreeNode(775);
		BinaryTreeNode node4 = new BinaryTreeNode(25);
		BinaryTreeNode node5 = new BinaryTreeNode(201);
		BinaryTreeNode node6 = new BinaryTreeNode(750);
		BinaryTreeNode node7 = new BinaryTreeNode(925);
		BinaryTreeNode node8 = new BinaryTreeNode(11);

		bst.insertNodeBST(node1);
		bst.insertNodeBST(node2);
		bst.insertNodeBST(node3);
		bst.insertNodeBST(node4);
		bst.insertNodeBST(node5);
		bst.insertNodeBST(node6);
		bst.insertNodeBST(node7);
		bst.insertNodeBST(node8);

		// print all the nodes
		bst.printInOrderBST(node1);

		println();

		// get height of the nodes
		println("Height of the root is " + bst.getNodeHeightBST(node1));
		println("Height of the node 2 is " + bst.getNodeHeightBST(node2));
		println("Height of the node 3 is " + bst.getNodeHeightBST(node3));
		println("Height of the node 4 is " + bst.getNodeHeightBST(node4));
		println("Height of the node 5 is " + bst.getNodeHeightBST(node5));
		println("Height of the node 6 is " + bst.getNodeHeightBST(node6));
		println("Height of the node 7 is " + bst.getNodeHeightBST(node7));
		println("Height of the node 8 is " + bst.getNodeHeightBST(node8));
	}

}

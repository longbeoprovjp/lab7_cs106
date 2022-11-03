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
		BinaryTreeNode root = new BinaryTreeNode(300);
		bst.insertNodeBST(new BinaryTreeNode(100));
		bst.insertNodeBST(new BinaryTreeNode(775));
		bst.insertNodeBST(new BinaryTreeNode(25));
		bst.insertNodeBST(new BinaryTreeNode(201));
		bst.insertNodeBST(new BinaryTreeNode(750));
		bst.insertNodeBST(new BinaryTreeNode(925));
		bst.insertNodeBST(new BinaryTreeNode(11));

		// print all the nodes
		bst.printInOrderBST(root);

		println();

		// get height of the nodes
		print(bst.getNodeHeightBST(root));

	}

}

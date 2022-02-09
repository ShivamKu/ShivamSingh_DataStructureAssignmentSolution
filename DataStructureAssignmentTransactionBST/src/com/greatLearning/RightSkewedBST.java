package com.greatLearning;

public class RightSkewedBST {
	
	static class Node {
	    int value;
	    Node left, right;

	    Node(int item) {
	        value = item;
	        left = right = null;
	    }
	}
	
	
	    public Node node;
	    public Node prevNode = null;
	    public Node headNode = null;

	    public void createSkewedTree(Node root, int order) {
	        if (root == null) {
	            return;
	        }

	        if (order > 0) {
	            createSkewedTree(root.right, order);
	        } else {
	            createSkewedTree(root.left, order);
	        }
	        Node rightNode = root.right;
	        Node leftNode = root.left;

	        if (headNode == null) {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        } else {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }

	        if (order > 0) {
	            createSkewedTree(leftNode, order);
	        } else {
	            createSkewedTree(rightNode, order);
	        }
	    }

	    public void traverseRightSkewed(Node root) {
	        if (root != null) {
	        	System.out.print(root.value + " -> ");
		        traverseRightSkewed(root.right);
	        }
	        else
	        	return;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightSkewedBST tree = new RightSkewedBST();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left = new Node(55);
	    
	     int order = 0;
	     tree.createSkewedTree(tree.node, order);
	     System.out.print("Rightly Skewed Tree is as following: ");
	     tree.traverseRightSkewed(tree.headNode);

	}

}

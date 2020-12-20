package adil.java.datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	Node left, right;
	int val;

	public Node(int data) {
		val = data;
		left = right = null;
	}
}

public class LevelOrderTraversal {

	Node node;

	void display() {
		inOrder(node);
	}

	private void inOrder(Node node2) {
		// TODO Auto-generated method stub
		if (node2 == null)
			return;
		inOrder(node2.left);
		System.out.print(node2.val + "->");
		inOrder(node2.right);
	}

	private void levelOrderTraversal() {
		displayLevelOrderTraversal(node);
	}

	private void displayLevelOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		Queue<Node> storage = new LinkedList<>();
		storage.add(node);
		storage.add(null);
		while (!storage.isEmpty()) {
			Node curr = storage.poll();

			if (curr == null) {
				if (!storage.isEmpty()) {
					storage.add(null);
					System.out.print("$ ");
				}
			} else {
				if (curr.left != null)
					storage.add(curr.left);
				if (curr.right != null) {
					storage.add(curr.right);
				}
				System.out.print(curr.val + "");
			}
			if (storage.isEmpty())
				System.out.print("$");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderTraversal level = new LevelOrderTraversal();
		level.node = new Node(1);
		level.node.left = new Node(2);
		level.node.right = new Node(3);
		level.node.left.left = new Node(4);
		level.node.left.right = new Node(5);
		level.node.right.left = new Node(6);
		level.node.right.right = new Node(7);

		System.out.println(">>>>>>  In Order Traversal");
		level.display();
		System.out.println();
		System.out.println(">>>>>>  Level Order Traversal");

		level.levelOrderTraversal();
	}

}

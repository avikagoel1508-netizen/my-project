package assignment;

import java.util.Scanner;

public class identical_bt {
static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		identical_bt m = new identical_bt();
		BinaryTree bt1 = m.new BinaryTree();
		BinaryTree bt2 = m.new BinaryTree();
		System.out.println(bt1.structurallyIdentical(bt2));
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public boolean structurallyIdentical(BinaryTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node root1, Node root2) {
			// write your code here
            if (root1==null && root2!=null) {
                return false;
            }
            boolean lt=structurallyIdentical(root1.left, root2.left);
            boolean rt=structurallyIdentical(root1.right, root2.right);
            return lt&&rt;
		}

	}
}

package assignment;

import java.util.Scanner;

public class isbalance {
static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		isbalance m = new isbalance();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBal;
		}

		private BalancedPair isBalanced(Node node) {
            if (node==null) {
                return new BalancedPair();
            }
			BalancedPair lbp=isBalanced(node.left);
			BalancedPair rbp=isBalanced(node.right);
            BalancedPair sbp=new BalancedPair();
            sbp.ht=Math.max(lbp.ht, rbp.ht)+1;
            boolean sb=Math.abs(lbp.ht-rbp.ht)<=1;
            sbp.isBal=lbp.isBal&& rbp.isBal && sb;
            return sbp;
		}
        
		private class BalancedPair {
			int ht=-1;
			boolean isBal=true;
		}

	}
}

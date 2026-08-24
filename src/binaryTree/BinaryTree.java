package binaryTree;

public class BinaryTree {
	Node left;
	Node right;
	Node root;
	public void add(int data) {
		Node nn = new Node(data);
		if(root==null) {
			root = nn;
			return;
		}
		Node temp = root;
		while(temp!=null) {
			if(temp.data>nn.data) {
				temp.prev = nn;
				temp = temp.prev;
			}
			if(temp.data<nn.data) {
				temp.next = nn;
				temp = temp.next;
			}
		}
	}
	
	public void print() {
		if(root == null) {
			System.out.println("Binary Tree is empty");
			return;
		}
		if(root.prev == null && root.next == null) {
			System.out.print(root.data);
			return;
		}
		Node temp = root.prev;
		while(temp!=null) {
			temp = temp.prev;
			if(temp.prev==null) {
				System.out.print(temp.data);
			}
		}
		
	}
	
}

package binarySearchTree;

public class BinaryTree {
	Node root;
//	public void add(int data) {
//		Node nn = new Node(data);
//		if(root==null) {
//			root = nn;
//			return;
//		}
//		Node temp = root;
//		while(temp!=null) {
//			if(temp.data>nn.data) {
//				if(temp.left==null) {
//					temp.left = nn;
//					return;
//				}
//				else temp = temp.left;
//			}
//			if(temp.data<nn.data) {
//				if(temp.right==null) {
//					temp.right = nn;
//					return;
//				}
//				else temp = temp.right;
//			}
//		}
//	}
	
	public Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		else if(data<root.data) {
			root.left = insert(root.left, data);
		}
		else if(data>root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public boolean isPresent(Node root, int data) {
		if(root==null) return false;
		if(root.data == data) return true;
		if(root.data>data) {
			return isPresent(root.left, data);
		}
		if(root.data<data) {
			return isPresent(root.right, data);
		}
		return false; 
	}

	public void print(Node root) {
		if(root == null) {
			return;
		};
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
		return;
	}
	
	
	
	
}

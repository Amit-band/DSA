package binarySearchTree;

public class BinarySearchTree {
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

	
	
//	inOrder -> left-root-right
	public void inOrder(Node root) {
		if(root == null) {
			return;
		};
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
//	postdOrder -> root-left-right
	public void preOrder(Node root) {
		if(root==null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
// preOrder -> left-right-root
	public void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	
}

package binarySearchTree;

public class ProgramDriver {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 50);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 80);
		bst.insert(bst.root, 60);
		bst.inOrder(bst.root);
//		System.out.println(bt.root.data);
//		System.out.println(bt.root.left.data);
//		System.out.println(bt.root.right.data);
//		System.out.println(bt.root.left.right.data);
//		System.out.println(bt.root.right.right.data);
//		System.out.println(bt.root.right.left.data);
		System.out.println();
//		System.out.println(bt.root.left.left.data);
//		System.out.println(bt.root.right.data);
		System.out.println(bst.isPresent(bst.root,70));
		bst.preOrder(bst.root);
		System.out.println();
		bst.postOrder(bst.root);
		
	}
}

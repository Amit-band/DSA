package binarySearchTree;

public class ProgramDriver {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.insert(bt.root, 50);
		bt.insert(bt.root, 70);
		bt.insert(bt.root, 30);
		bt.insert(bt.root, 20);
		bt.insert(bt.root, 40);
		bt.insert(bt.root, 80);
		bt.insert(bt.root, 60);
		bt.print(bt.root);
//		System.out.println(bt.root.data);
//		System.out.println(bt.root.left.data);
//		System.out.println(bt.root.right.data);
//		System.out.println(bt.root.left.right.data);
//		System.out.println(bt.root.right.right.data);
//		System.out.println(bt.root.right.left.data);
		System.out.println();
//		System.out.println(bt.root.left.left.data);
//		System.out.println(bt.root.right.data);
		System.out.println(bt.isPresent(bt.root,70));
		
		
	}
}

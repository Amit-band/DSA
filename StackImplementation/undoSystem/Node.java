package undoSystem;

public class Node {
	String data;
	Node next;
	char operation;
	int index;
	public Node(String data, int index) {
		this.data = data;
		this.index = index;
	}
	public Node(String data) {
		this.data = data;
	}
	public Node(String data, char operation, int index) {
		this.data = data;
		this.operation = operation;
		this.index = index;
	}
	
	
	
}

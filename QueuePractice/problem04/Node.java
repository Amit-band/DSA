package problem04;

public class Node {
	int ID;
	String name;
	String destination;
	Node next;
	Node prev;
	
	public Node(int ID, String name, String destination) {
		this.ID = ID;
		this.name = name;
		this.destination = destination;
	}
}

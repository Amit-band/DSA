package problem03;

public class Node {
	int PID;
	String name;
	String reason;
	Node next;
	Node prev;
	
	public Node(int PID, String name, String reason) {
		this.PID = PID;
		this.name = name;
		this.reason = reason;
	}
}

package problem02;

public class Node {
	String customer;
	String issue;
	Node next;
	Node prev;
	
	public Node(String customer,String issue) {
		this.customer = customer;
		this.issue = issue;
	}
}

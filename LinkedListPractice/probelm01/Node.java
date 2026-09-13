package probelm01;

public class Node<T, P, S> {
	T PID;
	P name;
	S destination;
	Node next;
	public Node(T PID,P name, S destination) {
		this.PID = PID;
		this.name = name;
		this.destination = destination;
	}
}

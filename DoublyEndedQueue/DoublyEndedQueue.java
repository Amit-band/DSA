public class DoublyEndedQueue {
	private Node front;
	private Node rear;
	int length;
	public void frontEnqeue(int data) {
		Node nn = new Node(data);
		if(front == null && rear == null) {
			front = rear = nn;
			length++;
			return;
		}
		front.prev = nn;
		nn.next= front;
		front = nn;
		length++;
	}
	public int frontPeek() {
		if(front == null) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		return front.data;
		
	}
	public int rearPeek() {
		if(rear == null) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		return rear.data;
	}
	public void rearEnqueue(int data) {
		Node nn = new Node(data);
		if(front == null && rear == null) {
			front = rear = nn;
			length++;
			return;
		}
		rear.next = nn;
		nn.prev = rear;
		rear = nn;
		length++;
	}
	public int frontDequeue() {
		if(front == null) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		int data = front.data;
		front = front.next;
		front.prev.next = null;
		front.prev = null;
		length--;
		return data;
	}
	public int rearDequeue() {
		if(rear == null) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		int data = rear.data;
		rear = rear.prev;
		rear.next.prev = null;
		rear.next = null;
		length--;
		return data;
		
	}
	
	
	
}

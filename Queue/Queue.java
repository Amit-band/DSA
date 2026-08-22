public class Queue {
	Node front;
	Node rear;
	int length;
// Adding
	public void enqueue(int data) {
		Node nn =new Node(data);
		if(front==null && rear == null) {
			front=rear=nn;
			length++;
			return;
		}
		front.prev = nn;
		nn.next = front;
		front = nn;
		length++;
	}
	
//	peek()	
	public int peek() {
		if(rear == null) {
			System.out.println("Queue is Emptyh!");
			return -1;
		}
		return rear.data;
	}
	
//	dequeue
	public int dequeue() {
		if(rear==null) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		int data = rear.data;
		rear = rear.prev;
		rear.prev.next = null;
		rear.prev = null;
		length--;
		return data;
	}
}

public class DoublyLinkedList {
    	Node head;
	Node tail;
	public void addAtEnd(int data) {
		Node nn = new Node(data);
		if(head == null && tail == null) {
			head= tail = nn;
			return;
		}
		nn.prev = tail;
		tail.next = nn;
		tail = nn;
		
	}
}

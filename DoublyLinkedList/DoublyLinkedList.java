package doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;
	public void addAtEnd(int data) {
		Node nn = new Node(data);
		if(head == null && tail == null) {
			head= tail = nn;
			length++;
			return;
		}
		nn.prev = tail;
		tail.next = nn;
		tail = nn;
		length++;
	}
	
//	Adding at begin
	public void addAtBegin(int data) {
		Node nn = new Node(data);
		if(head==null && tail == null) {
			head = tail = nn;
			length++;
			return;
		}
		head.prev = nn;
		nn.next = head;
		head = nn;
		length++;
	}
	
//	Forward Traversal
	public void print() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp  = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
//	Reverse Traversal
	public void printRev() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
//	Adding at Index
	public void addAtIndex(int index, int data) {
		if(index < 0 || index>length) {
			System.out.println("Invalid Index");
			return;
		}
//		if adding in head
		if(index == 0) {
			addAtBegin(data);
			return;
		}
//		if adding in tail
		if(index == length) {
			addAtEnd(data);
			return;
		}
		
//		add at valid index
		Node nn = new Node(data);
		Node temp = head;
		for(int i = 0; i<index-1;i++) {
			temp = temp.next;
		}
		nn.prev = temp;
		nn.next = temp.next;
		nn.next.prev = nn;
		temp.next = nn;
		length++;
	}
	
//	Deletion from Start
public void deleteAtBegin() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head == tail) {
			head = tail = null;
			length--;
			return;
		}
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		length--;
	}

	// delete from end
	public void deleteAtEnd() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head == tail) {
			head = tail = null;
			length--;
			return;
		}
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		length--;
	}
	// delete at index
	public void deleteAtIndex(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0) {
			deleteAtBegin();
			return;
		}
		if(index == length-1) {
			deleteAtEnd();
			return;
		}
		Node temp = head;
		for(int i = 0; i<index;i++) {
			temp = temp.next;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		length--;
		
	}

	// find at Index
	public void findAtIndex(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Invalid Index");
		}
		Node temp = head;
		for(int i = 0; i<index;i++) {
			temp = temp.next;
		}
		System.out.println("Element at index "+index+" is "+temp.data);
	}	
}

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
	public void addAtIndexDP(int index, int data) {
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
		if(index<length/2) {
			Node temp = head;
			for(int i = 0 ; i<index;i++) {
				temp = temp.next;
			}
			nn.prev = temp;
			nn.next = temp.next;
			temp.next.prev = nn;
			temp.next=nn;
			length++;
			return;
		}
		if(index>=length/2) {
			Node temp = tail;
			for(int i = length-1;i>index;i--) {
				temp = temp.prev;
			}
			nn.prev = temp.prev;
			nn.next = temp;
			temp.prev.next = nn;
			temp.prev = nn;
			length++;
			return;
		}
	}
//	Deleting from Begin
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

//	Delete from End
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
//	Delete at an Index
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
		temp.prev.next= temp.next;
		temp.next.prev = temp.prev;
		temp.prev = null;
		temp.next = null;
		length--;
	}

//	find at index
	public void findAtIndex(int index) {
			if(index < 0 || index >= length) {
				System.out.println("Invalid Index");
				return;
			}
			Node temp = head;
			for(int i = 0; i<index;i++) {
				temp = temp.next;
			}
			System.out.println(temp.data);
		}

//	update by index
	public void updateByIndexDP(int index, int data) {
		if(index < 0 || index >=length) {
			System.out.println("Invalid Index");
			return;
		}
		Node nn = new Node(data);
		Node temp = head;
		if(index < length/2) {
			for(int i = 0; i<index;i++) {
				temp = temp.next;
			}
			temp.data = nn.data;
			return;
		}
		Node temp2 = tail;
		if(index >= length/2) {
			for(int i = length-1; i>index;i--) {
				temp2 = temp2.prev;
			}
			temp2.data = nn.data;
			
			return;
		}
	}

//	Reverse the original LL
	public void reverseOriginal() {
		int count = 0;
		Node temphead = head;
		Node temptail = tail;
		while(count != length/2) {
			int temp = temphead.data;
			temphead.data = temptail.data;
			temptail.data = temp;
			temphead = temphead.next;
			temptail = temptail.prev;
			count++;
		}
	}
	
//	Update using element
	public void updateByElement(int ele, int data) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data != ele) {
				temp= temp.next;
			}
			else {
				break;
			}
		}
		temp.data = data;
	}

}

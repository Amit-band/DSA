package linkedList;

public class LinkedList {
	Node head;
	int length;
	public void add(int data) {
		Node nn = new Node(data);
		if(head == null) {
			head = nn;
			length++;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp =temp.next;
		}
		temp.next=nn;
		length++;
	}
	
//  printing the list
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
//	Adding at a given index
	public void addAtIndex(int index, int data) {
		Node nn = new Node(data);
		if(index<0 || index >length) {
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0) {
			Node temp = head;
			head = nn;
			nn.next = temp;
			length++;
			return;
		}
		Node temp = head;
		for(int i = 0;i<index-1;i++) {
			temp = temp.next;
		}
		Node tempNext = temp.next;
		temp.next = nn;
		nn.next = tempNext;
		length++;
	}

	
//	Finding at data at given index
	public int elementAtIndex(int index) {
		if(index<0 || index > length) {
			System.out.println("Invalid Index");
			return 0;
		}
		if(index == 0) {
			return head.data;
		}
		Node temp = head;
		for(int i =0; i<index;i++) {
			temp= temp.next;
		}
		return temp.data;
	}
	
	
//	Adding at Beginning
	public void addAtBegin(int data) {
		Node nn= new Node(data);
		if(head == null) {
			head = nn;
			length++;
			return;
		}
		Node temp = head;
		head = nn;
		nn.next = temp;
		length++;
	}

//	Delete from beginning
	public void deleteFromBegin() {
		if(head == null) {
			System.out.println("EMPTY LIST");
			return;
		}
		Node temp = head;
		head = temp.next;
		temp.next=null;
		length--;
	}
	
//	Delete from ending
	public void deleteFromEnd() {
		if(head==null) {
			System.out.println("EMPTY LIST");
			return;
		}
		if(length==1) {
			head=null;
			length--;
			return;
		}
		Node temp = head;
		for(int i =0;i<length-2;i++) {
			temp = temp.next;
		}
		temp.next = null;
		length--;
	}

	
//	Delete from index
	public void deleteAtIndex(int index) {
		if(index <0 || index>=length) {
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0) {
			System.out.println("Deleted Element: "+head.data);
			deleteFromBegin();
			return;
		}
		Node temp = head;
		for(int i = 1;i<index;i++) {
			temp = temp.next;
		}
		Node tempnext = temp.next.next;
		int deletedEle = temp.next.data;
		temp.next.next = null;
		temp.next = tempnext;
		length--;
		System.out.println("Deleted Element: "+deletedEle);
	}
	
////	Sorting the list
//	public void sortLinkedList() {
//		if(head == null) {
//			System.out.println("List is empty");
//			return;
//		}
//		if(length == 1) {
//			print();
//			return;
//		}
//		Node temp = head;
//		for(int i = 0; i<length-1;i++) {
//			Node temp1 = head.next;
//			head.next = head;
//			head = temp1;  
//		}
//	}
	
}

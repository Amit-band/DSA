package doublyLinkedList;

public class ProgramDriver {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtEnd(10);
		dll.addAtEnd(20);
		dll.addAtEnd(30);
		dll.addAtEnd(40);
		
//		dll.print();
//		dll.printRev();
		dll.addAtBegin(5);
		dll.print();
//		dll.printRev();
		dll.addAtIndexDP(3, 25);
		dll.print();
//		System.out.println(dll.length);
		
//		Delete from Begin
		dll.deleteAtBegin();
		dll.print();
//		System.out.println(dll.length);
		
//		Delete from End
		dll.deleteAtEnd();
		dll.print();
		dll.addAtEnd(40);
		dll.print();
		
//		find at index
		dll.findAtIndex(1);

		
		
//		update by index
		dll.updateByIndexDP(2,35);
		dll.print();
		
//		reverse(Original)
		dll.reverseOriginal();
		dll.print();
		
//		update by ele
		dll.updateByElement(30, 37);
		dll.print();
	}
}

public class ProgramDriver {
    	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		//! Adding elements into end of the doubly linked list
		dll.addAtEnd(10);
		dll.addAtEnd(20);
		dll.addAtEnd(30);
		dll.addAtEnd(40);
		dll.print();

		// ! Adding elements into the start of the doubly linked list
		dll.addAtBegin(5);
		dll.print();

		// ! Forward Traversal
		dll.print();
		// ! Reverse Traversal
		dll.printRev();

		// Adding elements at a specific position(index) in the doubly linked list
		dll.addAtIndex(3, 25);
		dll.print();


		// Deleting from start
		dll.deleteAtBegin();
		dll.print();

	}
}

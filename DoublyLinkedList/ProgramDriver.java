public class ProgramDriver {
    	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtEnd(10);
		dll.addAtEnd(20);
		dll.addAtEnd(30);
		dll.addAtEnd(40);
		System.out.println(dll.head.data);
		System.out.println(dll.head.next.data);
		System.out.println(dll.head.next.next.data);
		System.out.println(dll.head.next.next.next.data);
	}
}

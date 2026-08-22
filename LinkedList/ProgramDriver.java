package linkedList;

public class ProgramDriver {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
//		Printing list
		ll.print();
		
		
//		Adding at index
		ll.addAtIndex(2, 25);
		ll.print();
		ll.addAtIndex(0, 5);
		ll.print();
		ll.addAtIndex(-2, 2233);
		ll.print();
		
		
//		Adding at beginning
		ll.addAtBegin(3);
		ll.print();
		
//		Deleting from begin
		ll.deleteFromBegin();
		ll.print();
		
		
//		Printing element at index
		System.out.println(ll.elementAtIndex(3));
		
		
//		Delete from end
		ll.deleteFromEnd();
		ll.print();
	}
}


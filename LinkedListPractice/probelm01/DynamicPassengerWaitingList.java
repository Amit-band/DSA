package probelm01;

public class DynamicPassengerWaitingList {
	Node head;
	int length;
	public <T,P,S> void ADD(T PID,P name, S destination) {
		
		Node<T, P, S> nn = new Node<>(PID,name,destination);
		//checking if list is empty
		if(head==null) {
			head=nn;
			length++;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = nn;
		length++;
	}
	public void DISPLAY() {
		//checking if list is empty
		if(head==null) {
			System.out.println("No passenger to show.");
			System.out.println();
			return;
		}
		Node temp = head;
		System.out.println("Passenger are: ");
		while(temp!=null) {
			System.out.println("PID: "+temp.PID);
			System.out.println("Name: "+temp.name);
			System.out.println("Destination: "+temp.destination);
			System.out.println("------------------------------");
			temp = temp.next;
		}
		System.out.println();
	}
	public <T> void REMOVE(T PID) {
		//checking if list is empty}
		if(head == null) {
			System.out.println("List is empty.");
			System.out.println();
			return;
		}
		if(head.PID.equals(PID)) {
			head = head.next;
			return;
		}
		Node temp = head;
		while()
		
	}
	
	public <P> void SEARCH(P PID) {
		//checking if list is empty
		if(head==null) {
			System.out.println("No passenger to show.");
			System.out.println();
			return;
		}
		boolean found = true;
		Node temp = head;
		while(temp!=null) {
			if(temp.PID==PID) {
				System.out.println("PID: "+temp.PID);
				System.out.println("Name: "+temp.name);
				System.out.println("Destination: "+temp.destination);
				System.out.println();
				found = true;
				return;
			}else {
				found=false;
			}
			temp =temp.next;
		}
		if(found==false) {
			System.out.println("No Passenger found with given PID");
			System.out.println();
			return;
		}
	}
	public <P,Q,R,S> void UPDATE(P pid, Q PID, R Name, S Destination) {
		//checking if list is empty
		if(head==null) {
			System.out.println("No passenger to update.");
			return;
		}
		Node temp = head;
		while(!(temp.PID.equals(pid))) {
			temp = temp.next;
		}
		temp.PID = PID;
		temp.name = Name;
		temp.destination = Destination;
	}
	
	
	
}

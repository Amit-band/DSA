package problem02;

public class CustomerServieTicketSystem {
	Node front;
	Node rear;
	public void SUBMIT(String customer, String issue) {
		// if queue is null
		Node nn = new Node(customer, issue);
		if(front==null && rear==null) {
			front = rear = nn;
			return;
		}
		
		rear.next = nn;
		nn.prev= rear;
		rear = nn;
	}
	public void NEXT() {
		//checking queue is empty
		if(rear==null) {
			System.out.println("No tickets to available.");
			System.out.println();
			return;
		}
		// checking if the there is only 1 ticket
		if(front==rear) {
			System.out.println("Next Ticket:");
			System.out.println("Customer: "+front.customer);
			System.out.println("Issue: "+front.issue);
			System.out.println();
			return;
		}
		
		System.out.println("Next Ticket:");
		System.out.println("Customer: "+front.customer);
		System.out.println("Issue: "+front.issue);
		System.out.println();
	}
	public void RESOLVE() {
		if(front==null && rear==null) {
			System.out.println("No tickets available.");
			System.out.println();
			return;
		}
			System.out.println("Resolved:");
			System.out.println("Customer: "+front.customer);
			System.out.println("Issue: "+front.issue);
			System.out.println();
			DELETE();
	}
	
	
	private void DELETE() {
		if(front==rear) {
			front=null;
			rear = null;
			return;
		}
		front = front.next;
		front.prev.next = null;
		front.prev = null;
		
	}
	public void DISPLAY() {
		//if queue is empty
		if(front==null && rear==null) {
			System.out.println("No tickets available");
			System.out.println();
			return;
		}
		//display all the remaining tickets
		System.out.println("Next Tickets: ");
		Node temp = front;
		while(temp!=null) {
			System.out.println("Customer: "+temp.customer);
			System.out.println("Issue: "+temp.issue);
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	
	
}

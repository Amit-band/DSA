package problem01;

public class PrinterManagementSystem {

	Node front;
	Node rear;

	
//	adding Job
	public void ADD(String name, String document) {
		Node nn = new Node(name,document);

		//if queue is empty

		if(front==null && rear==null) {
			front = rear = nn;
			return;
		}

		front.prev = nn;
		nn.next= front;
		front = nn;
	}

	
//	Printing the most the oldest job
	public void PRINT() {
		
//		checking if the queue is empty
		if(front==null && rear==null) {
			System.out.println("No print jobs available");
			return;
		}

		System.out.println("Printing:");
		System.out.println("User: "+rear.name);
		System.out.println("Document: "+rear.document);
		System.out.println();
		
		//calling delete method the remove the job after it is completed
		DELETE();

	}

	
//	to delete the job after it is printed
	private void DELETE() {
//		checking if the queue is empty
		if(front==null && rear == null) {
			System.out.println("Nothing to delete");
			return;
		}

//		checking if there is only job inside the queue
		if(front==rear) {
			front = null;
			rear = null;
			return;
		}

		
		rear = rear.prev;
		rear.next.prev = null;
		rear.next = null;

	}
	
	
//printing the next job
	public void NEXT() {

		// checking if the queue is empty
		if(rear==null) {
			System.out.println("No jobs available.");
			return;	
		}

		// checking if there is only job inside the queue
		if(front==rear) {
			System.out.println("No next job is available.");
			return;
		}

		
		System.out.println("Next Job:");
		System.out.println("User: "+rear.prev.name);
		System.out.println("Document: "+rear.prev.document);
		System.out.println();
	}

	
	// display all the waiting jobs
	public void DISPLAY() {

		// checking if the queue is empty
		if(rear==null) {
			System.out.println("No jobs available.");
			return;
		}

		Node temp = rear;
		System.out.println("Waiting Jobs:");
		while(temp!=null) {
			System.out.println("User: "+temp.name);
			System.out.println("Document: "+temp.document);
			temp = temp.prev;
		}
		System.out.println();
	}

}
package problem03;

public class HospitalPatientWaitingSystem {
	
	Node front;
	Node rear;
	int length;
	public void ARRIVE(int id, String name, String reason) {
		Node nn = new Node(id, name, reason);
		
		//checking if Queue is empty
		if(front==null && rear==null) {
			front = rear = nn;
			length++;
			return;
		}
		
		rear.next = nn;
		nn.prev = rear;
		rear = nn;
		length++;
	}
	public void NEXT() {
		// check if queue is empty
		if(front==null  && rear == null) {
			System.out.println("No patients waiting.");
			System.out.println();
			return;
		}
		System.out.println("Next Patient: ");
		System.out.println("Patient No: "+front.PID);
		System.out.println("Patient Name: "+front.name);
		System.out.println("Reason: "+front.reason);
		System.out.println();
	}
	public void TREAT() {
		// check if queue is empty
		if(front==null  && rear == null) {
			System.out.println("No patients waiting.");
			System.out.println();
			return;
		}
			System.out.println("Treating: ");
			System.out.println("Patient No: "+front.PID);
			System.out.println("Patient Name: "+front.name);
			System.out.println("Reason: "+front.reason);
			System.out.println();
			DELETE();
	}
	private void DELETE() {
		//check if queue is empty
		if(front==null) {
			System.out.println("No patients waiting.");
			System.out.println();
			return;
		}
		
		//check if only patient is there
		if(front==rear) {
			front=rear=null;
			length--;
			return;
		}
		
		front = front.next;
		front.prev.next = null;
		front.prev = null;
		length--;
	}
	public void DISPLAY() {
		// check if queue is empty
		if(front==null  && rear == null) {
			System.out.println("No patients waiting.");
			System.out.println();
			return;
		}
		Node temp = front;
		System.out.println("Waiting Patients: ");
		while(temp!=null) {
			System.out.println("---------------------");
			System.out.println("Patient No: "+temp.PID);
			System.out.println("Patient Name: "+temp.name);
			System.out.println("Reason: "+temp.reason);
			temp = temp.next;
		}
		System.out.println();
	}
	public void WAITING() {
		System.out.println("Patients Waiting: "+length);
	}
	
	
}

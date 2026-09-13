package problem04;

public class AirportSecurityCheckpoint {
	Node front;
	Node rear;
	int length;
	int count;
	public AirportSecurityCheckpoint(int count) {
		this.count = count;
	}
	public void ARRIVE(int id, String name, String destination) {
		Node nn = new Node(id, name, destination);
		//checking if queue is empty
		if(front==null && rear == null) {
			front=rear=nn;
			length++;
			return;
		}
		Node temp = front;
		for(int i = 0;i<length;i++) {
			if(temp!=null && temp.ID==nn.ID) {
				System.out.println("Passenger ID must be unique.");
				System.out.println(nn.ID+" is already present.");
				return;
			}
			temp = temp.next;
		}
		 rear.next = nn;
		 nn.prev = rear;
		 rear = nn;
		 length++;
	}
	public void NEXT() {
		if(front==null) {
			System.out.println("No passengers waiting.");
			return;
		}
		System.out.println("Next Passenger: ");
		System.out.println("Passenger ID: "+front.ID);
		System.out.println("Passenger Name: "+front.name);
		System.out.println("Destination: "+front.destination);
		System.out.println();
	}
	public void DISPLAY() {
		if(front == null) {
			System.out.println("No passengers waiting.");
			return;	
		}
		Node temp = front;
		System.out.println();
		System.out.println("Waiting Passengers");
		while(temp!=null) {
			System.out.println("-----------------");
			System.out.println("Next Passenger: ");
			System.out.println("Passenger ID: "+temp.ID);
			System.out.println("Passenger Name: "+temp.name);
			System.out.println("Destination: "+temp.destination);
			temp = temp.next;
		}
		System.out.println();
	}
	public void COUNT() {
		System.out.println();
		System.out.println("Passengers Waiting: "+length);
		System.out.println();
	}
	public void PROCESS() {
		if(front==null && rear==null) {
			System.out.println("No passengers waiting.");
			return;
		}
		System.out.println("Processed : ");
		System.out.println("Passenger ID: "+front.ID);
		System.out.println("Passenger Name: "+front.name);
		System.out.println("Destination: "+front.destination);
		System.out.println("--------------------------------");
		DELETE();
	}
	private void DELETE() {
		//checking for 1 passenger
		if(front==rear) {
			front=rear=null;
			length--;
			return ;
		}
		//deleting from front
		front = front.next;
		front.prev.next = null;
		front.prev = null;
		length--;
	}
	public void CYCLE() {
		int cycle = 0;
		while(cycle!=count && front!=null) {
			PROCESS();
			cycle++;
		}
	}
	
	
	
}

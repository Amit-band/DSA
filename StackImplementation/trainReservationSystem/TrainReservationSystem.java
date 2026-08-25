package trainReservationSystem;

public class TrainReservationSystem {
	Node confirmedTickedHead;
	Node waitingQueueHead;
	Node waitingQueueTail;
	int size;
	int length;
	public TrainReservationSystem(int size) {
		this.size = size;
	}
	public void bookticket(int id, String name, int age) {
		Passenger newpass = new Passenger(id, name, age);
		Node nn = new Node(newpass);
		if(length<size) {
			if(confirmedTickedHead==null) {
				confirmedTickedHead = nn;
				length++;
				return;
			}
			nn.next = confirmedTickedHead;
			confirmedTickedHead = nn;
			length++;
			return;
		}
		else {
			if(waitingQueueHead==null && waitingQueueTail == null) {
				waitingQueueHead = waitingQueueTail = nn;
				return;
			}
			waitingQueueTail.next = nn;
			waitingQueueTail = nn;
		}
	}
	public void cancelticket(int id) {
		Node temp = confirmedTickedHead;
		if(confirmedTickedHead.data.getId()==id) {
			confirmedTickedHead = temp.next;
			temp.next = null;
			length--;
			if(waitingQueueHead!=null) {
				bookticket(waitingQueueHead.data.getId(),waitingQueueHead.data.getName(),waitingQueueHead.data.getAge());
				waitingQueueHead = waitingQueueHead.next;
			}else {
				System.out.println("No tickets left in waiting list");
			}
		}else{
			while(temp.next.data.getId()!=id) {
				temp = temp.next;
			}
			Node temp2 = temp.next.next;
			temp.next = temp2;
			temp2 = null;
			length--;
			if(waitingQueueHead!=null) {
				bookticket(waitingQueueHead.data.getId(),waitingQueueHead.data.getName(),waitingQueueHead.data.getAge());
				waitingQueueHead = waitingQueueHead.next;
			}else {
				System.out.println("No tickets left in waiting list");
			}
		}
		
	}	
}

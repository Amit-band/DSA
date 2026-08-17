public class ProgramDriver {
	public static void main(String[] args) {
		DoublyEndedQueue dq = new DoublyEndedQueue();
		dq.frontEnqeue(10);
		dq.frontEnqeue(20);
		System.out.println(dq.frontPeek());
		dq.rearEnqueue(30);
		dq.rearEnqueue(40);
		System.out.println(dq.rearPeek());
		dq.frontDequeue();
		System.out.println(dq.frontPeek());
		dq.rearDequeue();
		System.out.println(dq.rearPeek());
	}
}

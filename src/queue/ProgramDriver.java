package queue;

public class ProgramDriver {
	public static void main(String[] args) {
		Queue q = new Queue();
//		adding
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
	}
}

package stack;

public class ProgramDriver {
	public static void main(String[] args) {
		Stack s = new Stack();
		
//		Adding data into Stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
//		peek
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		
//		pop()
		System.out.println(s.pop());
	}
}

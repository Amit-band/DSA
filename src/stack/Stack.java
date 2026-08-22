package stack;

public class Stack {
	Node stack;
	int length = 0;
	
//	Push(add)
	public void push(int data) {
		Node nn = new Node(data);
		if(stack == null) {
			stack = nn;
			length++;
			return;
		}
		nn.next = stack;
		stack = nn;
		length++;
	}

//	Peek
	public int peek() {
		if(stack == null) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		return stack.data;
	}

	
//	pop(delete)
	public int pop() {
		if(stack == null) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		int data = stack.data;
		stack = stack.next;
		length--;
		return data;
	}
}

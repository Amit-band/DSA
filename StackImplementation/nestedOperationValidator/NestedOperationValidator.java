package nestedOperationValidator;

public class NestedOperationValidator {
	Node head;

	public void start(char data) {
		// TODO Auto-generated method stub
		Node nn = new Node(data);
		if(head==null) {
			head=nn;
			return;
		}
		nn.next = head;
		head = nn;
	}

	public boolean end(char arr) {
		Node temp = head;
		if(head == null) {
			return  false;
		}
		if(temp.data==arr) {
			head = temp.next;
			temp.next = null;
			return true;
		}else{
			return false;
			}
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

}

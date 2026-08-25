package nestedOperationValidator;

public class NestedOperationValidator {
	Node head;

	public void start(String data) {
		// TODO Auto-generated method stub
		Node nn = new Node(data);
		if(head==null) {
			head=nn;
			return;
		}
		nn.next = head;
		head = nn;
	}

	public String end(String data) {
		if(head == null) {
			return "valid";
		}
		Node temp = head;
		if(temp.data == data) {
			head = temp.next;
			temp.next = null;
			if(head==null) {
				return "valid";
			}else {
				return "invalid";
			}
		}else {
			return "invalid";
			}
	}

}

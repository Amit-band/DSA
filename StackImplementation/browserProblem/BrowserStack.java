package browserProblem;

public class BrowserStack {
	Node head;
	public void visit(String url) {
		Node nn = new Node(url);
		if(head==null) {
			head = nn;
			return;
		}
		nn.next = head;
		head = nn;
	}
	public String currentPage() {
		if(head==null) {
			return null;
		}
		return head.url;
	}
	
	public void back() {
		if(head==null) {
			return;
		}
		Node temp  = head;
		head = temp.next;
		temp.next = null;
	}
}

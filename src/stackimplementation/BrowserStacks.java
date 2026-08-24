package stackimplementation;

public class BrowserStacks {
	Node currentStackHead;
	Node historyStackHead;
	
	public void visit(String data) {
		Node nn = new Node(data);
		if(currentStackHead==null) {
			currentStackHead = nn;
			return;
		}
		nn.next = currentStackHead;
		currentStackHead = nn;
	}
	
	public String reload() {
		if(currentStackHead==null) {
			System.out.println("Nothing to show");
			return null;
		}
		return currentStackHead.data;
	}
	
	public void back() {
		if(currentStackHead==null) {
			System.out.println("Nothing to go back");
			return ;
		}
		Node temp = currentStackHead;
		currentStackHead = temp.next;
		temp.next = null;
		
		if(historyStackHead==null) {
			historyStackHead = temp;
		}
		temp.next = historyStackHead;
		historyStackHead = temp;
	}
	
	public void forward() {
		if(historyStackHead==null) {
			System.out.println("Nothing to go forward");
			return;
		}
		Node temp = historyStackHead;
		historyStackHead = temp.next;
		temp.next = null;
		
		if(currentStackHead==null) {
			currentStackHead = temp;
		}
		temp.next = currentStackHead;
		currentStackHead = temp;
	}
}

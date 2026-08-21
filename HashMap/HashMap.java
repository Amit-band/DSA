public class HashMap {
	Node[] buckets;
	
	HashMap(int size){
		this.buckets = new Node[size];
	}

	public void put(int key, String value) {
		Node nn = new Node(key, value);
		int index = getIndex(key);
		Node head = buckets[index];
		if(head == null) {
			buckets[index]=nn;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			if(temp.key == key) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		if(temp.key==key) {
			temp.value = value;
			return;
		}
		temp.next = nn;
		
	}

	private int getIndex(int key) {
		// TODO Auto-generated method stub
		return key%buckets.length;
	}

	public String get(int key){
		int index = getIndex(key);
		Node temp = buckets[index];
		while(temp!=null){
			if(temp.key == key){
				return temp.value;
			}
			temp = temp.next;
		}
		return "No Such Key";
	}
}

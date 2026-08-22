package hashmap;


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

	public String get(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		while(temp!=null) {
			if(temp.key==key) {
				return temp.value;
			}
			temp = temp.next;
		}
		return "No such key";
	}
	
	public String remove(int key) {
		int index = getIndex(key);
		Node head = buckets[index];
		if(head==null) {
			System.out.println("No such Key");
			return null;
		}
		if(head.key == key) {
			String value = head.value;
			buckets[index] = head.next;
			return value;
		}
		Node temp = head;
		while(temp.next!=null) {			
			if(temp.next.key == key) {
				String  value = temp.next.value;
				Node temp2 = temp.next.next;
				temp.next.next = null;
				temp.next = temp2;
				return value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(int key) {
		// TODO Auto-generated method stub
		int index = getIndex(key);
		Node head = buckets[index];
		if(head == null) {
			return false;
		}
		while(head!=null) {
			if(head.key == key) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
	
	
	public boolean containsValue(String value) {
		for(int i =0;i<buckets.length;i++) {
			Node head = buckets[i];
			Node temp = head;
			while(temp!=null) {
				if(temp.value == value) return true;
				temp = temp.next;
			}
		}
		return false;
	}
}

package hashmapGenerics;

public class HashMap<T,P> {
	Node<T,P>[] buckets;
	
	public HashMap(int size) {
		this.buckets = new Node[size];
	}

	public void put(T key, P value) {
		Node<T,P> nn = new Node<T, P>(key, value);
		int index = getIndex(key);
		Node<T,P> head = buckets[index];
		if(head==null) {
			buckets[index]=nn;
			return;
		}
		Node<T,P> temp = head;
		while(temp.next!=null) {
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		if(temp.key.equals(key)) {
			 temp.value = value;
			 return;
		}
		temp.next = nn;
		
	}

	private int getIndex(T key) {
		return Math.floorMod(key.hashCode(),buckets.length);
	}

	public P get(T key) {
		int index = getIndex(key);
		Node<T,P> head = buckets[index];
		Node<T,P> temp = head;
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return (P) "No such Key";
	}

	public boolean containsKey(T key) {
		int index = getIndex(key);
		Node<T,P> head = buckets[index];
		Node<T,P> temp = head;
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean containsValue(P value) {
		for(int i =0;i<buckets.length;i++) {
			Node<T,P> head = buckets[i];
			Node<T,P> temp = head;
			while(temp!=null) {
				if(temp.value.equals(value)) return true;
				temp = temp.next;
			}
		}
		return false;
	}

	public P remove(T key) {
		int index = getIndex(key);
		Node<T,P> head = buckets[index];
		if(head==null) {
			System.out.println("No such Key");
			return null;
		}
		if(head.key.equals(key)) {
			P value = head.value;
			buckets[index] = head.next;
			return value;
		}
		Node<T,P> temp = head;
		while(temp.next!=null) {			
			if(temp.next.key.equals(key)) {
				P value = (P) temp.next.value;
				Node temp2 = temp.next.next;
				temp.next.next = null;
				temp.next = temp2;
				return value;
			}
			temp = temp.next;
		}
		return null;
	}

	public void clear() {
		for(int i = 0;i<buckets.length;i++) { 
			Node<T,P> head = buckets[i];
			if(head==null) {
				continue;
			}
			Node<T,P> temp = head;
			while(temp.next!=null) {
				buckets[i] = temp.next;
				temp.next = null;
				temp = buckets[i]; 
			}
			if(temp.next==null) {
				buckets[i] = null;
			}
		} 
	}
	
	
	
}

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
	
}

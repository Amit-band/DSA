package hashmapGenerics;

public class Node<T,P> {
	T key;
	P value;
	Node next;
	
	public Node(T key, P value) {
		this.key = key;
		this.value = value;
	}
}

package hashmap;

public class ProgramDriver {
	public static void main(String[] args) {
		HashMap hm = new HashMap(5);
		hm.put(101,"Allen");
		hm.put(106, "Amit");
		hm.put(111,"Kevin");
		hm.put(103, "Eleven");
		hm.put(106, "Massom");
		hm.put(111, "Virat");
		System.out.println(hm.get(106));
		
		
//		System.out.println(hm.buckets[3].key);
//		System.out.println(hm.buckets[3].value);
//		
//		System.out.println(hm.buckets[1].key);
//		System.out.println(hm.buckets[1].value);
//		
//		System.out.println(hm.buckets[1].next.key);
//		System.out.println(hm.buckets[1].next.value);
//		
//		System.out.println(hm.buckets[1].next.next.key);
//		System.out.println(hm.buckets[1].next.next.value);
		

	}
}

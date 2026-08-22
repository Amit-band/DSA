package hashmapGenerics;

public class ProgramDriver {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>(5);
		hm.put(101,"Allen");
		hm.put(106, "Raju");
//		hm.put(111,"Kevin");
		hm.put(103, "Eleven");
//		hm.put(106, "Massom");
		hm.put(111, "Virat");
		hm.put(101, "Amit");
		hm.put(116, "Dia");
//		System.out.println(hm.containsKey(116));
//		System.out.println(hm.containsValue("Amit"));
//		System.out.println(hm.containsValue("Gia"));
		
//		System.out.println(hm.remove(106));
		
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
		
//		System.out.println(hm.get(101));
//		System.out.println(hm.get(111));
		
		
		System.out.println(hm.buckets[1].next.next.key);
		System.out.println(hm.buckets[1].next.next.value);
		

		System.out.println(hm.remove(106));
		System.out.println(hm.get(106));
		System.out.println(hm.containsKey(111));
		
		
		
		hm.clear();
		System.out.println(hm.buckets[1]);
		System.out.println(hm.buckets[1]);
		
	}
}

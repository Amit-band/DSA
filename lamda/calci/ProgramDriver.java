package calci;

public class ProgramDriver {
	public static void main(String[] args) {
		Calci c1 = new Calci() {
			public void sub(int a, int b) {
				System.out.println(a-b);
			}
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		System.out.println(c1);
		c1.add(100, 200);
		c1.sub(100, 220);
		
		Calci c2 = new Calci() {
			public void sub(int a, int b) {
				System.out.println("SUB: "+(a-b));
			}
			public void add(int a, int b) {
				System.out.println("ADD: "+(a+b));
			}
		};
		System.out.println(c2);
		c2.add(100, 200);
		c2.sub(100, 220);
	}
}

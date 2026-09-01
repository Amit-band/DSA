 package lambda;

public class ProgramDriver {
	public static void main(String[] args) {
		//lambda expression : used only for functional interface
		Calclulator c1 = (int a, int b)-> System.out.println(a+b);
		c1.calclulate(10, 20);
		
		Calclulator c2 = (int a, int b)->{
			int c = a-b;
			System.out.println(c);
		};
		c2.calclulate(10, 20);
		
		
		Demo d1 = (int a)->{
			System.out.println("amit");
		};
		d1.view(10);
	}
}

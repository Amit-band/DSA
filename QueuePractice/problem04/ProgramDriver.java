package problem04;

import java.util.Scanner;

public class ProgramDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cycle Count: ");
		int count = sc.nextInt();
		AirportSecurityCheckpoint asc = new AirportSecurityCheckpoint(count);
//		asc.ARRIVE(101,"Amit","Dubai");
//		asc.ARRIVE(102, "Rahul", "Delhi");
//		asc.ARRIVE(103, "Priya", "Mimbai");
//		asc.NEXT();
//		asc.CYCLE();
//		asc.COUNT();
//		asc.ARRIVE(104, "Ravi", "Goa");
//		asc.ARRIVE(105, "Deepti", "UK");
//		asc.DISPLAY();
//		asc.CYCLE();
//		asc.COUNT();
//		asc.PROCESS();
//		asc.NEXT();
//		asc.ARRIVE(106, "Arjun", "Goa");
//		asc.DISPLAY();
//		asc.CYCLE();
//		asc.COUNT();
		
		asc.ARRIVE(101, "Amit", "Dubai");
		asc.ARRIVE(102, "Rahul", "Delhi");
		asc.ARRIVE(103, "Priya", "Mimbai");
		asc.ARRIVE(104, "Ravi", "Goa");
		asc.DISPLAY();
		asc.COUNT();
		asc.PROCESS();
		asc.NEXT();
		asc.NEXT();asc.PROCESS();
		asc.ARRIVE(104, "Jacob", "New york");
	}
}

package project;

import java.util.Scanner;

public class ProgramDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details");
		int id = Integer.parseInt(sc.nextLine().trim());
		String name = sc.nextLine().trim();
		double salary = Double.parseDouble(sc.nextLine().trim());
		int exprience = Integer.parseInt(sc.nextLine().trim());
		Employee e = new Employee(id,name,salary,exprience);
		SalaryCalculator s1 = (Employee e1)->{
			if(e.exprience<2) {
				e.bonus = 0.0;
				return e.bonus;
			}else if(e.exprience>2 && e.exprience<=5) {
				e.bonus = e.basicSalary*0.1;
				return e.bonus;
			}
			else if(e.exprience>5) {
				e.bonus = e.basicSalary*0.2;
				return e.bonus;
			}
			return 0;
		};
		System.out.println("Before Bonus");
		e.printEmployeeDetails(e);
		s1.calculateSalary(e);
		System.out.println("After Bonus");
		e.printEmployeeDetails(e);
		
		
	}
}

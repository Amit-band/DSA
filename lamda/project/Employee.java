package project;

public class Employee {
	int id;
	String name;
	double basicSalary;
	int exprience;
	double bonus;
	public Employee(int id, String name, double basicSalary, int exprience) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.exprience = exprience;
		this.bonus = 0;
	}
	
	public void printEmployeeDetails(Employee e) {
		System.out.println("Employee Id: "+e.id);
		System.out.println("Employee Name: "+e.name);
		System.out.println("Exprience: "+e.exprience);
		System.out.println("Basic Salary: "+e.basicSalary);
		System.out.println("Bonus: "+e.bonus);
		System.out.println("Final Salary: "+(e.basicSalary+e.bonus));
		System.out.println("----------------------------------------");
	}
	
}

package problem01;

public class ProgramDriver {
	public static void main(String[] args) {
		PrinterManagementSystem pms = new PrinterManagementSystem();
		
//		Adding 3 jobs
		pms.ADD("Alice", "report.pdf");
		pms.ADD("Bob", "notes.pdf");
		pms.ADD("John", "assignment.pdf");
		
//		Checking if the next job is available
		pms.NEXT();
		
//		printing 2 jobs
		pms.PRINT();
		pms.PRINT();
		
//		displaying waiting jobs
		pms.DISPLAY();
		
//		add a new job
		pms.ADD("Sara", "presentation.pdf");
		
//		checking if sara added the waiting list
		pms.DISPLAY();
		
//		printing all the remaining jobs
		pms.PRINT();
		pms.PRINT();
		pms.PRINT();
		
	}
}

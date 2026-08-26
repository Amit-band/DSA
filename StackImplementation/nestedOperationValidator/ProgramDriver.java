package nestedOperationValidator;

import java.util.Scanner;

public class ProgramDriver {
	static NestedOperationValidator nov = new NestedOperationValidator();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of operations: ");
		int n = Integer.parseInt(sc.next().trim());
		boolean valid = true;
		for(int i = 0 ;i<n;i++) {
			System.out.println("Enter the Operation(START/END):");
			String operation = sc.next();
			char data = sc.next().charAt(0);
			if(operation.equalsIgnoreCase("START")) {
				nov.start(data);
			}else if(operation.equalsIgnoreCase("END")) {
				if(!nov.end(data)) {
					valid = false;
					 break;  
				}
			}
			else {
				System.out.println("Invalid operation");
			}
		}
		if(valid && nov.isEmpty()) {
			System.out.println("Valid");
		}else {
			System.out.println("Inavlid");
		}
	}
}

package problem02;

public class ProgramDriver {
	public static void main(String[] args) {
		
		CustomerServieTicketSystem csts = new CustomerServieTicketSystem();

		
		csts.SUBMIT("Amit","Internet not working");
		csts.SUBMIT("Alice", "Cannot login");
		csts.SUBMIT("John", "Network error");
		csts.SUBMIT("Bob","No login options");
		
		csts.NEXT();
		csts.RESOLVE();
		csts.NEXT();
		csts.RESOLVE();
		csts.DISPLAY();
		csts.SUBMIT("Jenny", "No logs");
		csts.DISPLAY();
		csts.RESOLVE();
		csts.RESOLVE();
		csts.RESOLVE();
		csts.RESOLVE();
		csts.NEXT();
	}
}

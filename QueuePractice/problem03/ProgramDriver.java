package problem03;

public class ProgramDriver {
	public static void main(String[] args) {
		HospitalPatientWaitingSystem hs = new HospitalPatientWaitingSystem();
		
		hs.ARRIVE(101,"Amit","fever");
		hs.ARRIVE(102, "Alice", "vomiting");
		hs.ARRIVE(103, "john", "back-pain");
		hs.NEXT();
		hs.TREAT();
		hs.DISPLAY();
		hs.WAITING();
		hs.TREAT();
		hs.DISPLAY();
		hs.WAITING();
		hs.NEXT();
		hs.TREAT();
		hs.DISPLAY();
		hs.WAITING();
	}
}

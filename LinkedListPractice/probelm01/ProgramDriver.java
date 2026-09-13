package probelm01;

public class ProgramDriver {
	public static void main(String[] args) {
		DynamicPassengerWaitingList dpwl = new DynamicPassengerWaitingList();
		dpwl.ADD(101,"Amit","Hyd");
		dpwl.ADD(102, "Arjun", "Mumbai");
		dpwl.ADD(103, "Naresh", "Banglore");
		dpwl.DISPLAY();
		dpwl.REMOVE(0);
		dpwl.DISPLAY();
		dpwl.SEARCH(103);
		dpwl.UPDATE(103,104,"Sumit","Delhi");
		dpwl.DISPLAY();
	}
}

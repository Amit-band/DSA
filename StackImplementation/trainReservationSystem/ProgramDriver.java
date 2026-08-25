package trainReservationSystem;

public class ProgramDriver {
	public static void main(String[] args) {
		TrainReservationSystem trs = new TrainReservationSystem(5);
		trs.bookticket(101,"Amit",21);
		trs.bookticket(102,"Sumit",22);
		trs.bookticket(103,"Raghu",23);
		trs.bookticket(104,"hgg",29);
		trs.bookticket(105,"ppooo",31);
		trs.bookticket(106,"Amit",44);
		trs.bookticket(107,"Amit",44);
		System.out.println(trs.confirmedTickedHead.data.getId());
		System.out.println(trs.waitingQueueHead.data.getId());
		System.out.println(trs.waitingQueueTail.data.getId());
		trs.cancelticket(101);
		System.out.println(trs.confirmedTickedHead.data.getId());
		trs.cancelticket(102);
		System.out.println(trs.confirmedTickedHead.data.getId());
		trs.cancelticket(105);
	}
}

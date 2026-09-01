package project2;

import java.util.Scanner;

public class ProgramDriver {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		OrderStatus placeOrder = new OrderStatus() {
			public void updateStatus(String orderId) {
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Order has been placed successfully.");
			}
		};
		
		OrderStatus prepareOrder = new OrderStatus() {
			public void updateStatus(String orderId) {
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Food is being Prepared.");
			}
		};
		
		OrderStatus delivery = new OrderStatus() {
			public void updateStatus(String orderId) {
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Delivery is on the way.");
			}
		};
		
		processOrder(placeOrder,"ZMT");
		processOrder(prepareOrder, "ZMT");
		processOrder(delivery, "ZMT");
	}
	
	public static void processOrder(OrderStatus status, String orderId) {
		status.updateStatus(orderId);
	} 
}

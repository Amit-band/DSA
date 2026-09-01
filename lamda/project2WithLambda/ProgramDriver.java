package project2WithLambda;

	import java.util.Scanner;

	public class ProgramDriver {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Order Id");
			String orderId = sc.next();
			OrderStatus placeOrder = (OrderId)->{
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Order has been placed successfully.");
			};
			OrderStatus prepareOrder = (OrderId)->{
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Food is being prepared.");
			};
			
			OrderStatus delivery = (OrderId)->{
				System.out.println("Order Id: "+ orderId);
				System.out.println("Status: Order Out for Delivery.");
			};
			
			
			processOrder(placeOrder,orderId);
			processOrder(prepareOrder, orderId);
			processOrder(delivery, orderId);
		}
		
		public static void processOrder(OrderStatus status, String orderId) {
			status.updateStatus(orderId);
		} 
	}


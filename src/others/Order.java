package others;

import java.util.ArrayList;

public class Order {

	ArrayList<Pizza> orders = new ArrayList<Pizza>();
	static int numberOfOrders;
	
	void take(Pizza pizza) {
		orders.add(pizza);
		System.out.println(pizza.getBread() + " pizza order accepted");
		numberOfOrders++;
	}
	
	void cook() {
		for(Pizza pi : orders) {
			System.out.println(pi.getBread() + " is cooking");
		}
	}
	
	void delivery() {
		for(Pizza pi : orders) {
			System.out.println(pi.getBread() + " is ready. Have a great time");
		}
		orders.clear();
		numberOfOrders = 0;
	}
	
	static void displayOrders() {
		System.out.println("You have " + numberOfOrders + " orders");
	}
	
	

}

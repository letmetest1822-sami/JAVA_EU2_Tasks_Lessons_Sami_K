package day7_controlFlowStatements;

public class Task28_CalculateRevenue {

	public static void main(String[] args) {
		/* Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
		 * revenue = price × quantity.Write a program that asks the user 
		 * to enter product price and quantity and then calculate the revenue.
		 * If the revenue is more than 5000 a discount is 10% offered.
		 * Program should display the discount and net revenue.*/

		double discount=0, revenue = 0, price = 10;
	
		int quantity = 1000;
		
		revenue = price * quantity;
		
		if (revenue > 5_000) {
			
			discount = revenue * 0.1;
			revenue = revenue * 0.9;
			
			System.out.println("The discount is : " + discount);
			
		}
		System.out.println("The revenue is  : " + revenue );
	}

}

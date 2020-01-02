package day4_arithmeticoperators;

public class discount {

	public static void main(String[] args) {
		// This program calculates the sale price of an item,
		// that is regularly priced at $59, with a %20 discount on it
		
		int regularPrice = 59;
		double discount;
		double salesPrice;
		
		discount = regularPrice*0.2;
		salesPrice = regularPrice-discount;
		
		System.out.println("resular Price : $" + regularPrice);
		System.out.println("Discout Amount : $" + discount);
		System.out.println("Sales Price : $" + salesPrice);

	}

}

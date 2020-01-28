package day17_ClassObjects_Part2;

public class p01_BMW {
	
	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price = 4025;
			break;
		case "740i":
			price = 85000;
			break;
		case "m3":
			price=65000;
			break;
			default:
				System.out.println(model + " is not available");
				price = 0.0;
		}
		System.out.println("Price : " + price);
	}

}

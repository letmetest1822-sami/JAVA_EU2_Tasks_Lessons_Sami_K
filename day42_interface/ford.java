package lessons.day42_interface;

public class ford extends ElectricCar {


	private int year;

	public ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	@Override
	public void start() {
		System.out.println("Ford - Push start button to start...");
		
	}

	@Override
	public void charge() {
		System.out.println("Ford - plug in to outlet...");
		
	}

	@Override
	public void drive() {
		System.out.println("Ford - is driving...");
		
	}

	public int getYear() {
		return year;
	}
	
	
}

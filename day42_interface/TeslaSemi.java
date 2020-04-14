package lessons.day42_interface;

public class TeslaSemi extends ElectricTruck {
	
	private double engineSize;
	
	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;
	}

	
		@Override
		public void load(String item) {
			System.out.println("TeslaSemi - load " + item + " by lowering the truck and opening door...");
		
		}

		@Override
		public void start() {
			System.out.println("TeslaSemi - start truck by pressing a button ");
		}

		@Override
		public void charge() {
			System.out.println("TeslaSemi - plug in charge for 30 mins ");
		}

		@Override
		public void drive() {
			System.out.println("TeslaSemi - driving with load ");
		
		}

		public double getEngineSize() {
			return engineSize;
		}

		public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
		}

	

}

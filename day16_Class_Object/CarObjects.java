package day16_Class_Object;

public class CarObjects {

	public static void main(String[] args) {


		
		
		Car car1 = new Car ();
	
		
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(40);
		car1.showCurrentSpeed(70);
		
		car1.drvie();
		
		System.out.println("Before : " + car1.currentSpeed);
		
		car1.accelerate(10);
		
		System.out.println("After : " + car1.currentSpeed);
		
	}

}

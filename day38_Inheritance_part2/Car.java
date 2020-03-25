package lessons.day38_Inheritance_part2;

public class Car extends Vehicle {
	
	int maxSpeed = 180;
	
	public void display() {
		System.out.println(" Maximum Speed is  : " + super.maxSpeed);
		System.out.println(" Maximum Speed is  : " + maxSpeed);
	}

}

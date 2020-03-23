package lessons.day33_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car c1 = new Car ();

		Car c2 = new Car ();
		
		System.out.println(c1.make);
		System.out.println(c2.make);
		
		Car c3 = new Car ("Volkswagen", "Jetta", 2013, 110000, "Grey");
		System.out.println(c3.model);
		System.out.println(c3.make);
		System.out.println(c3.year);
		System.out.println(c3.mile);
		System.out.println(c3.color);
		
		
		
	}

}

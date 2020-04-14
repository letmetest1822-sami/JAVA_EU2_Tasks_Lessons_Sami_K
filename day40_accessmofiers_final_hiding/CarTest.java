package lessons.day40_accessmofiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {


		Car c = new Car();
		
		c.model = "M3";
		c.year  = 2017;
		//c.door  = 4; // private
		c.engine = 5.3;
		
		System.out.println(c.toString);
	}

}

package lessons.day38_Inheritance_part2;

public class DogTest {

	public static void main(String[] args) {


		Dog dog = new Dog ("Co", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		
		//dog.eat();
		
		dog.move(10);
		
		//dog.chew();
		
		//dog.name = "dertli";
		
		System.out.println(dog.getName());
	}

}

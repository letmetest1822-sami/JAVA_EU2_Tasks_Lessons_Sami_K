package day16_Class_Object;

public class DogObjects {

	public static void main(String[] args) {


		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();
		
		dog1.age = 10;
		dog1.color="Red";
		dog1.breed = "3";
		dog1.name = "Joe";
		
		dog1.hungry();
		dog1.barking();
		dog1.sleeping();

		
		

	}

}

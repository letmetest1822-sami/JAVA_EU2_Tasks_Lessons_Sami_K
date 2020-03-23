package lessons.day34_constructors_passingObjectMethods;

public class test1 {
	public static void main(String[]args) {
		class SayHelloOnCreation {
	     public SayHelloOnCreation() {
	         System.out.println("Hello, Thanks For Creating me!");
	     }
	}

	class Test {
	     
	         SayHelloOnCreation thing = new SayHelloOnCreation(); //This line here, produces an output - Hello, Thanks For Creating me!
	     }
	}
}

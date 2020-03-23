package lessons.day34_constructors_passingObjectMethods;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		a1.color = "White";
		
		changeApple(a1);
		
		methodObject().color = "Brown";
		
		
	}

	public static void changeApple(Apple b1) {
		//Apple b1 = new Apple();
		b1.color = "Yellow";
		b1.mA();
	}
	
	public static Apple  methodObject() {
		Apple a1 = new Apple();
		return a1;
	}
	
	
}

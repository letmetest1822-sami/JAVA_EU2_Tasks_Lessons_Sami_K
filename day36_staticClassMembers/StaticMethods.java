package lessons.day36_staticClassMembers;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		show2();   // you can not call instance method or variable from static method
		show4();	// you can  call static method or variable from static method
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public  void show2() {
		show1();	// you can  call static method or variable from instance method
		show2(); 
		System.out.println(name);
		System.out.println(age);
	}
	
	public  void show3() {
	
	}
	
	public static void show4() {
	
	}

	
	

}

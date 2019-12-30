package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128;

		System.out.println("b1 =" + b1);
		System.out.println("b2 = "+ b2 + "\n");
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("\t s1 = "+ s1);
		System.out.println("\t s2 =" + s2);
		System.out.println("\t s3 ="+ s3 + "\n");
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 ="+ i2);
		System.out.println("i3 = "+ i3);
		System.out.println("i4 = "+ i4 + "\n");
		
		
		long l1 = 5000; //sufffix L is optional. Literal 5000 is in limits of int  type
		long l2 =-2147483649L; //sufffix L is mandatory. this big number is out of int  range
		
		long creditCardNumber = 5874_8965_5874_5698L;
		
		System.out.println("\t l1 ="+ l1);
		System.out.println("\t l2 = " + l2  + "\n");
		System.out.println("\t creditCardNumber = "+ creditCardNumber  + "\n");
		
		
		//Floating numbers : default double
		float f1 = 2.1f;
		//float f2 = 
		
		double d1 = 3.14;
		
		System.out.println("f1 =" + f1);
		System.out.println("d1 =" + d1  + "\n");
		
		char c1 = 'A';
		char c2 = 65; // unicode
		char c3 = '\u0041';
		char c4 = 8658;
		
		
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(c4 + "\n");
		
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam :" + status);
		System.out.println("He is 16, can he drive? : " + status2 + "\n");
		
		String name = "Sami";
		System.out.println("My name is : "+ name + "\n");
		
		String age = "12";
		
		char al1 = '\u22A8';
		
		System.out.println(al1 + "\n");
		
		
		
	}

}

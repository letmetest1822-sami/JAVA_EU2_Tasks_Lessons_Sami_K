package assignments.day_5_unary_assignment_relational_Operators;

public class mixedInteger {

	public static void main(String[] args) {
		int i1 =5;
		int ii2 =10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 = i1+ f1;
		double res3 = i2 + d1;
		short firstNumber = 10;
		short secondNumber = 20;
		short thirdNumber = (short) (firstNumber + secondNumber);
		int thirdNumber2 =  firstNumber + secondNumber;
		
		//byte b1 = 20;
		//byte b2 = 2;
		//int b3 = b1*b2;
		//byte b3_2 = (byte) (b1*b2);
		
		int b1 = 20;
		int b2 = 30;
		byte res = (byte) (b1+b2); // casting required because of variables
		
		byte res4= 126 + 1; // no casting required because there is no variables
		
		
		
	}

}

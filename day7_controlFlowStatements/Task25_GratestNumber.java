package day7_controlFlowStatements;

public class Task25_GratestNumber {

	public static void main(String[] args) {
		/* Input:
	Enter first number: 4
	Enter second number: 8
	Enter third number: 1
		• Output:
	The greatest number is: 8*/
		
		int a = 40;
		int b = 18;
		int c = 10;
		
		if ( (a>b) && (a>c) ) {
			System.out.println("The gratest number is a :  " + a);
		}

		if ( (b>a) && (b>c) ){
			System.out.println("The gratest number is  b :  " + b);
	}

		if ( (c>a) && (c>b)) {
			System.out.println("The gratest number is  c :  " + c);
}
	}
}

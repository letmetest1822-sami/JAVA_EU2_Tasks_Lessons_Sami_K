package day15_MethodOverloading;

public class fibonacci {

	public static void main(String[] args) {


		int elements = 8;
		int sumOfsubsequent=0, a1=0, a2=1;
		System.out.println("Fibonacci series of " + elements + " numbers.");
		
		for (int i=1; i<=elements;i++) {
			if (i==1) {
				System.out.print(a2);
			}else{System.out.print(", " + a2);
			
			sumOfsubsequent=a1+a2;
			a1=a2;
			a2=sumOfsubsequent;}
			
		}

	}

}

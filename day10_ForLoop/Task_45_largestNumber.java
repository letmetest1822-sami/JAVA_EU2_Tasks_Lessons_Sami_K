package day10_ForLoop;

public class Task_45_largestNumber {

	public static void main(String[] args) {
		/* User should be able to declare 2 values and 
		 * program should display which number is largest.
		 * if numbers are equal, it should display numbers are equal
		 * Above steps need to repeated to number of times that is also declared by user.*/

		int a=30, b = 30, repeat = 5;
		
		for (int i = 1; i<repeat; i++) {
			if (a>b) {
				System.out.println(" a is greater than b");
				
			}else if (b>a) {
				System.out.println("b is greater than a");
			
			}else if (a==b)    {
				System.out.println("a is equal to b");
			}
		}
		
	}

}

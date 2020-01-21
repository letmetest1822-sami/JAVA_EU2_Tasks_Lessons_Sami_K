package day14_MethodsContinue;

public class Task69_primeNumber {

	public static void main(String[] args) {
		/* 
		 A prime number is a number that is evenly divisible only by itself and 1. 
		 For example,
			the number 5 is prime number because it can be evenly divided only by 1 and 5. 
		The number 6, however, is not prime number because it can be divided evenly by 1,2,3,and 6.

	Write a method named isPrime which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise.
	
	• Note: 
	0 and 1 are not prime numbers. 
	The 2 is the only even prime number because all the other even numbers can be divided by 2.
		 */

		isPrime(11);
		
		}
				public static void isPrime(int numberToCheck) {
					
				int primeCheck=1;
				
				for (int i=2;  i<numberToCheck;  i++) {
					
					if((numberToCheck%i==0) ) {
						System.out.println("false");
						primeCheck=0;
						break;
					}
				}if (primeCheck==1) {
					
						System.out.println("true");

		}
	}
}

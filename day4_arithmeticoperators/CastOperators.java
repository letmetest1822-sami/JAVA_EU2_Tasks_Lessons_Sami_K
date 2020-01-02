package day4_arithmeticoperators;

public class CastOperators {

	public static void main(String[] args) {
		// 1. Implicit Casting
		// 2. Explicit Casting
		
		int x = 'A';
		System.out.println( " The value of x is : " + x + " \n" );
		
		double d=20;
		System.out.println( " The value of d is : " + d + " \n" );
		
		/* Conclusion:
		 * 1. Done by compiler
		 * 2.Smaller data type to bigger data type
		 * 3. Widening
		 * 4. No loss of data
		 * byte -> short -> int -> long -> float -> double
		 */
		
		int x1 = 130; // int( 32 bit ) 00000000 00000000 00000000 100000010
		//byte b = x;
		
		byte b = (byte)x1; // byte (8 bit) 100000010
		
		/* Conclusion:
		 * 1. Done by programmer
		 * 2. Bigger data type to smaller data type
		 * 3. Narrowing
		 * 4. Loss of data
 			byte <- short <- int <- long <- float <- double*/
		
		System.out.println (" The value of b is : " + b + " \n" );
		
	}

}

package day8_contFlowStat_Part2;

public class Task32_largestNumber {

	public static void main(String[] args) {
		/*• Declare 3 numbers
		 * • Program should display which one is largest  */

		int a =13, b =14, c= 15;
		if ((a>b) && (a>c)) {
			System.out.println("a : " + a + " is bigger than " + b + " and " + c );
		}else if ((b>a) && (b>c)) {
			
			System.out.println("b : " + b + " is bigger than " + a + " and " + c );
		}else {
			
			System.out.println("c : " + c + " is bigger than " + a + " and " + b );
		}
	}

}

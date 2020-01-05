package day7_controlFlowStatements;

public class SmallTaks_PayRate {

	public static void main(String[] args) {
		/*Write an if statement that multiplies payrate by 1.5
		 * if hours is greater than 40 */

		int hours=50;
		double payRate=1;
		
		if (hours>=40) {
			payRate *= 1.5;
			System.out.println(payRate);
		}
		
	}

}

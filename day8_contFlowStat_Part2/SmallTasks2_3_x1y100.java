package day8_contFlowStat_Part2;

public class SmallTasks2_3_x1y100 {

	public static void main(String[] args) {
		/* Write an if-else statement that 
		 * assigns 1 to x when y is equal to 100.
		 * Otherwise, it should assign 0 to x. */
		
		int x = 0, y = 1000;
		
		if (y == 100) {
			x = 1;
			
			System.out.println("x : " + x + " because y  = 100 ");
		}
		
		if ( y!=100 ) {
			System.out.println("x : " + x + " because y is different from 100");
		}
		

	}

}

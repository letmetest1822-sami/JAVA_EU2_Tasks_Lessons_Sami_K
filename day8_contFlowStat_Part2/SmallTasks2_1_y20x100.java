package day8_contFlowStat_Part2;

public class SmallTasks2_1_y20x100 {

	public static void main(String[] args) {
		/* Write an if-else statement that 
		 * Assigns 20 to variable y if the variable x is greater than 100. 
		 * Otherwise, it should assign 0 to the variable y */
		
		int x=80, y=0;
		
		if (x > 100) {
			y =20;
			System.out.println("y : " + y + " because x : " + x + " is greater than 100");
			
		}else {
			y = 0;
			System.out.println("y : " + y + " because x : " + x + " is  not greater than 100");
		}
		
		
	}

}

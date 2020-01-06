package day8_contFlowStat_Part2;

public class SmallTasks2_2_b0c1 {

	public static void main(String[] args) {
		/* Write an if-else statement that 
		 * assigns 0 to the variable b and assigns 1 to the variable c if the variable a is less than 10. 
		 * Otherwise, it should assign –99 to the variable b and assign 0 to the variable c */
		
		int a= 30, b = 0, c = 0;
		
		if (a<10) { 
			b = 0;
			c = 1;
		System.out.println("b : " + b + " and c : " + c + " Because a is less than 10.");
		}else {
			b = -99;
			c = 0;
		System.out.println("b : " + b + " and c : " + c + " Because a is not less than 10.");
		}
	}

}

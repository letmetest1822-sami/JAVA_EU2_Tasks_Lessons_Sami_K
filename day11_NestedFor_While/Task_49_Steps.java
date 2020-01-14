package day11_NestedFor_While;

public class Task_49_Steps {

	public static void main(String[] args) {
		/* Write a Java program to create a stair step pattern
#
	#
		#
			#
			*/
		for (int i =1; i<8;i++) {
			
			for (int j=1;j<i;j++) {
				System.out.print("  ");
				
			}System.out.println("#");
		}
		

	}

}

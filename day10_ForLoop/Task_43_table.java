package day10_ForLoop;

public class Task_43_table {

	public static void main(String[] args) {
		/* Write a Java Program to print the following table.
		 
		Number 		Number Squared
			1 			1
			2 			4
			3 			9
			4 			16
			5 			25
			6			36
			7 			49
			8 			64
			9 			81
			10 			100 	*/
		
		int i, j=0;
		for (i = 1; i<11; i+=1) {
			j = i*i;
			System.out.println("i  : " + i + "  i square    : " + j);
		}
		

	}

}

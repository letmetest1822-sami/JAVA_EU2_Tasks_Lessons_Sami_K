package lessons.day23_Random;

import java.util.*;

public class Task83_rollDice {

	public static void main(String[] args) {
		/*
		 * Dr. Kimuta teaches an introductory statics class 
		 * and has asked you to write a program that he can use in class to simulate the rolling dice.
		 * The program should randomly generate two numbers in the range of 1 through 6 and display them.
		 * In your interview with Dr. Kimura, you learn that 
		 * he would like to use the program to simulate several rolls of the dice, one after the other.
		 */

			int dice1;
			int dice2;
			
			String repeat = "y";
			
			Scanner input = new Scanner (System.in);
			
			Random rn = new Random();
						
		while  (repeat.equalsIgnoreCase("y")) {
			
			System.out.println("Rolling dice...");
			
			dice1 = rn.nextInt(6)+1;
			dice2 = rn.nextInt(6)+1;
			
			System.out.println("Their values are : " + dice1 + " - "+  dice2);
			
			System.out.print("Do you want to roll again y = yes ?"); // y Y n N
			
			repeat = input.nextLine();
		}
		
		
	}

}

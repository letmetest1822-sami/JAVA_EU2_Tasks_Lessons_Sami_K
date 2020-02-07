package lessons.day23_Random;

import java.util.Random;

public class Task84_HeadsOrTails {

	public static void main(String[] args) {
		/*
		 * Dr. Kimuta was so happy with the dice rolling simulator that you wrote for him, 
		 * he has asked you to write one more program. 
		 * He would like a program that he can use to simulate ten coin tosses, 
		 * one after the after. Each time the program simulates a coin toss,
		 * it should randomly display either “Heads” or “Tails”
		 */

		
		Random rn = new Random();
		
		for (int i =1; i<=10; i++) {
			
			boolean b = rn.nextBoolean();
			
				if (b) {
					System.out.println(i + "- Heads");
					
				}else {
					System.out.println(i + "- Tails");
				}
		}
	}

}

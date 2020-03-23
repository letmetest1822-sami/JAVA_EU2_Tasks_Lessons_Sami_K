package lessons.day35_encapsulation;

import java.util.Scanner;

/*
 * On a roulette wheel, the pockets are numbered from 0 to 36. 
 * The colors of the pockets are as follows:
 * Pocket 0 is green.
 * For pockets 1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
 * For pockets 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
 * For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
 * For pockets 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.
 
 *Write a class named RoulettePocket. 
 *The class's constructor should accept a pocket number. 
 *The class should have a method named getPocketColor that returns the pocket's color, as a string.
 *Demonstrate the class in a program that asks the user to enter a pocket number, 
and displays whether the pocket is green, red, or black. 
 *The program should display an error message if the user enters a number 
that is outside the range of 0 and 36.
 */
public class RoulettePocket {

	private int pocketNumber;
	private String pocketColor;
	
	
	
	public String toString() {
		return "RoulettePocket [pocketNumber=" + pocketNumber + ", pocketColor=" + pocketColor + "]";
	}


	public int getPocketNumber() {
		return pocketNumber;
	}


	public void setPocketNumber(int pocketNumber) {
		this.pocketNumber = pocketNumber;
		/*The program should display an error message if the user enters a number 
		that is outside the range of 0 and 36.*/
		
	}

	
	
	public RoulettePocket(int pocketNumber) {
		
		this.pocketNumber = pocketNumber;
	}
	
	/*
	 * The class should have a method named getPocketColor that returns the pocket's color, as a string.
 *Demonstrate the class in a program that asks the user to enter a pocket number, 
and displays whether the pocket is green, red, or black. 
 
	 */
	public String getPocketColor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter aPocket Number between 0 and 36 : ");
		pocketNumber = input.nextInt();
		
		/*
		 *  1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
		 * 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
		 * 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
		 * 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.
		 */
		
		if (pocketNumber<0 || pocketNumber>36) {
			System.out.println("Invalid Pocket Number. Enter between 0-36.");
		}
		
		if (pocketNumber == 0) {
			pocketColor = "Green";
		}
		else if ((pocketNumber >= 1) && (pocketNumber <= 10)){
			if (pocketNumber%2==0) {
				pocketColor = "Black";
			}else
				{pocketColor = "Red";
				}
		}
		else if ((pocketNumber >= 11) && (pocketNumber <= 18)){
				if (pocketNumber%2==0) {
					pocketColor = "Red";
				}else
					{pocketColor = "Black";
					}	
		}
		else if ((pocketNumber >= 19) && (pocketNumber <= 28)){
			if (pocketNumber%2==0) {
				pocketColor = "Black";
			}else
				{pocketColor = "Red";
				}	
		}
		else if ((pocketNumber >= 29) && (pocketNumber <= 36)){
			if (pocketNumber%2==0) {
				pocketColor = "Red";
			}else
				{pocketColor = "Black";
				}	
		}
		
		return pocketColor;
		
	}
	
	
	
}

package day13_Methods;

public class Task61_calculateAge {

	public static void main(String[] args) {
		
		/*
		 Write a method that accepts birthyear and displays the age in the console.
Sample output:
calculateAge(2000) -- > 18

		 */
		 
		calculateAge(2006, 1978);
		
		
		}
	public static void calculateAge(int thisYear, int birthYear) {
		System.out.println("You are " + (thisYear-birthYear) + " years old.");

	}

}

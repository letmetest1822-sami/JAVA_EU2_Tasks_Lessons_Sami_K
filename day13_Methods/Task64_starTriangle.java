package day13_Methods;

public class Task64_starTriangle {

	public static void main(String[] args) {
		/*
		 Write a program that accepts a number and print the star patterns according to that number
		Sample Output:
			printPattern(5);
		 				*
		 				**
		 				***
		 				****
		 				*****
		 */
		starTriangle(5);
	}
	public static void starTriangle(int rows) {
		
		for (int i=1;    i<=rows;   i++) {
			
			for ( int j=0;   j<i;  j++) {
				System.out.print("*");
			
			}System.out.println();
		}
	} 

}

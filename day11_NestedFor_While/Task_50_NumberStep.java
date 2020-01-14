package day11_NestedFor_While;

public class Task_50_NumberStep {

	public static void main(String[] args) {
		/* Write a Java program to create pattern
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
*/
		for (int sayi = 0;  sayi<6;   sayi++) {
			for (int basamak = 0;  basamak<sayi;  basamak++) {
				System.out.print(sayi + " ");
			}
			System.out.println();
		}
		

	}

}

package day10_ForLoop;

public class Task_46_MutiplicationTableFor7 {

	public static void main(String[] args) {
		/*Write a program that the user to declare a positive integer. It should then print the
		multiplication table of that number.*/

		System.out.println("Multiplication table of 7 ");
		System.out.println("------------------------------");
		
		for (int i = 1; i<=10; i++) {
			int j = i*7;
			System.out.println(i + "  x  7 = " + j);
		}
		
	}

}

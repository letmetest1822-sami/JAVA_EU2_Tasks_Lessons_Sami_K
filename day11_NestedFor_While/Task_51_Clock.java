package day11_NestedFor_While;

public class Task_51_Clock {

	public static void main(String[] args) {
		/*Write a Java program to simulate a clock by using nested loop*/

		for (int saat = 1;saat<2;saat++) {
			for (int dakika = 0; dakika<2;dakika++) {
				for (int saniye=0; saniye<17;saniye++)
					System.out.println("0" +saat + ":0" + dakika+ ":"  + saniye);
			}
		}
	}

}

package day10_ForLoop;

public class forLoops {

	public static void main(String[] args) {
		// print Hello 5 times
		
		for (int i=1; i<=5; i++) {
			System.out.println(i+". Hello");
		}		
		for (int j = 1; j<10; j++) {
			System.out.println( j );
		}

		for (int num =20; num>=10;num--) {
			System.out.println(" number = " + num);
		}
		for (int k = 0; k<=100; k+=10) {
			System.out.println("k = " + k);
			for (int f = 1; f<11; f++) {
				System.out.println("You are in tour : " + f);
			}
		}
	}

}

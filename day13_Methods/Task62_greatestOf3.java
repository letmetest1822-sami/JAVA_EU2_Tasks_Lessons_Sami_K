package day13_Methods;

public class Task62_greatestOf3 {

	public static void main(String[] args) {
		
		/*Write a method that accepts 3 numbers and displays the greatest one in the console.
		Sample Output:
		calculateGreatest(5,2,3) -- >5*/
		
		findGreatestOf3(5, 2, 3);
	}

	public static void findGreatestOf3(int a, int b, int c) {
				
		if((a> b)&&(a>c)) {
			System.out.println(a + " is the greater than " + b +" and " + c);
		}
		else if ((b> a)&&(b>c)){
			System.out.println(b + " is the greater than " + a +" and " + c);
		}else if ((c> a)&&(c>b)){
			System.out.println(c + " is the greater than " + a +" and " + b);
		}
	}
}

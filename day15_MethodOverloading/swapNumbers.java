package day15_MethodOverloading;

public class swapNumbers {

	public static void main(String[] args) {

		
		swapTheNumbers(5,6);

	}

	public static void swapTheNumbers(int a, int b) {
		int c= a;
		a=b;
		b=c;
		System.out.println("a was "+ b + " but now a = " + a);
		System.out.println("b was "+ a + " but now b = " + b);
		
}
}

package day15_MethodOverloading;

public class methodOverLoading {

	public static void main(String[] args) {

		System.out.println(SUM(2,3));

	}public static int sum (int a, int b) {
		return a+b;
		
	}
	public static int sum (int c, int d, int e) {
		return c+d+e;
		
	}
	public static int sum (int f, int g, int h, int i) {
		return f+g+h+i;
		
	}


}

package day6_logicalOperators;

public class Task_double20 {

	public static void main(String[] args) {

		double d1 = 20;
		double d2 = 80;
		double res = (d1 + d2)*25;
		
		System.out.println(res);
		
		double res2 = res%40;
		System.out.println(res2);
 
		System.out.println(res2 <= 20);
 
	}

}

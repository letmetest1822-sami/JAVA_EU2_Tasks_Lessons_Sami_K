package day6_logicalOperators;

public class Task_b_equals2 {
public static void main(String[] args)


{
	
	int b = 2;
	boolean res = ++b == 2 || --b == 2 && --b ==2;
	
				 // 3  = 2  or 2  = 2 and 1 = 2
				//	F    or T   and F
				// T or F
					// F
	
	System.out.println(res);

}
}
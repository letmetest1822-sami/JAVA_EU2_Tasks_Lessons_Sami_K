package lessons.day30_VarArgs_WrapperClasses;

public class varArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sum(2,4);
		sum(2,3,5,6);
		
		System.out.println(concat("Apple" , "Orange", "123", "Result"));
	}

	public static void sum (int... numbers) { // A vararg parameter can take a variable number of arguments
		int sum = 0;
		for (int value : numbers) {
			sum = sum + value ;
		}
		
		System.out.println(sum);
	}
	
	public static String concat (String...strs) {
		String newStr = "";
		
		for ( String str : strs) {
			newStr = newStr + str.charAt(2);
		}
		
		return newStr;
	}
}

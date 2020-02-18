package lessons.day30_VarArgs_WrapperClasses;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str1 = "One Two Five Six";
		
		String[] splitted = Str1.split(" ");
		
		System.out.println(Arrays.toString(splitted));
		
		int [] number = new int [splitted.length];
		
		//System.out.println(splitted [0]);
		
		for (int i=0; i<splitted.length; i++) {
			if (splitted [i].equalsIgnoreCase("one")) {
				number[i] = 1;
			}else if (splitted [i].equalsIgnoreCase("two")) {
				number[i] = 2;
			}else if (splitted [i].equalsIgnoreCase("three")) {
				number[i] = 3;
			}else if (splitted [i].equalsIgnoreCase("four")) {
				number[i] = 4;
			}else if (splitted [i].equalsIgnoreCase("five")) {
				number[i] = 5;
			}else if (splitted [i].equalsIgnoreCase("six")) {
				number[i] = 6;
			}else if (splitted [i].equalsIgnoreCase("seven")) {
				number[i] = 7;
			}else if (splitted [i].equalsIgnoreCase("eight")) {
				number[i] = 8;
			}else if (splitted [i].equalsIgnoreCase("nine")) {
				number[i] = 9;
			}else if (splitted [i].equalsIgnoreCase("zero")) {
				number[i] = 0;
			}
				
			
		}
		System.out.println(Arrays.toString(number));
		
		for (int j=0;j<number.length;j++) {
			System.out.print(number[j]);
				}
	}

}

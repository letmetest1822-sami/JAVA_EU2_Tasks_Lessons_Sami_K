package lessons.day30_VarArgs_WrapperClasses;

import java.util.Arrays;

public class Task98_decodeTheString_if {

	public static void main(String[] args) {
		/*
		 * Change the implementation of decodeTheCode(String) method such that on executing class,
		following output is shown:
				
				1 2 5 6
				9 3 4
		 */
		String str1 = "(((&&6)))O&n////e**_ 73T%w%o?=?)!@$,,< >F<i>>>$@v`e``~ 777.S=)=i__?x||}{";
		
		String str2 = "(((&&6)))N'^+i&n////e**_ 73T%h%r?=?e)!@$,,<><>>>$@`e``~ 777.F=)=o__?u||}r{";
		
		System.out.println(decodeTheString(str1));
		System.out.println(convertStringToNumber (decodeTheString(str1)));
		
		System.out.println(decodeTheString(str2));
		System.out.println(convertStringToNumber (decodeTheString(str2)));
				
	}
	
	public static String decodeTheString(String s) {
		
		String str = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				
				str = str + s.charAt(i);
			}
		}
	return str;
}
	public static String convertStringToNumber (String s) {
		
		String[] splitted = s.split(" ");
		int [] number = new int [splitted.length];
		
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
		
		String result = "";
		
		for (int j=0;j<number.length;j++) {
			
			result = result + number[j] + " ";
		}
	return result;
	} 
}

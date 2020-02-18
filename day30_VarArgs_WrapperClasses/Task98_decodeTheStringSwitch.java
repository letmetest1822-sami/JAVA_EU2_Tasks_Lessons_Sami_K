package lessons.day30_VarArgs_WrapperClasses;

import java.util.Arrays;

public class Task98_decodeTheStringSwitch {

	public static void main(String[] args) {
		/*
		 * Change the implementation of decodeTheCode(String) method such that on executing class,
		following output is shown:
				
				1 2 5 6
				9 3 4
		 */
		String str1 = "(((&&6)))O&n////e**_ 73T%w%o?=?)!@$,,< >F<i>>>$@v`e``~ 777.S=)=i__?x||}{";
		
		//String str2 = "(((&&6)))N'^+i&n////e**_ 73T%h%r?=?e)!@$,,<><>>>$@`e``~ 777.F=)=o__?u||}r{";
		
		System.out.println(decodeTheString(str1));
		//System.out.println(decodeTheString(str2));
		
		//String s = decodeTheString(str);
		

		for (int i=0;i<convertStringToNumber (decodeTheString(str1)).length;i++) {
			System.out.print(convertStringToNumber (str1) [i] + " ");
		}
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
	public static int [] convertStringToNumber (String s) {
		String[] splitted = s.split(" ");
		int [] number = new int [splitted.length];
				
		//int number;
		
		for (int i=0; i<splitted.length; i++) {
			switch (splitted [i]) {
			case "one":
				number[i] = 1;
				break;
			case "two":
				number[i] = 2;
				break;
			case "three":
				number[i] = 1;
				break;	
				
			case "four":
				number[i] = 4;
				break;
				
			case "five":
				number [i]= 5;
				break;
			
			case "six":
				number[i] = 6;
				break;
				
			case "seven":
				number[i] = 7;
				break;
				
			case "eight":
				number [i] = 8;
				break;
				
			case "nine":
				number[i] = 9;
				break;
				
			default:
				System.out.println("");
				break;
			}
			
		}
		return number;
		
	} 
}

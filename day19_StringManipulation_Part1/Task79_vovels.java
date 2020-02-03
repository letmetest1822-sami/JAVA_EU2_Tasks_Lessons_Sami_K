package day19_StringManipulation_Part1;

public class Task79_vovels {

	public static void main(String[] args) {
		/*
		 * Write a program to print only vowel (a,e,o,i,u) in given string
String word = "CybertekSchool";
Output: e,e,o,o
		 */

		
		String word = "CybertekSchool";
		int j = 0;
		
		for(int i =0 ;    i< word.length();    i++) {
			
			char vovel=word.charAt(i);
			
			if (vovel=='a' || vovel=='e' || vovel=='o' || vovel=='i' || vovel=='u'){
				j++;
				if (j==1) {
				System.out.print(word.charAt(i) );
			}else {System.out.print(", " + word.charAt(i));
				
			}
		}
	}
}
}

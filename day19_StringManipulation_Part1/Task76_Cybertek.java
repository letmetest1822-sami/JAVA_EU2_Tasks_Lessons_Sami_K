package day19_StringManipulation_Part1;

public class Task76_Cybertek {

	public static void main(String[] args) {
		// Display each character in the console.

		String str = "Cybertek School";
		
		int n = (str.length()-1);
		
		for (int i=0;     i<=n;     i++) {
			
			if ((str.charAt(i)) == ' ') {
				
				System.out.print("Space");
				
			}
			
		System.out.print(str.charAt(i) + " - ");
		
		
	}
}
}

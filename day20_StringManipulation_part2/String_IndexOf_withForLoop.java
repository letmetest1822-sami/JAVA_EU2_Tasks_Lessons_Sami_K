package lessons.day20_StringManipulation_part2;

public class String_IndexOf_withForLoop {

	public static void main(String[] args) {

		String list= "html-selenium-angular-jenkins-grid";

		int n = list.length()-1;
		int countOfDash = 0;
		
		String numberOfDash = "";
		
		for (int i = 0; i<=n;   i++) {
			
			if (list.charAt(i) == '-') {
				countOfDash++;
				
				if (countOfDash==1) {
					System.out.print(numberOfDash+ i);
				}else
					System.out.print(numberOfDash + ", " + i); 
			}
		}
			
			

		System.out.println("\nThere are " + countOfDash + " times \"-\" in the sentence \""+ list + "\"");
	
	}
}



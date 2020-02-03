package day19_StringManipulation_Part1;

public class StringContains2 {

	public static void main(String[] args) {
		String word= "Java is a good program";
		System.out.println(word.contains("ist"));
		
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@h"));

		
		String liste =	"potatoes, tomatoes, eggs, milk, cereal";

		if (liste.contains("appless")) {
			System.out.println("apples are in your list.");
		}
		else {System.out.println("apples are not in your list.");
		
	
	
		boolean hasEggs = liste.contains("eggss");
		System.out.println("Contains eggs : " + hasEggs);
	
	
		boolean hasCucumbers = liste.contains("cucumberss");
		System.out.println("Contains cucumbers : " + hasCucumbers);
	
	
		email = "name@gmail.com";
	
			if(email.contains("@yahoo") ) {
				System.out.println("Yahoo account");
		
			}else if(email.contains("@gmail") ) {
				System.out.println("gmail account");
			
			}else if(email.contains("@hotmail") ) {
				System.out.println("hotmail account");
			}
	
			
			String etsyTitle = "Car | Etsy";
				if (etsyTitle.contains(" | ") ) {
					System.out.println("Pipe is there as expected");
		
				}else {
					System.out.println(" Pipe is not detected");
				}
	
			}
		
	String searchItem = "computer";
	
	String title  = "Amazon.com : computer";
	if (title.contains(searchItem)) {
		System.out.println("pass");
	}
		

	}

}

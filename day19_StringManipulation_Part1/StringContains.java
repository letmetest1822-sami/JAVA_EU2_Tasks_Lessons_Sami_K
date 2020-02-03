package day19_StringManipulation_Part1;

public class StringContains {
	
	public static void main(String[] args) {

	String word= "Java is a good program";
		System.out.println(word.contains("is"));
		
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		
		String liste =	"potatoes, tomatoes, eggs, milk, cereal, apples";

		if (liste.contains("apples")) {
			System.out.println("apples is in your list.");
		}
		else {System.out.println("apples is not in your list.");
		
		}
	
		boolean hasEggs = liste.contains("eggs");
		System.out.println("Contains eggs : " + hasEggs);
	
	
		boolean hasCucumbers = liste.contains("cucumber");
		System.out.println("Contains cucumbers : " + hasCucumbers);
	
	
		email = "name@yahoo.com";
	
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
	}


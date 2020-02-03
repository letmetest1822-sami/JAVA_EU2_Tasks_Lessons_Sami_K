package day19_StringManipulation_Part1;

public class String_Concat {

	public static void main(String[] args) {
		String word= "Java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word); // prints java
		
		word = word.concat(" eclipse in computer");
				System.out.println(word); // prints "java eclipse in computer"

			//	word = word.concat(123);
			//	System.out.println(word); // will not work ... only with String	
				
//				word = word + true;
				//	System.out.println(word); // will not work ... only with String	
		String word2 =  "Hi";
		word2 = word2.concat("-hey").concat("-how are you? ").concat("-good");
		System.out.println(word2); 		
				
	}

}

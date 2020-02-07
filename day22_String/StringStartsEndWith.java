package lessons.day22_String;

public class StringStartsEndWith {

	public static void main(String[] args) {


		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		
		//Mr. = > married man
		//Mrs.=>married woman
		//Ms. => some  woman
		//Dr. => Doctor
		//No title => Noinformation
		
		String word2 = "Mrd";
		
		if (word2.startsWith("Mr")) {
			System.out.println("Married man");
		}
		else if (word2.startsWith("Mrs"){
			System.out.println("Married woman");
		}
		else if (word2.startsWith("Ms"){
			System.out.println("Some woman");
		}
		else if (word2.startsWith("Dr"){
			System.out.println("Doctor");
		}else{
			System.out.println("No title");
		}

	}

}

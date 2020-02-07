package lessons.day21_StringClassContinue_part1;

public class String_Trim {

	public static void main(String[] args) {
		String sentence = "       Java String Manipulation is fun";
		System.out.println(sentence.trim());

		
		
		String sentence2 = "Java String Manipulation is fun              ";
		System.out.println(sentence2.trim());
	}

}

package lessons.day20_StringManipulation_part2;

public class String_replace {

	public static void main(String[] args) {
		
		String str = "Moscow is the Russia capital of Russia";
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbeycan");
		
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		System.out.println(email);

		String company = "Capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);

	}

}

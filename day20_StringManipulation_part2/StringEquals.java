package lessons.day20_StringManipulation_part2;

public class StringEquals {

	public static void main(String[] args) {

String str1 = "Apple";
String str2 = "Apple";

System.out.println(str1 == str2);
System.out.println(str1.equals(str2));

String str3 = "Apple";
String str4 = new String ("Apple");

System.out.println(str3 == str4);
System.out.println(str3.equals(str4));

	}

}

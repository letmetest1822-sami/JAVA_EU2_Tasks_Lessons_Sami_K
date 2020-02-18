package lessons.day30_VarArgs_WrapperClasses;

public class Task97_filterString {

	public static void main(String[] args) {
		
		//Write a method that returns : Welcome to core Java

String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(str));

	}
	
	public static String filterString(String s) {
		
		String str = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				
				str = str + s.charAt(i);
			}
			
		}
		
		return str;

	}

}

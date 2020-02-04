package lessons.day20_StringManipulation_part2;

public class String_replace3 {

	public static void main(String[] args) {
		
		String mixed = "%&/jF+%^+aGHYvJGTa";
		mixed  = mixed .replace("%&/", "").replace("F+%^+", "").replace("GHY", "").replace("JGT", "");
	
		
		System.out.println(mixed);
		
		
		String result = " About 8,936,256,000 results 5465 seconds";
		result = result.replace(" About ", "").replace(" results 5465 seconds", "");
		System.out.println(result);
	}

}

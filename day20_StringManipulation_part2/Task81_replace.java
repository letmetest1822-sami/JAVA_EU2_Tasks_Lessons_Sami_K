package lessons.day20_StringManipulation_part2;

public class Task81_replace {

	public static void main(String[] args) {
		/*
		 * Write a method that accept the date with time 
		 * and creates a timeStamp for your automation report.
		 */
		
		String date = "10/10/2019 14:59:00"; 
		System.out.println(timeStamp(date));
		
	}
	public static String timeStamp(String date) {
		
		String dateReplaced = date.replace ("/","").replace (":","").replace (" ","");
	
		return dateReplaced;
	}
}

package day14_MethodsContinue;

public class Task68_ageRetirement {

	public static void main(String[] args) {
		/* 
		 Write two methods:
		 1-calculateAge(yearBirth); and returns the age
		 2-yearsUntilRetirement(name,year); 
		 and displays in the console following:  
		 “Mike retires in 36 years”
		 Example: yearsUntilRetirement(“Mike”,1990);
		 */
		yearsUntilRetirement("Sami", 1978);
			
	}
					
		public static void yearsUntilRetirement(String name, int yearBirth) {
			int age = calcuateAge(yearBirth);
			System.out.println(name + " retires in 2020 at " + (age) + " years old.");
		
	}
		public static int calcuateAge(int yearBirth) {
			
			int ageCalculated = 2020 - yearBirth;
			
			return ageCalculated;
}
		
}
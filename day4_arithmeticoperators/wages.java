package day4_arithmeticoperators;

public class wages {

	public static void main(String[] args) {
		// This program calculates hourly wages plus overtime
		
		double regularWage;        // The calculated regular wage
		double basePay = 25.75f;   // The base  pay;
		double regularHours = 40;  // The hours worked less overtime
		double overTimeWages;      // Overtime wages
		double overTimePay = 37.5; // Overtime pay rate
		double overTimeHours = 15;
		double totalWage;          // Total wages
		
		regularWage = basePay*regularHours;
		overTimeWages = overTimePay * overTimeHours;
				
		totalWage = regularWage + overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
	

	}

}

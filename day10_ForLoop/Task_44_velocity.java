package day10_ForLoop;

public class Task_44_velocity {

	public static void main(String[] args) {
		/* Your friend Mike Smith just inherited a European sports car from his uncle. 
		 * Mike lives in the USA, and he is afraid he will get a speeding ticket 
		 * because the car’s speedometer indicates kilometers per hour(KPH). 
		 * He has asked you to write a program that displays 
		 * a table of speeds in kilometers per hour with their values converted to 
		 * miles per hour(MPH). The formula for converting KPH to MPH is:
			MPH = KPH * 0.6214
		* The table that your program displays should show speeds 
		* from 60 kilometers per hour thru 130 kilometers per hour, 
		* in increments of 10, along with their values converted to miles per hour.
		* The table should look like something like this:
			KPH 	MPH
			60 		37.3
			70 		43.5
			80 		49.7
			etc
			130 	80.8 */

		/*final int first_KmPh = 60;
		final int Max_KmPh = 130;
		final int Increment = 10;*/
		
		
		int KmPh;
		double mph;
		
		System.out.println("KmPh\t\tMpH");
		System.out.println("--------------------");
		/*for ( KmPh = first_KmPh; KmPh<=Max_KmPh; KmPh+=Increment)*/
		for (KmPh = 60;KmPh<=130; KmPh+=10)
		{
			mph = KmPh*0.6214;
			System.out.println(KmPh + "\t\t" + mph);
		}
		
	}

}

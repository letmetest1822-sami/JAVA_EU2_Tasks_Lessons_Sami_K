package lessons.day38_Inheritance_part2;

public class FullTimeEmployee extends Employee {
	
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)*1.15;
		System.out.println("Fulltime Employee total pay = " + total);
	}
	
	
}

package day4_arithmeticoperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//Addition Operator +
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs+2);   
		
		/* Print Does not change the value 
		 * unless you write 
		 * arithmetic operator code*/
		
		
		chairs= chairs + 2; // this changes the variable to a new value...
		
		int moreChairs = chairs+5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		// Subtraction Operator -
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		int linesOfCode = 50;
		System.out.println("Lines Of Code : " + linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("Lines Of Code : " + linesOfCode);
		
		
		//Multiplication Operator *
		
		System.out.println(22*2);
		int classes = 5;
		System.out.println(linesOfCode*classes);
		int totalLinesOdCode = linesOfCode*classes;
		System.out.println(" TotalLines of Codes = " + totalLinesOdCode);
		
		//division Operator /
		System.out.println(10/2);
		System.out.println(60/3);
		
		
		//System.out.println(11/0);  // throw error when you run the code
		
		//Raminder %
		
		System.out.println(10%2);
		System.out.println(9%2);
		
		
		
		

	}

}

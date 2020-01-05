package day7_controlFlowStatements;

public class ifStatementsSalary {

	public static void main(String[] args) {

		int sales, bonus;
		double commissionRate,salary;
		sales=6000;
		salary = 10000;
		
		if(sales>5000) { 
			
			bonus = 500;
			commissionRate = 1.12;
			
			salary = salary * commissionRate+bonus;
		}
		
		System.out.println("Congratulations! You have got bonus. Your Salary =  " + salary);

	}

}

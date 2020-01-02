package day4_arithmeticoperators;

public class Casting_Task1_2_3_4 {

	public static void main(String[] args) {
		
		//Task 1
		
				int pies = 10, people = 4;
				double piesPerson;
				piesPerson=pies/people;
		
				System.out.println("Task 1: " + piesPerson +  "\n " );

		//Task 2
		
				int pies2 = 10, people2 = 4;
				double piesPerson2;
				piesPerson2 = (double) pies2/people2;
				
				System.out.println("Task 2: " + piesPerson2 +  "\n " );
				
		//Task 3
				
				int pies3 = 10, people3 = 4;
				double piesPerson3;
				piesPerson3 =  pies3 / (double) people3;
				
				System.out.println("Task 3: " + piesPerson3 +  "\n " );
		
		//Task 4
				
				int pies4 = 10, people4 = 4;
				double piesPerson4;
				piesPerson4 = (double) (pies4 /  people4);
				
				System.out.println("Task 4: " + piesPerson4 +  "\n " );
		
	}

}

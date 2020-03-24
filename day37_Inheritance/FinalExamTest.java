package lessons.day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.print("How many questions are on the final exam? : ");
		questions = input.nextInt();
		
		System.out.print("How many questions did the student miss ? :");
		missed = input.nextInt();
		
		
		FinalExam f1 = new FinalExam(questions, missed);
		System.out.println("The grade for the exam is : " + f1.getGrade());
		
		

	}

}

package day13_Methods;

public class Task65_v2_averageGradesA_B_C {

	public static void main(String[] args) {
		/*  
		 Write a method that accepts 3 exam grades from a lesson and calculate the average.
		* Then print the letter grade of the average according to the below table
		90-100	A
		80-89	B
		70-79	C
		60-69	D
		0-59	F
		
		Sample Output:
	calculateGrade(100,100, 100)   - >  A
	calculateGrade(50,  50, 50)    - >  F
		 */
		averageA_B_C(50,70,90);
			}
	public static void averageA_B_C(int a, int b, int c) {
		
		System.out.println("First Exam grade  : "+a + "\n"+ "Second Exam grade : " + b+ "\n"+ "------------\n"+"Final Grade       : " + c+ "\n");

		double average = (a+b+c)/3;
		
		System.out.println("Your average is : " + average+ "\n" + "Letter grade is : " );
		
		gradeConverter(average);
	}
	public static void gradeConverter(double x) {
		
		if((x<=100)&&(x>=90)) {
			char grade = 'A';
			System.out.println(grade);
			
		}else if((x<=89)&&(x>=80)) {
			char grade = 'B';		
			System.out.println(grade);
			
		}else if((x<=79)&&(x>=70)) {
			char grade = 'C';		
			System.out.println(grade);
			
		}else if((x<=69)&&(x>=60)) {
			char grade = 'D';		
			System.out.println(grade);
			
		}else if((x<=59)&&(x>=0)) {
			char grade = 'F';		
			System.out.println(grade);
			
		}else
		{System.out.println("invalid grade");
		
		}
	}

}

package lessons.day30_VarArgs_WrapperClasses;

public class Task96_FahrenheitToCelcius {

	public static void main(String[] args) {


		//Write a program to output: 72 degree is equal to 22.22 celcius
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr = str1.split("and ");

		arr = arr[1].split(" degree");
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		
		double degreeC = (degreeF - 32) * 5/9;
		
		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");

	}

}

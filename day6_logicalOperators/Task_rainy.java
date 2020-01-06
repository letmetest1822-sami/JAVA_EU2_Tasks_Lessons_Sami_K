package day6_logicalOperators;

public class Task_rainy {

	public static void main(String[] args) {
		
		String outsideWeather;
		int degree;
		outsideWeather = "Shinny";
		degree = 70;
		 boolean comp = (!(outsideWeather=="Rainy"|| degree == 70)); //(!(F||T) =>!T =>false
		 
		 System.out.println(comp);

	}

}

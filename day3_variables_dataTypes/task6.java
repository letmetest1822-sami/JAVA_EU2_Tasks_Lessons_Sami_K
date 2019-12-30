package day3_variables_dataTypes;

public class task6 {

	public static void main(String[] args) {
		
		/*int flightNum = 8, travelTime, departure=10, distance;
		
		System.out.println(flightNum);
		System.out.println(travelTime);
		System.out.println(departure);
		System.out.println(distance);*/ 
		
		//Does not Compile
		
		
int flightNum = 8, departureGate=10, distance=400;
String travelTime= "1 Hour 15 Minutes";  
		
		System.out.println("Your Flight Number is     : " + flightNum);
		System.out.println("Your Flight will take     : " + travelTime);
		System.out.println("You will depart from Gate : " + departureGate);
		System.out.println("You will be flying " +"\""+ distance + "\"" + " Km.s");
	}

}

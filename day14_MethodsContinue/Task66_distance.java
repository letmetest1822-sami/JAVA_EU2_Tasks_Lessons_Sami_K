package day14_MethodsContinue;

public class Task66_distance {

	public static void main(String[] args) {
		/* The distance a vehicle travels can be calculated as follows:
		 		Distance=Speed*Time
		 * Write a method named distance 
		 * that accepts a vehicle’s speed and time as arguments, 
		 * and return the distance the vehicle has traveled.*/

		int x = distanceTraveled(90,2);
		
		System.out.println("the distance traveled is : " + x);
		
	}
	public static int distanceTraveled(int speed, int time) {
		
		int distance = speed * time;
		
		//System.out.println(distance);
		
		return distance;
		
	}
}

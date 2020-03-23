package lessons.day34_constructors_passingObjectMethods;

public class Light {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0, false); //this(); //call,ng the constructor
		System.out.println("Returning from no-argument constructor no.1 ");
	}
	public Light(int watt, boolean ind) {
		System.out.println("Returning from no-argument constructor no.2 ");
	}
	
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
	}

	

}

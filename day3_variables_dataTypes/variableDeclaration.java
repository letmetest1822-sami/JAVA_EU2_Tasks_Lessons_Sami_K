package day3_variables_dataTypes;

public class variableDeclaration {

	public static void main(String[] args) {
		
		//declaration
		byte inches;
		int speed;
		short month;
		float salesCommission;
		double distance;
		
		//assigned
		inches=5;
		speed=200;
		month=2;
		distance=40.2;
		salesCommission=3;
				
		//int inches; *** Duplicate local variable inches
		
		//declared + assigned
		
		byte inches2=5;
		byte feet=2;
		System.out.println(inches + "\n"+ distance + "\t" + salesCommission);
		System.out.println("\t" + speed + "\n");
		
		int number = 10;
		
		System.out.println("My number is \"" + number + "\".");
		
		String name = "Sami";
		
		System.out.println("My name is \""+ name + "\"."+ "\n");
		
		
		
		
	}

}

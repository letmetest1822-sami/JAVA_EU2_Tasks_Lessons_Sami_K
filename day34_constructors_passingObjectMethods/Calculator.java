package lessons.day34_constructors_passingObjectMethods;

public class Calculator {
	
	public static void main(String[] args) {
	/*
 3. Write a class with the name Calculator. 
 * The class needs two fields (instance variables) with name floor of type Floorand carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
it needs to initialize the fields.
 * Write the following methods (instance methods):
 *  Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor 
with a carpet.
	 */
	Floor f1 = new Floor(12, 10);
	
	Carpet c1 = new Carpet(8);

	getTotalCost(f1, c1);
	
	}
	public static void getTotalCost(Floor floor, Carpet carpet) {
		
		double area = floor.getArea();
		double cost = carpet.getCost();
		System.out.println("Total cost is $" + area   * cost);
	}
}

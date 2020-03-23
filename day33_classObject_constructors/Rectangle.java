package lessons.day33_classObject_constructors;

public class Rectangle {

	double length;
	double width;
	
	public void getArea() {
		System.out.println(length * width);
	}
	
	
	//constructor
	//accepts 2 variables
	public Rectangle(double a, double b) {
		length = a;
		width = b;

}
}

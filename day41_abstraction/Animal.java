package lessons.day41_abstraction;

public abstract class Animal {
	
	public abstract void eat() ;

	public abstract void breathe() ;
	
	public  void move() {
		System.out.println("Moving");
	}
}

package lessons.day34_constructors_passingObjectMethods;

import java.util.*;
public class Dice {

	int sides;
	int value;
	
	public Dice(int numSides) {
		sides = numSides;
	}
	
	public void roll () {
		Random rand = new Random ();
		value = rand.nextInt(sides) + 1;
		
	}
	
	public int getSides() {
		return sides;
		
	}
	
	public int getValue() {
		return value;
	}
	
	
	
}

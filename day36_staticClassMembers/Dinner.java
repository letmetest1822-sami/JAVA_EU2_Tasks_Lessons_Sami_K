package lessons.day36_staticClassMembers;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeAslice() {
		pizzaSlice--;
	}
	
	
	public void takeAslice(int count) {
		pizzaSlice = count;
	}

}

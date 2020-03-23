package lessons.day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {


		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total sclices : " + Dinner.pizzaSlice);
		
		dad.takeAslice();
		kid.takeAslice();
		mom.takeAslice();
		System.out.println(dad.pizzaSlice);
		
		kid.takeAslice(3);
		//dad.takeAslice(2);
		
		//mom.takeAslice();
		System.out.println(Dinner.pizzaSlice);
		//System.out.println(Math.PI);

	}

}

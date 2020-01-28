package day17_ClassObjects_Part2;

public class p02_carObjects {

	public static void main(String[] args) {


		p01_BMW b1 = new p01_BMW ();
		p01_BMW b2 = new p01_BMW ();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make = "BMW2019";
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.model = "m3";
		
		b1.showPrice();
		
		b2.model = "x 3";
		
		b2.showPrice();
	}

}

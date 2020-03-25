package lessons.day38_Inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {

		StaticSub obj = new StaticSub();
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10;
		obj.print();
		System.out.println(StaticSub.num);
		
		StaticSub.m1();
		
		obj.m2();
		
	}

}

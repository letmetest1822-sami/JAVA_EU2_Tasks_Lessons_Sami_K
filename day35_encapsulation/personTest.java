package lessons.day35_encapsulation;

public class personTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(35); // set the value by setter retrieve the value by getter
		System.out.println(p1.getAge());
		System.out.println(p1.toString());

	}

}

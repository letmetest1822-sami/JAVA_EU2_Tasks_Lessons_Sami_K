package lessons.day35_encapsulation;

public class Person {

	private String name;
	private int age;
	private char gender;

	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public void setAge(int age) {
		this.age = age;
	
	}
	int getAge() {
		return this.age;
	
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private char getGender() {
		return gender;
	}
	private void setGender(char gender) {
		this.gender = gender;
	}
	
}
//Encapsulation
//Hide the data
// - private
// - public setter method
// - public getter metod

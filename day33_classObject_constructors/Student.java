package lessons.day33_classObject_constructors;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String courseName;
	String coursePlace = "Cybertek";
	public Student(String name, int age, char gender, int year, String courseName) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.courseName = courseName;
	}
	
	public void attendLecture() {
		System.out.println(name + " is attending lecture.");
	}
	
	public void submitAssignment(){
		System.out.println(name + " is submitting assignment.");
	}
	public void attendLab(){
		System.out.println(name + " is attending Lab.");
	}
	
	
	
}

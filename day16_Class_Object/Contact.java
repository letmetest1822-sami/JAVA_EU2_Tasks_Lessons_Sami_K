package day16_Class_Object;

public class Contact {

	String name;
	String phoneNumber;
	String email;
	
	public void contactCard() {
		System.out.println("-------------------------------");
		System.out.println("Name          : " + name);
		System.out.println("Phone Number  : " + phoneNumber);
		System.out.println("E-mail adress : " + email);
	}
	
	public void call() {
		
		System.out.println("calling "+name);
	}

	public void sendMessge() {
		System.out.println("Sending message to " + phoneNumber + " | name " + name);
	
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + email + " | name " + name);
	
	}
}


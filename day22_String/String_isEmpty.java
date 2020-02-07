package lessons.day22_String;

public class String_isEmpty {

	public static void main(String[] args) {


		String userName = "";
		String password = "";
		
		if (userName.isEmpty()) {
			System.out.println("User name can not be empty");
		}else {
			System.out.println("User name or password is not emoty");
		}

		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("User name or password can not be empty");
		}else {
			System.out.println("User name or password is not emoty");
		}
		
		//userName.is there can be space
	}

}

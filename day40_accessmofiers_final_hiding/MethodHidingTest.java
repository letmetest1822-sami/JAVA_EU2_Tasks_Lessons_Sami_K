package lessons.day40_accessmofiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		

	}

}

class Bear{
	
	public static void eat() {
	System.out.println("Bear is eating");
	}
	public static void sneeze() {
	System.out.println("Bear is sneezing");
	}
	public  void hybernate() {
	System.out.println("Bear is hybernating");
	
	}
	
}

	class Panda extends Bear{
		 
		public static void eat() {						//hiding
		System.out.println("Panda is eating");
		}
		/*
		public  void sneeze() {							//CT Error
		System.out.println("Panda  is sneezing");
		}
		*/
		
		public  void hybernate() {						//overriding
		System.out.println("Panda  is hybernating");
		}
		
	}

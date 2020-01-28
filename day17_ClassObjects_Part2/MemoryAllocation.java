package day17_ClassObjects_Part2;

public class MemoryAllocation {

	public static void main(String[] args) {



	}
	
	public static void m1() {
		int x = 20;
		m2  (10);
	}
	
	public static void m2 (int b) {
		boolean c;
		m3();
	}
	
	public static void m3 () {
		Account ref = new Account();
	}

	
}

class Account{
	int p;
	int q;
	
}


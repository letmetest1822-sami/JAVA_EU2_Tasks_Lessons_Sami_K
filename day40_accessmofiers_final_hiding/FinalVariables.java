package lessons.day40_accessmofiers_final_hiding;

public class FinalVariables {
	
	public final int ROADSTAR_MAX_RANGE = 600;
	
	public final int MODEL_3_MMAXSPEEED;
	
	public final int MODEL_X_PASSENGERS;
	
	public static final String ADMIN_USERNAME;
	
	
	
	public FinalVariables() {
		this.MODEL_3_MMAXSPEEED = 200;
		//ADMIN_USERNAME = "Ozzy";
	}
	
	{
		MODEL_X_PASSENGERS = 7;
		//ADMIN_USERNAME = "Ozzy";  
		// Error because instance block only runs before you create an object
	}
		
	
	static {
		ADMIN_USERNAME = "Ozzy";  
		//static block runs only once whenever class is loaded.
	}
	

	public static void main(String[] args) {
		

		final int MAX_PASSENGERS_COUNT = 5;  // local
		final int SSN;
		
		SSN = 66;
		//SSN++;
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROADSTAR_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MMAXSPEEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);
		
		
		
		
	}

}

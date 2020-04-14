package lessons.day40_accessmofiers_final_hiding;

public class Kangaroo extends Marsupial {

	public static boolean isBiped() {
		return true;
	}
	
	public void getKangaroooDescription() {
		System.out.println("Kangarooo walks on the two legs : " + isBiped());
	}
	
	
	
	
}

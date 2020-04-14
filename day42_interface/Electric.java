package lessons.day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; // public final static
	
	public abstract void charge();
	
	void charge2();
	
	public default void methodA() {
		System.out.println("Must use default");
	}
	
	public default void methodB() {
		System.out.println("Must use default");
	}

}

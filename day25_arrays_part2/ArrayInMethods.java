package lessons.day25_arrays_part2;

public class ArrayInMethods {

	public static void main(String[] args) {


		int [] numbers = {5, 15, 10, 20, 25, 30, 50};
		
		for(int value : numbers) {
			showValue(value);
		}

	}

	public static void showValue(int n) {
		System.out.print(n + " ");
	}
}

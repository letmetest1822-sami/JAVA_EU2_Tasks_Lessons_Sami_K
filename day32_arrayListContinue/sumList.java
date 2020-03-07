package lessons.day32_arrayListContinue;

import java.util.ArrayList;


public class sumList {

	public static void main(String[] args) {

		ArrayList<Double> doubleList = new ArrayList<>();
		
			doubleList.add(10.33);
			doubleList.add(1.22);
			doubleList.add(7.34);
			doubleList.add(3.55);
			doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		
		System.out.println(sum);
		
		}
		public static double sumList(ArrayList<Double> dlist) {
		
			double sum = 0;
			
				for (Double d : dlist) {
					sum = sum + d;
		}
				
		return sum;
	}

}

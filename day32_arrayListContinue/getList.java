package lessons.day32_arrayListContinue;

import java.util.ArrayList;

public class getList {

	public static void main(String[] args) {

		// Call the method with a number __the last number is not included__
		ArrayList<Integer> list = getList(15); 
		
		//Print the ArrayList to see the  numbers
		System.out.println(list.toString());   //import java.util.ArrayList;
		
	}
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
			for (int i = 1;        i < size ;        i++) { // start the loop from 1
				newList.add (i);
		}
		
	return newList;
	}
}

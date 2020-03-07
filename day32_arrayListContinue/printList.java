package lessons.day32_arrayListContinue;

import java.util.ArrayList;
import java.util.Random;

public class printList {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
	}
	public static void printList(ArrayList<Integer> nums) {
		
		for (Integer n : nums) {
			
			System.out.print(n + " | ");
		}
	}	
}

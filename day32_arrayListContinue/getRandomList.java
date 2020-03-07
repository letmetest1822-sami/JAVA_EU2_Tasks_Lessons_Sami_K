package lessons.day32_arrayListContinue;

import java.util.ArrayList;

import java.util.Random;

public class getRandomList {

	public static void main(String[] args) {

		ArrayList<Integer> randomNums = getRandomList(15);
		System.out.println(randomNums.toString());
	
	}

	public static ArrayList<Integer> getRandomList(int size) {
		
		Random r = new Random ();
		ArrayList<Integer> randomNums = new ArrayList<>();
		for (int i = 1; i< size ; i++) {
			randomNums.add(r.nextInt(101));
	}
		return randomNums;
	}
}

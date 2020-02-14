package lessons.day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass_sort {

	public static void main(String[] args) {
		
		//sort() : sort array in ascending order
		// first numbers, then capital letters, then small letters
		
		int [] nums = {43,12,4,1,3,5};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		String[] languages =  { "Zulu", "Spanish", "Italian,-", "English", "Polish", "arabic"};
		Arrays.sort(languages);
		System.out.print(Arrays.toString(languages));
		
		
		
		
		
	}

}

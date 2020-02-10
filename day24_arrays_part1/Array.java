package lessons.day24_arrays_part1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] myList = {10,20,30,40};
		
		String[] myArray = {"Apple", "Orange", "Melon"};
 		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for (int i=0; i<=myArray.length-1;  i++) {
			System.out.println((i+1) +". element is :" +myArray[i]);
			
		}
	
		
	}

}

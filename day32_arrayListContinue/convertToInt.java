package lessons.day32_arrayListContinue;

import java.util.ArrayList;

public class convertToInt {

	public static void main(String[] args) {

		ArrayList<String> strNums = new ArrayList<>();
		
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		
		System.out.println("******** C O N V E R T E D   V E R S I O N ********");
		System.out.println(converted);
		
		System.out.println("\n\n********** S T R I N G    V E R S I O N **********");
		System.out.println(strNums.toString()); // String version
	}

		public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
			
			ArrayList<Integer> newList = new ArrayList<>();
			
				for(String str : strList) {
					newList.add(Integer.parseInt(str));
					
				}
				
		return newList;
	}
	
	
}

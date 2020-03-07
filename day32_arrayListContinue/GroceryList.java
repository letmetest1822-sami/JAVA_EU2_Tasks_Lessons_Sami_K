package lessons.day32_arrayListContinue;

import java.util.ArrayList;

public class GroceryList {
	
	// create the Empty array list
	ArrayList<String> groceryList = new ArrayList<>();  

	
	// when the user choose option 1 : see the print and list below
	public void printGroceryList () {  
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");
		
			for (int i = 0; i< groceryList.size(); i++) {
			System.out.println((i+1) + ". "+ groceryList.get(i));
			}
	}
	
	// when the user choose option 2 : will add items to the list using the keyboard (Scanner input)
	public void addGroceryListItem (String item) { 
		groceryList.add(item);
	}
	
	// when the user choose option 3 : will modify an  item by selecting the item number and write a new name
	public void modifyGroceryListItem (int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified.");
	}
	
	// when the user choose option 4 : will remove an  item by selecting the item number
	public void removeGroceryListItem (int position) {
		groceryList.remove(position);
		System.out.println("Grocery item " + (position+1) + " has been removed.");
	}
	
	// when the user choose option 5 : will search for an  item by typing the item name
	public String findGroceryListItem (String searchItem) {
		int position = groceryList.indexOf(searchItem);
		if (position >=0) {
			return groceryList.get(position);
		}
		return null;
	}
}

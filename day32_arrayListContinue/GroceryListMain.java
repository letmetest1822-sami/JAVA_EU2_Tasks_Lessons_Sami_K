package lessons.day32_arrayListContinue;

import java.util.Scanner;

public class GroceryListMain {
		
	//we can use them in all other methods now

	static GroceryList groceryList = new GroceryList();
	
	static Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) {  // Program starts here
		
		boolean quit = false;

		printInsturctions();
		
		while (!quit) {
		
			System.out.print("Enter your choice : ");
			int selection = input.nextInt();
			input.nextLine();
		
				if (selection == 0) {
					printInsturctions();
				// when the user choose option 0 : will see the options to select
				}
				
				else if (selection == 1) {
					//write ==objectName.MethodName==
					//because the code is in the ==GroceryList== class
					
					groceryList.printGroceryList();
				// when the user choose option 1 : will see the list of items
				}
				
				else if (selection == 2) {
				// when the user choose option 2 : will add items to the list using the keyboard (Scanner input)
					addItem();  		// created the method in main, but will be called from  ==GroceryList== class
				}
				
				else if (selection == 3) {
				// when the user choose option 3 : will modify an  item by selecting the item number and write a new name
					modifyItem(); 		// created the method in main, but will be called from  ==GroceryList== class 
				}
				
				else if (selection == 4) {
				// when the user choose option 4 : will remove an  item by selecting the item number
					removeItem(); 		// created the method in main, but will be called from  ==GroceryList== class 
				}
				
				else if (selection == 5) {
				// when the user choose option 5 : will search for an  item by typing the item name
					searchItem(); 		// created the method in main, but will be called from  ==GroceryList== class 
				}
				
				else if (selection == 6) {
					System.out.println("You are about to quit! Are you sure? Y : ");
					String quitProg = input.nextLine();
					
						if (quitProg.equalsIgnoreCase("y")) {
							quit = true;
							System.out.println("\nYou quited the application...");
							System.out.println("\nThanks for using the program...\n\n\tGoodbye...");
						}
						else if(!quitProg.equalsIgnoreCase("y")) {
							printInsturctions();
						}
						
						/*
						else {
							 do {
								 System.out.println("Please Select Y to quit N or to see the selection menu : ");
								 break;
							 }
							 while ((!quitProg.equalsIgnoreCase("y") || (!quitProg.equalsIgnoreCase("n")))) ;
							
					}*/
						
		} //end of the while loop keeping the program running
				
	} //end of the main
		
} // end of the class ==GroceryListMain==

	public static void printInsturctions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list. ");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addItem() {
		
		System.out.println("Enter you grocery item :");
		groceryList.addGroceryListItem(input.nextLine()); //Create a method in the template class --addGroceryListItem--
	}

	public static void modifyItem() {
		
		System.out.println("Enter item number to modify :");// use (number - 1) to find the index number
		int itemNo = input.nextInt();
		
		input.nextLine();  // to be able to go to the next line
		
		System.out.println("Enter replacement item :");
		String newItem = input.nextLine();
		
		groceryList.modifyGroceryListItem(itemNo-1, newItem ); //Create a method in the template class --modifyGroceryListItem--
	}
	public static void removeItem() {
		
		System.out.println("Enter item number to delete :"); // use (number - 1) to find the index number
		int itemNo = input.nextInt();// after integer to be able to go to the next line
		
		input.nextLine();  
		
		groceryList.removeGroceryListItem(itemNo-1 ); //Create a method in the template class --modifyGroceryListItem--
	}
	
	public static void searchItem() {
		
		System.out.println("Enter item  to serch for :"); // use (number - 1) to find the index number
		String searchItem = input.nextLine();

		if( groceryList.findGroceryListItem (searchItem) != null) {
		System.out.println("Found " + searchItem + " in your grocery list");
		
		}else {
			System.out.println(searchItem + " is not in the grocery list");
		}
		
	}
	
}

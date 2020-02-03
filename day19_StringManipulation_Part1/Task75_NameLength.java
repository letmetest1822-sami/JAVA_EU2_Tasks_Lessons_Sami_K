package day19_StringManipulation_Part1;

import java.util.Scanner;

public class Task75_NameLength {

	public static void main(String[] args) {
		// Write a program that ask user to enter his/her firstname and lastname. Display in the
		//console total number of characters.

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your name : ");
		String firstName = sc.next();
		
		System.out.println("Please enter your surname : ");
		String lastName = sc.next();
		
		System.out.println(firstName.length()+lastName.length());
	}

}

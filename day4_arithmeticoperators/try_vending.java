package day4_arithmeticoperators;

public class try_vending {

	public static void main(String[] args) {
		int itemPrice =35;
		int acceptedMoney=100;
		int numberOfQuarters,numberOfDimes,numberOfNickles,remainder25,remainder10=0;   
		int remainder=acceptedMoney-itemPrice;
		numberOfQuarters=(remainder - remainder%25)/25;
		remainder25=remainder-(numberOfQuarters*25);
		numberOfDimes=(remainder25-remainder25%10)/10;
		remainder10=remainder25-(numberOfDimes*10);
		numberOfNickles=(remainder10-remainder%5)/5;
		System.out.println("Your change is " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickles + " nickles");


	}

}

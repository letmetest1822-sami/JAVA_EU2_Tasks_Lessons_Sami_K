package day12_BranchingStatements;

public class branchingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =0;
		while ( number < 15 ) {
			
			number++;
			
			if (number <= 5) {
			
			System.out.println("skipping number " + number);
			
			continue;
		}
			
		System.out.println("number = " + number);
		
		if (number >= 10) {
			System.out.println("Breaking at " + number);
		
		break;
		
		}
		
	}

}
}

package Month1;

public class WhileLoop {

	/*
	 * While loop repeats a block of code until the condition is true
	 * 
	 *	While (condition)
	 *	{
	 *	//block of code
	 *	}
	 *	//where condition is nothing but the Boolean expression
	 * 
	 *	---
	 * 	Do-while loops is guaranteed to run at least one time
	 * 
	 * 	do
	 * 	{
	 * 	//block of code
	 * 	}
	 * 	While (condition)
	 * 
	 * 	Since condition appears at the end, the code block executes at least once
	 * 
	 * Loops are not statements - they are not terminated but exits
	 * Entry criteria - loop condition must be true
	 * Exit criteria - loop condition is false
	 * 
	 */
	
	public static void main(String[] args) {

		int i=12;
		
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		System.out.println("After loop");
		
		int j=12;
		do {
			
			System.out.println(j);
			j++;
		}
		
		while(j<=10);
		
		System.out.println("After loop");
		
	}

}

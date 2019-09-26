package Month1;

public class IfElseStatements {

	/*
	 *	If statement:
	 *		This is a decision making statement, which will execute its codes IF AND ONLY IF the condition is true. 
	 *			If(condition)
	 *			statement; //code
	 *
	 *	If-else statement:
	 *		In this the 'else' codes will be executed IF AND ONLY IF the condition is false.
	 *			If(condition)
	 *			statement;//code
	 *			Else
	 *			statement;//code
	 *
	 *	If-else-if:
	 *		This is combination of if-else statements.
	 *			If(condition)
	 *			statement;
	 *			Else if (condition)
	 *			statement;
	 *			Else if (condition)
	 * 			statement;
	 * 			Else
	 * 			statement;
	 * 
	 */
	
	
	public static void main(String[] args) {
	
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num>10)
			System.out.println(num+" is greater than 10");
		else if(num<10 && num>5)
			System.out.println(num+" between 5 and 10");
		else
			System.out.println(num+" is less than 10");		
	}
}
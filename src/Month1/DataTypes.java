package Month1;

public class DataTypes {

	public static void main(String[] args) {
		
		int i = 1234;							//stores integer
		float f = 1.234f;						//suffix with f	
		long l = 123456;						//long also stores integers, but can store over 10 digits
		double d = 1.2323232;					//similar to float without needing f
		boolean b = true;						//stores either true or false
		char c = 'a';							//stores only one character
		String s = "This is a Java Tutorial";	//String is a class in Java	
		
		//initialization stores data into the variable
		//declaration is stating the type of variable
		//Classes:  Capital letter  noun
		//Interfaces:  Capital letter adjective
		//Methods:  Lower case letter verb
		//Variables:  Lower case noun
		//Constants:  Caps lock with underscores
		
		
		DataTypes dt;
		
		String xyz = "string is here";			//String must contain capital S
		
		String abc = new String();
		abc = "Hello";
		
		String abc1 = "Hello";
		
		String s1 = "Way";
		String s2 = "2";
		String s3 = "Automation";
		
		//String + String = Concatenated String
		
		String s4 = s1+s2+s3;
		
		System.out.println(s4);
		System.out.println(s1+s2+s3);
		
		//int + int = int
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1+num2);	//Outputs:  15
		System.out.println(num1+num2+"after");	//Ouputs:  15after
		System.out.println("before"+num1+num2);	//Ouputs:  before105
		System.out.println("before"+(num1+num2));	//Ouputs:  before15
			
		
		/*
		 * 
		 * 12 + 45 //Operands
		 * 
		 * Unary Operator //single operand
		 * Binary Operator //two operands
		 * Ternary Operator //three operands
		 * 
		 * + //additive operators
		 * - //subtraction operators
		 * * // multiplication operators
		 */ // division operators
		 /* % remainder //operators
		 * ++ //increment operators
		 * -- //decrement operators
		 * ! //logical compliment operators
		 * == //Equal to
		 * != //Not equal to
		 * > //Greater than
		 * < //Less than
		 * >= //Greater than or equal to
		 * <= //Less than or equal to
		 * && //Conditional - And
		 * || //Conditional - Or
		 * ? //Ternary Operator
		 * 
		 * 
		 */
		
		
	}
	
}

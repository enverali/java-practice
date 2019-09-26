package Month1;

public class LearningMethods {
	
	
	
	int i; //declaration, initialize
	// display
	
	//Return type - dataType of the value returned by method
	//Example:  public Void display(), public String display(), public int display(), public Char display()
	
	//Keyword - return
	
	
	
	public int display() //declare to define
	{ //starts
		
		/*
		 * all definitions goes here
		 */
		
		return 10; // must be last statement
		
	} //ends

	public String display2()// only allowed to have 1 return types
	{
		
		String x = "Hello";
		return x; //must be last statement, only allowed to have 1 return statement
		
	}
	
	public void display3(int k, String a, char c, float f, boolean b)//can contain more than 0 parameter
	{
		
		
		System.out.println("Inside DIsplay Method");
	}
	
	
	public static void main(String[] args) {
		
		LearningMethods learn = new LearningMethods();  // Calls the method, learn method holding object - new LearningMethods
		learn.display();
		//learn.display3(k, a, c, f, b);
		
		LearningMethods learn1 = new LearningMethods();
		learn1.display();
		
		Home h = new Home(); // h - Object, i = 10
		h.i++; // Object1 - i = 11;
		
		Home h1 = new Home(); // h1 - Object 2, i = 10
		h1.i++; //Object 2 - i = 11;
		
		Home h2 = new Home(); // h2 - Object 3, i = 10
		System.out.println(h2.i); // 10
		//Static int = 10, displays 12
		
		/*
		 * Parameters vs Arguments
		 * Parameters - setting up the method
		 * Arguments - correct data for parameters
		 * 
		 * Calling a void method - a.eat();
		 * Calling a single argument method - a.eat()45);
		 * Calling a multiple argument method - a.eat(343,43,'c',"asdf");
		 */
		
		Calculator calc = new Calculator();
		int i = calc.getSum(10,4);
		
		System.out.println("The sum is : " + i);
		
		System.out.println(calc.getSub(10, 4));
		System.out.println(calc.getMult(10, 4));
		System.out.println(calc.getDiv(10, 4));
		
		/* Method Declaration
		 * 1. Access/ Nonaccess Modifier - public, private, protected
		 * 2. returnType - void
		 * 3. MethodName (parameter List) - go(int x), Buy(int shares)
		 * 4. {
		 * 5. //method body or statement block
		 * 6. }
		 * 
		 * public void go(int x)
		 * {
		 * System.out.println(x);
		 * }
		 * 
		 * class Stock
		 * {
		 * 	void Buy(int shares) {...}
		 * }
		 * 
		 */

				
	}
	
}

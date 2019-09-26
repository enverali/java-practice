package Month1;

/*
 * Calculator - addition, subtraction, multiply, division
 * 1. methods - addition, subtraction, multiplication
 * 2. return - int
 * 3. parameters - 2 int
 * 
 */

public class Calculator {
	
	public int getSum(int num1, int num2){ //parameters
		
		int result = num1+num2;
		return result;
		
	}
	
	public int getSub(int num1, int num2){
		
		return num1-num2;
		
	}

	public int getMult(int num1, int num2){
		
		return num1*num2;
		
	}
	
	public int getDiv(int num1, int num2){
		
		return num1/num2;
		
	}
	
}

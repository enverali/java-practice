package Month1;

public class Home {
	
	//3 types of variables (Instance, Local, Class Type)
	
	// Instance - anything declared in class body
	 
	static int i = 10; //instance variables, also called Global Variable - can be accessed anywhere throughout class
	// These variables belongs to the instance of this class
	
	//Local variables - anything declared in class body - can only be accessed within method
	
	/*referenceVariable.instanceVariable/method
	 * 
	 * For class Animal having eat() method:
	 *Animal a = new Animal();
	 *a.eat(); 
	 */
	
	public void go(){
		
		i = 356;
		int j = 234;
		
		System.out.println(j);
		
	}
	
	public void show() {
		
		i = 7438;
	}
	
}

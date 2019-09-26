package Month1;

public class MethodCalling {

	// Static component cannot call non-static component directly
	// static - static (allowed)
	// non static - non static, static (allowed)
	// non static - components cannot be called without making an object 
	//static is object oriented
	
	/*
	 * 1) Compiled
	 * 2) Executed in a JVM
	 * 
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		MethodCalling m = new MethodCalling();
		m.go1();	
		
		System.out.println("after calling go1 method");
		
		//go3();
		
		/*
		 * Inside Go1 Method
		 * Inside Go2 Method
		 * after calling go method
		 * after calling go1 method
		 */
	}
	
	public static void go3() {
		
		System.out.println("inside Go3 Method");
		
	}

	public void go() {
		
		System.out.println("Inside Go Method");
		go2();
		System.out.println("after calling go2 Method");
		
	}
	
	public void go1() {
		
		System.out.println("Inside Go1 Method");
		go2();
		System.out.println("after calling go method");
	}

	public void go2() {
	
	System.out.println("Inside Go2 Method");
	
}
	
}

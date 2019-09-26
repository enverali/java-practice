package Month1;

public class BreakandCont {
	
	public void go() {
		
		System.out.println("First");
		
		//break;  Break cannot be used outside of a loop/ switch
		//continue;  Continue cannot be used outside of a loop/ switch
		
		System.out.println("Last");
		
	}
	

	public static void main(String[] args) {

		/*
		 * 
		 * Break and Continue statements are used to change the normal flow of compound statements
		 * Break statement immediately jumps to the end of the compound statement
		 * Continue statement immediately jumps to the next iteration of the compound statement
		 * 
		 * 	for (int outer =0; outer <12; outer++)
		 * 	{
		 * 		if(outer==3)
		 * 			continue;
		 * 			System.out.println(outer);
		 * 		if(outer==7)
		 * 			break;
		 * 	}			
		 *  
		 *  Continue = continue to the next cycle
		 * 
		 */
		
		/* BreakandCont b = new BreakandCont();
		b.go(); */
		
		for(int i =0; i<10; i++) {
			
			if(i>=0 && i<=7)
				continue;
			
			/*if(i==5)
				break;*/
			
			System.out.println(i);
		}
		
		System.out.println("Outside the loop");
		
	}

}

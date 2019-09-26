package Month1;

public class NestedLoops {

	public static void main(String[] args) {

		/* 
		 * 
		 * Nesting of loops = placing one loop inside the body of another loop
		 * Outer loop will change only when inner loop is completely finished
		 * 
		 * 	for(int outer =0; outer <5; outer++)
		 * 	{
		 * 		for (int inner= 0; inner <3; inner++)
		 * 		{
		 * 			System.out.println("outer is " + outer + "inner is " + inner);
		 * 		} //inner loop ends
		 * 	} //outer loop ends
		 * 
		 * Execute while loop 3 times
		 * Execute for loop 4 times
		 * Execute do-while loop 5 times
		 * 
		 */
		
		int i=0;
		int count=0;
		
		while(i<3)
		{	
			for(int j=0; j<4; j++)
			{
				int k=0;
				do {
						System.out.println("i--->"+i+"  j--->"+j+"  k--->"+k);
						//System.out.println(count);
						k++;
						count++;
					}while(k<5);
					
			}
			i++;	
		}
	
		System.out.println("Total count is : " + count);
	}
	
}
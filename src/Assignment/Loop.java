package Assignment;

public class Loop {

	public static void main(String[] args) {
		
		/*
		 * int i=1; while(i < 10) { System.out.println("Hello " +i); i++; }
		 */		
		/*
		 * int k =12; do { System.out.println("Hello " +k); k++; }while(k < 10);
		 */
		
		/*
		 * for (int m =0; m < 10; m++) { System.out.println("Hello " +m); }
		 */
		
		/*
		 * int sum=0; int k=1233; while(k != 0) { sum =sum + k % 10; k = k / 10;
		 * 
		 * }System.out.println(sum);
		 */
		
		/* pattern3for(int row = 1; row <= 5; row++)
		{		
			for(int col =1; col <= 5-row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		//Pattern 2
		/*
		 * int n=5; for(int row = 1; row <= n; row++) { for(int col =row; col <= n;
		 * col++) { System.out.print("  "); } for(int j = 1; j <= row; j++) {
		 * System.out.print("* "); } System.out.println(); }
		 */
		//Pattern 1
		int n=5;
		 for(int row = 1; row <= n; row++) 
		 { 
			 for(int col = 1; col <= row; col++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}

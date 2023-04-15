package Assignment;

public class Swap {

	public static void main(String[] args) {
		//swaping value using third variable
		
		int i = 10;
		int j = 12;

		
		System.out.println("Value before swaping");
		System.out.println("Value of i: "+i);
		System.out.println("Value of j: "+j +"\n");
		
		
		int temp = i; //Taking third variable and storing i value, Now temp = 10
		i = j;        //assigning j value to i, Now i = 12  
	    j  = temp;    //assigning temp value to j, So j = 10
		
	    System.out.println("Value after swaping");
	    System.out.println("Value of i: "+i);
		System.out.println("Value of j: "+j);
		

	}

}

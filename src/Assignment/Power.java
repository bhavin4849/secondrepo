package Assignment;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int value;
		
		System.out.println("Enter Value: ");
		value = myObj.nextInt();   
	    
	    System.out.println("Square is: " + value * value);
	    System.out.println("Cube is: " + value * value * value);
	    System.out.println("Fourth Power is: " + value * value * value * value);
	    
	   
	    }
	}


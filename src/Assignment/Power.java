package Assignment;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int value;
		
		System.out.println("Enter Value: ");
		value = myObj.nextInt();   
	    
		int square = Power.square(value);
		int cube = Power.cube(value);
		int fourth = Power.fourthPower(value);
		
		System.out.println("Square is: " + square);
		System.out.println("Cube is: " + cube);
		System.out.println("4th powr is: " + fourth);
		
		myObj.close();
		

	}
	    static int square(int a){
	    	int sq = a*a;
	    	return sq;
	    }
	    static int cube(int a){
	    	int cube = a*a*a;
	    	return cube;
	    }
	    static int fourthPower(int a){
	    	int fourth = a*a*a*a;
	    	return fourth;
	    }
	    
 }




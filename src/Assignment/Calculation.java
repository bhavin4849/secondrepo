package Assignment;
import java.util.Scanner;

class Calculation {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int value1,value2;
		
		
		System.out.println("Enter Value1: ");
		value1 = myObj.nextInt();
		
		System.out.println("Enter Value2: ");
		value2 = myObj.nextInt();
		
		int addition = Calculation.add(value1,value2);
		int subtraction = Calculation.sub(value1,value2);
				
		
		System.out.println("Addition is: " + addition);
		System.out.println("subtraction is: " + subtraction);
		myObj.close();
	}
	static int add(int value1, int value2) {
		int addition = value1 + value2;
		return addition;
	}
	static int sub(int value1, int value2) {
		int subtract = value1 - value2;
		return subtract;
	}
	

}

package OOPs;

public class Blocks {

	public static void main(String[] args) {
		//Static variable
		//Static block
		//static method
		
		//instance variable
		//instance block
		//Non-static method
		
		System.out.println("Main method");
		Blocks b =new Blocks();
		Blocks.method1();
		System.out.println("static variable " +i);
		int n=20;
		System.out.println("instance variable " +n);
		b.method2();
	}
	static int i=10;
	static {
		System.out.println(i);
		System.out.println("Static Blocks");
	}
	{
		System.out.println("instance block");
	}
	static void method1()
	{
		System.out.println("static method");
		return;
	}
	void method2() 
	{
		int a = 20;
		System.out.println("static method");
		System.out.println("Local variable " +a);
		return;
	}
}

package OOPs;

public class StaticVariableScope {

	public static void main(String[] args) {
		System.out.println("Main Method");
		StaticVariableScope.methodDemo2();
		StaticVariableScope.methodDemo();
	}
	static int a =10;
	static 
	{
		int b =88;
		System.out.println(a);
		System.out.println("Static Block");
	}
	public static void methodDemo()
	{
		System.out.println("Static method 1");
	}
	public static void methodDemo2()
	{
		System.out.println("Static method 2");
	}
}

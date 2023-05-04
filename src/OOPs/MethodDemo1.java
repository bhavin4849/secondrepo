package OOPs;

public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo1.Demo();
		MethodDemo1 m =new MethodDemo1();
		m.Demo1();
	}
	static void Demo() //Static Method
	{
		System.out.println("Static Method");
	}
	public void Demo1()
	{
		System.out.println("Non-Static Method");
	}
}

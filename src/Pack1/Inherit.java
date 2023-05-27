package Pack1;

public class Inherit extends B {
	
	
	public static void main(String[] args) {

		/*
		 * B b = new B(); System.out.println(i); System.out.println(B.j); B.test2();
		 */
		Inherit i =new Inherit();
		i.display();
	}
	int i=50;
	public void display() {
		
		int i= 90;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println(j);
		test2();
		test1();
		test3();
		test4();
	}

}

class B extends  C{
	
	int i = 10;
	static int j = 20;

	public void test1() {
		System.out.println("Non-static Method");
	}

	public static void test2() {
		System.out.println("static Method");
	}
	
}

class C
{
	int k = 110;
	public void test3() {
		System.out.println("C class non static method");
	}
	public void test4() {
		System.out.println("C class static method");
	}
}
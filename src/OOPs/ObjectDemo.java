package OOPs;

public class ObjectDemo {

	public static void main(String[] args) {
	//used B and C class variables and methods
		B.sharedMethod();
		C.sharedMethod();
		int c = C.j;
		System.out.println(c);
		
		B b1 = new B();
		b1.CoreMethod();
		int p = b1.k;
		int l = B.m;
		System.out.println(p);
		System.out.println(l);
		
		
		C c1 = new C();
		c1.CoreMethod();
		int d = c1.i;
		System.out.println(d);
		
		
	}

}

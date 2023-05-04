package OOPs;

public class ParameterizedMethod {

	public static void main(String[] args) {
		
		int p = ParameterizedMethod.method1(12);
		System.out.println(p);
		ParameterizedMethod p1 = new ParameterizedMethod();
		int k = p1.method2(8);
		System.out.println(k);
	}
	
	static int method1(int i) {
		return i;		
	}
	public int method2(int j) {
		return j;		
	}
}



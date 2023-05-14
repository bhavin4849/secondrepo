package Pack1;

public class AccessModifier4 {

	int i;
	public int a;
	private int b;
	protected int c;
	protected void method() {}
	public static void main(String[] args) {
		AccessModifier4 m1 =new AccessModifier4();
		m1.method();	
		System.out.println(m1.b);
		
	}
	

}

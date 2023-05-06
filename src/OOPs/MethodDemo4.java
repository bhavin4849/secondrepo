package OOPs;

public class MethodDemo4 {

	public static void main(String[] args) {
	
	String a =	m1();
	System.out.println(a);
	
	MethodDemo4 m4 = new MethodDemo4();
	String s = m4.m2();
	System.out.println(s);
	
	}
	public static String  m1(){
		return "Static method with non parameterized";
		}
	
	 public String m2() {
		return "Non static method with non parameterized";
	}
	

}

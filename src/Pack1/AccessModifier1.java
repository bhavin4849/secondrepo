package Pack1;

public class AccessModifier1 {

	
	public static void main(String[] args) {
		//Non-static methods with access modifiers
		//public - visible to everyone
		//default - with in package
		//private - within class
		//protected
		
		AccessModifier1 am1 =new AccessModifier1();
		am1.method2();
	}
	 public void method1() {
	
	}
	 private void method2() {
		 
	 }
	 protected void method3() {
		 
	 }
	 void method4() {
	 }
	 

}

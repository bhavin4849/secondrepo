package Pack1;

class AccessModifier10 {

	public static void main(String[] args) {

		Test t = new Test();
		System.out.println(t.x);
		System.out.println(t.y);
	}
}
class Test{

	 protected int x, y; 
}

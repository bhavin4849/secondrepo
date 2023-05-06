package OOPs;

public class MethodDemo5 {

	public static void main(String[] args) {
		MethodDemo6 a1 = new MethodDemo6();

		int a = a1.add(a1.add(10,20),a1.add(30,40));
		System.out.println(a);

	}

}
class MethodDemo6{

	  public int add(int i , int j){

	    return i+j;

	  }

	}
package OOPs;

public class OverridingDemo {

	public static void main(String[] args) {
		Ferrari c = new Ferrari();
		c.brakes();

	}

}
class Cars
{
	public void brakes()
	{
		System.out.println("Car ---> Brakes");
	}
}

class Audi
{
	public void brakes()
	{
		System.out.println("Car ---> Audi Brakes");
	}
}

class Ferrari
{
	public void brakes()
	{
		System.out.println("Car ---> Ferrari Brakes");
	}
}
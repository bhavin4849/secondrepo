package Assignment;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 33;
		marks[1] = 34;
		marks[2] = 35;
		marks[3] = 36;
		marks[4] = 37;
		
			System.out.println(marks[0]);
			System.out.println("\n" + marks.length + "\n");
			
			for(int i=0; i < marks.length; i++)
			{
				System.out.println(marks[i]);
			}
			
			System.out.println("\n");
			
			for(int m : marks)
			{
				System.out.println(m);
			}
			
	
		
		
	}

}

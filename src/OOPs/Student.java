package OOPs;

public class Student {

	int rollnumber;
	String name;
	String subject;
	float marks;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.rollnumber = 1;
		st1.name = "Bhavin";
		st1.subject = "Java Programing";
		st1.marks =65;
		
		System.out.println("Student 1");
		System.out.println("Roll_Number: " + st1.rollnumber);
		System.out.println("Name: " + st1.name);
		System.out.println("Subject: " + st1.subject);
		System.out.println("Marks: " + st1.marks);
		System.out.println('\n');
		
		Student st2 = new Student();
		st2.rollnumber = 2;
		st2.name = "Raj";
		st2.subject = "Java Programing";
		st2.marks =70;
		
		System.out.println("Student 2");
		System.out.println("RollNumber: " + st2.rollnumber);
		System.out.println("Name: " + st2.name);
		System.out.println("Subject: " + st2.subject);
		System.out.println("Marks: " + st2.marks);
		
	}

}

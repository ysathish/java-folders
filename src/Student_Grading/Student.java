package Student_Grading;

public class Student {
	String name;
	int rollNumber;
	int marks;
	
	
	public Student(String name, int rollNumber, int marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	void grades() {
		
		 if(marks>=75 ) {
			System.out.println("your grade is :A");
			
		}
		else if(marks>=55) {
			System.out.println("your grade is :B");
		 
	 } else if (marks >= 35) {
         System.out.println("Your grade is: C");
     } else {
         System.out.println("Failed");
     }
	}
	


	public static void main(String[] args) {
		Student s=new Student("Sathish",6453,100);
		s.grades();
		
	}

}

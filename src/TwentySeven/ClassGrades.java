package TwentySeven;

public class ClassGrades {
	public void gradingSystem(int marks) {
		if(marks<=100 && marks>=80)
			System.out.println("Total marks is :"+marks+ " and your grade is A");
		else if(marks<80 && marks>=60 )
			System.out.println("Total marks is :"+marks+ " and your grade is B");
		else if(marks<60 && marks>=50)
			System.out.println("Total marks is :"+marks+ " and your grade is C");
		else if(marks<50 && marks>=45)
			System.out.println("Total marks is :"+marks+ " and your grade is D");
		else if(marks<45 && marks>=25)
			System.out.println("Total marks is :"+marks+ " and your grade is E");
		else
			System.out.println("Total marks is :"+marks+ " and you are failed");
	}
	public static void main(String[] args) {
		new ClassGrades().gradingSystem(1001);
	}

}

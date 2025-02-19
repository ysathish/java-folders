package TwentySeven;

public class Exam {
	public void attendance(double held,double attend) {
		 double percentage = (attend / held) * 100;
		 if(percentage>=75) 
			 System.out.println("your attendance is "+percentage+"% so you can write the exam");
		 else 
			 System.out.println("your attendance is "+percentage+"% so you can't write the exam");		
	}
	public static void main(String[] args) {
		new Exam().attendance(100, 74);
		
	}

}

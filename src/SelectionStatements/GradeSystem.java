package SelectionStatements;

public class GradeSystem
{
	public void m1(int marks) 
	{
		switch(marks/10)
		{
		case 10,9:
			System.out.println("Grade A");
		break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5,4,3,2,1:
			System.out.println("Grade F");
		break;
		default:
			System.out.println("Invalid Grade");
		}
	}
	public static void main(String[] args) {
		new GradeSystem().m1(35);
	}
}

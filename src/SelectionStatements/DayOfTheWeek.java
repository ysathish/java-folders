package SelectionStatements;

public class DayOfTheWeek {
	public void m1(int day) {

		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Invalid day");
		}
	}
	public static void main(String[] args) {
		new DayOfTheWeek().m1(4);
		new DayOfTheWeek().m1(8);

	}

}

package SelectionStatements;

public class Swit {
	public static void main(String[] args) {
		int number=5544;
		switch(number%2) {
		case 0:
			System.out.println(number+" is even");
			break;
		default:
			System.out.println(number + " is not even");
		}
	}
}



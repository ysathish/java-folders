package TwentySeven;

public class GreatestNumber {
	public GreatestNumber(int a,int b) {
		if(a>b) 
			System.out.println("a is greater than b");
		else 
			System.out.println("b is greater than a");
	}
	public static void main(String[] args) {
		new GreatestNumber(15,10);
		}
}

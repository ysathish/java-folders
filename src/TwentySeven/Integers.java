package TwentySeven;

public class Integers {
	public static void main(String[] args) {
		int n=4;
		if(n%2==1)
			System.out.println("Given number is :"+n+" Weird");
		else if(n%2==0 && (n>=2 && n<=5))
			System.out.println(" even 2 to 5 Not Weird");
		else if(n%2==0 && (n>=6 && n<=20))
			System.out.println("Even 6 to 20  Weird");
		else if(n%2==0 && n>20)
			System.out.println("above 20 not Weird");
		else
			System.out.println("hello");
		
	}

}

package TwentySeven;

public class SqareOrRectangle {
	public void m1(int lenght,int breadth) {
		if(lenght==breadth)
			System.out.println("given lenght :"+lenght+" and breadth :"+breadth+" are sqaure");
		else 
			System.out.println("given lenght :"+lenght+"and breadth :"+breadth+" are rectangle");
	}
	public static void main(String[] args) {
		new SqareOrRectangle().m1(11,10);
	}

}

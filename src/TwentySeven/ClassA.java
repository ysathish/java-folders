package TwentySeven;

public class ClassA {
	
	void m1(int x, int y ,int z) {
		if(x>y) {
			if(x>z)
				System.out.println(x);
			else
				System.out.println(z);
		}
		else {
			if(y>z) 
				System.out.println(y);
				
			else
				System.out.println(z);
		}
	}
	public static void main(String[] args) {
		new ClassA().m1(6, 05, 03);
	}

}

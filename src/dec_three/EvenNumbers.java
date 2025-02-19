package dec_three;
//Print 1 to 100 even numbers and count using loops

public class EvenNumbers {
	void m1(int x,int y) {
		int  count=0;
		for(;x<=y;x++) {
			if(x%2==1) {
				System.out.println("even numbers are:"+x);
				count++;
			}
			
		}
		System.out.println("the count of even numbers are :"+count);

	}
	public static void main(String[] args) {
		new EvenNumbers().m1(1, 100);

	}

}

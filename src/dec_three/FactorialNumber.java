package dec_three;

public class FactorialNumber {
	void m1(int n) {
		int fact=1;
		for(;n>0;n--) {
			fact=fact*n;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		new FactorialNumber().m1(5);
	}

}

package dec_four;

public class ClassA {
	void m1() {
		System.out.println("m1() called");
		for(int i=1;i<=10;i++) {
			{
				if(i==5) {
					continue; // true value will not return but remaining values are printed
					//	break; // came out from loop
					//return;// unreachable code
				}
				System.out.println("i value:"+i);
			}
		}
		System.out.println("Compiler came out from loop");
	}
	public static void main(String[] args) {
		new ClassA().m1();
	}

}

package dec_three;
//Print 1 t o 100 without loops
public class ClassB {
	static int n=1;
	void m1() {
		if(n<=100) {
			
			System.out.println(n);
			n++;
			new ClassB().m1();//Recursion means the m() called by its self 
			}
		
		
	}
	public static void main(String[] args) {
		new ClassB().m1();
	}

}

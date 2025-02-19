package Twenty_five.pack2;

public class Class_Methods {
	void m1() {
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");

}
	int m2(int a ,int b ,int c) {
		System.out.println(new Class_Methods().m5(100, "java is awesome"));
		return a-b;
	}
	String m3(String s, int b, int c) {
		System.out.println(b+c);
		return s;
		
	}
	int m4(int a ,int b) {
		System.out.println(b);
		System.out.println(new Class_Methods().m2(50, 50, 50));
		return b+10;
	}
	String m5(int a, String s) {
		System.out.println(a+a);
		System.out.println(new Class_Methods().m3("hai", 15, 10));
		return s;
	}
	public static void main(String[] args) {
		Class_Methods methods=new Class_Methods();
		System.out.println("Start");
		int result=methods.m4(20, 10);
		System.out.println(result);
		methods.m1();
		
		
	}
}

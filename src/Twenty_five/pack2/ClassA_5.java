package Twenty_five.pack2;

public class ClassA_5 {
	String m1(int a,int b) {
		System.out.println(10);
		System.out.println(54+a-b);
		int result=new ClassA_5().m5();
		System.out.println(result);
		return "java";
		
	}
	int m2(int a) {
		return a;
		
	}
	void m3() {
		System.out.println("start");
		System.out.println(new ClassA_5().m4());
		System.out.println(40);
	}
	String m4() {
		System.out.println("today is friday");
		return new ClassA_5().m1(10,20);
	}
	int m5() {
		System.out.println(99);
		return new ClassA_5().m2(10);
	}
	
	public static void main(String[] args) {
		ClassA_5 aobj=new ClassA_5();
		aobj.m3();
		
	}

}

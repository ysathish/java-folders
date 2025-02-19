package Twenty_five.pack2;

public class ClassA {
	String m1(int x,String s) {
		System.out.println(x);
		System.out.println(s);
		return s+" is awesome";
	}
	public static void main(String[] args) {
		ClassA aobj1=new ClassA();
		String s=aobj1.m1(10,"java");
		System.out.println(s);
		aobj1.m1(50, "hey you");
		System.out.println(aobj1.m1(1000, "Java"));
		
		
	}

}

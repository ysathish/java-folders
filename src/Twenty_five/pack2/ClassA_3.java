package Twenty_five.pack2;

public class ClassA_3 {
	int m1(int a,int b, char c) {
		System.out.println(c);
		int result=new ClassA_3().m2("java",100,'y');
		return 10+a+result;
	}
	int m2(String s,int a,char c) {
		System.out.println(s);
		System.out.println(c);
		return 20;
	}
	public static void main(String[] args) {
		ClassA_3 aobj=new ClassA_3();
		int result=aobj.m1(10, 20, 'x');
		System.out.println(result);
		
	}

}

package Twenty_five.pack2;

public class ClassA_4 {
	int m1() {
		System.out.println("start");
		
		return new ClassA_4().m2()+10;
	}
	int m2() {
		System.out.println("End");
		return 20;
	}
	public static void main(String[] args) {
		ClassA_4 aobj=new ClassA_4();
		int result=aobj.m1();
		System.out.println(result/10);
		
		
	}

}

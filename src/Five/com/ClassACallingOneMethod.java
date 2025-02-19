package Five.com;

public class ClassACallingOneMethod {
	
	
	public char m1(int a) {
		return 1;
		
	}
public int m2(int a,int b) {
	return new ClassACallingOneMethod().m1(1);
		
	}
public int m3(int a,int b,int c) {
	return new ClassACallingOneMethod().m2(1, 2);
	
}
public boolean m4(int a,int b,int c,int d) {
	
	return new ClassACallingOneMethod().m3(1, 2, 3)!=4;
	
}

	public static void main(String[] args) {
		ClassACallingOneMethod aobj1=new ClassACallingOneMethod();
		boolean method4=aobj1.m4(1, 02, 3, 4);
		System.out.println(method4);
		
	}

}

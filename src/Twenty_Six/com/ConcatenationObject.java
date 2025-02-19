package Twenty_Six.com;

public class ConcatenationObject {
	public String m1() {
		return new ConcatenationObject().m3(new ConcatenationObject().m2())+new ConcatenationObject().m4("here");
	}
	public int m2() {
		System.out.println(25);
		return 25+5;
	}
	public String m3(int a) {
		System.out.println(15);
		return "is";
		
	}
	public String m4(String s) {
		System.out.println(45);
		return " awesome";
	}
	
	
	public static void main(String[] args) {
		ConcatenationObject t=new ConcatenationObject();
		System.out.println("java "+t.m1());
				
				
				
			
	}

}

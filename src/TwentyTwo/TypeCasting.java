package TwentyTwo;
public class TypeCasting {
	public void implicit() {
		byte b=10;
		System.out.println("byte value is :"+b);
		short s=b;
		System.out.println("short value is :"+s);
		s++;
		int i=s++;
		System.out.println("int value is i:"+i);
		System.out.println("short value is s:"+s);
		long l=i;
		System.out.println("long value is l:"+ --l);
		float f=l;
		System.out.println("float value is f:"+(f+b));
		double d=(--f);
		System.out.println("double value is d:"+d);
		show();
		if(!(d==f)) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		}
	public void explicit() {
		}
	public static void show() {
		char c='A';
		int a=c;
		System.out.println(a);
		TypeCasting s=new TypeCasting();
		System.out.println(s.m1());
		}
	public String m1() {
		String s="Implicit casting is done by the compiler automatically";
		return s;
		}
	public static void main(String[] args) {
		TypeCasting t=new TypeCasting();
		t.implicit();
		}
	}

package design_patterns;

interface B
{
	void m1();
}
public class mainClass {

	public static void main(String[] args) {
		SingleTonClass s=SingleTonClass.getClass("hai");
		s.m1();
		B m= ()->System.out.println("hai"); 
		m.m1();
		
				
	}

}

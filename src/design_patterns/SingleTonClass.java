package design_patterns;

public class SingleTonClass {
	private static  SingleTonClass singleton;
	public SingleTonClass() {
		
	}
	public static  SingleTonClass getClass(String name)
	{
		if(name!=null)
		{
			singleton=new SingleTonClass();
		}
		
		return singleton;
	}
	public void m1()
	{
		System.out.println("hai java");
	}

}

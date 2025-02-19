package dec_three;

public class Tables {
	void m1(int a,int b)
	{
		for(;a<=b;a++)
		{
			for(int i=1;i<=b;i++) {
				System.out.println(a+" * "+i+" = "+(a*i));
			}
			System.out.println("-----------------");
		}
	}
	public static void main(String[] args) {
		new Tables().m1(2,10);

	}

}

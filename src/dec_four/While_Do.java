package dec_four;

public class While_Do {
	void m1() {
		int i=0,j=0;
		while(i<3)
		{
			do
			{
				j++;
				System.out.print(j+" ");
			}
			while(j<2);
			i++;
		}
	}
	public static void main(String[] args) {
		new While_Do().m1();
	}

}

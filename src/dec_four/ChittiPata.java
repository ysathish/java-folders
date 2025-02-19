package dec_four;

public class ChittiPata {
	public void m1(int m)
	{
		int a=5000,b=70000;
		for(int i=1;m>i;i++) {
			if(a<6000) {
			a+=100;
			b+=1500;
			}
			else if(a>=6000) {
				a+=200;
				b+=3000;

			}
		}
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChittiPata().m1(15);

	}

}

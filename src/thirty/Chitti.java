package thirty;

public class Chitti {
	void m1(int m) {
		int pay=5000;
		int amount=70000;
//		if(m<=15) {
//			System.out.println(pay+" "+amount);
//		 if(m>1) {
//			pay+=100;
//			amount+=1500;
		for(;m>1;pay+=200,amount+=3000) {
			System.out.println(pay+" "+amount);
		}
			for(;pay<6000 && m<10;pay+=100,amount+=1500) {
				
				
				System.out.println(pay+" "+amount);
			}
//		}
//		 else {
				
				
				
//			}
//		}
		
			
		}
		public static void main(String[] args) {
			new Chitti().m1(10);

		}

	}

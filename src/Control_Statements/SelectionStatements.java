package Control_Statements;

public class SelectionStatements {
	void m1(int i) {
		System.out.println("m1()");
		if(!(i<='A')) {//!(97<=65)==>!(false)===>if(true)===> block executed
			System.out.println("if block executed");

		}
		System.out.println("m1() execution completed");

	}
	void m2(int i) {
		System.out.println("m2()");
		if(i<=5) 
			//			int i=5; c.e because we should not write any declarative statements in this line 
			System.out.println("if block executed in m2()");
		System.out.println("m2() execution completed");

	}
	void m3(int i,int num) {

		System.out.println("m3()");
		if(i<=5)
		{
			if(num%2==0) {
				System.out.println(num+" is even");

			}
			else {
				System.out.println(num+ "is odd");
		}
		}
			System.out.println("m() execution completed");
		
	}
		void m4(int i) {

			System.out.println("m4()");
			if(i<=5 ){
				System.out.println("if block executed");
				System.out.println("hi");
			}
			else
				System.out.println("else block executed");
			System.out.println("hello");
			System.out.println("m() execution completed");
		}
		void m5(int i) {

			System.out.println("m5()");
			if(false) {
				System.out.println("if block executed");
			}
			else {
				System.out.println("else block executed");
			}
			System.out.println("m() execution completed");
		}
		void m6(int num) {
			System.out.println("m6()");
			if(num>0) {
				System.out.println(num+ "is positive");
			}
			else if(num<0) {
				System.out.println(num +"is negative");
				
			}
			else {
				System.out.println(num+": is equal to zero");
			}
			System.out.println("m() execution completed");
		}
		public static void main(String[] args) {
			SelectionStatements s=new SelectionStatements();
			s.m1('a');
					s.m2(50);
					s.m3(1,9);
					s.m4(1);
					s.m5(1000);
					s.m6(0);



		}

	}

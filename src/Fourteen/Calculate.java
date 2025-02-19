package Fourteen;

public class Calculate {
	Calculate(){
		System.out.println("Default Constructor"+10);
		
	}
	Calculate(int i,String s){
		
		System.out.println("i value of param Constructor:"+i);
		System.out.println("s value of param constructor:"+s);
		
		
	}
	Calculate(String s ,int i){
		System.out.println("i value of param Constructor:"+s);
		System.out.println(i*2+100);
		
	}
	
	int calulates(int x) {
		System.out.println("x value:"+x);
		return x*3;
	}
	
	public static void main(String[] args) {
		int result=new Calculate().calulates
				(new Calculate(new Calculate().evaluate(6),"hai").compute(10,new Calculate().process(8,4))
						+new Calculate("hai",20).analyze(5,3,new Calculate().evaluate(6)));
		System.out.println(result);
		
	}
	 int compute(int a, int b ) {
		// TODO Auto-generated method stub
		 System.out.println("Inside compute:"+a+","+b);
		return a+b;
	}
	 int analyze(int p, int q, int r ) {
		// TODO Auto-generated method stub
		return p*q+r;
	}
	 int process(int m, int n) {
		// TODO Auto-generated method stub
		 System.out.println("inside process"+m+","+n);
		return m-n;
	}
	 int evaluate(int x) {
		// TODO Auto-generated method stub
		 System.out.println("inside x value:"+x);
		return x/2;
	}

}

package Fourteen;

public class ClassA {
	ClassA(){
		System.out.println("sunday");
		ClassA obj=new ClassA(10);
		System.out.println("tuesday");
		String s=obj.display("Challange Accepted");
		System.out.println(s);
	}
	
	 String display(String string) {
		// TODO Auto-generated method stub
		 System.out.println("In the next statement iam returning string statement");
		return string;
	}

	public ClassA(int temp) {
		System.out.println("saturday");
		ClassA aobj=new ClassA(10,20);
		int a =aobj.m1()+temp;
		System.out.println("===>:"+(a+aobj.m2()));
		System.out.println("monday");
		// TODO Auto-generated constructor stub
	}

	 int m2() {
		// TODO Auto-generated method stub
		return 99;
	}

	 int m1() {
		// TODO Auto-generated method stub
		return 100;
	}

	public ClassA(int data, int temp) {
		System.out.println("thursday");
		System.out.println("===>:"+(data+new ClassA("hai").m2()-temp));
		// TODO Auto-generated constructor stub
	}

	public ClassA(String string) {
		System.out.println(string);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new ClassA();
		System.out.println("output verified:");
	}

}

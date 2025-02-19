package Twenty_Eight;

public class Switch_Case {
	public void m1(String name,char gender , int age) {
		System.out.println("m1() started\n");
		switch(gender) {
		case 'm','M':
			System.out.println("user is Male");
			if(age>=29)
				System.out.println(name+" your eligible");
			else
				System.out.println(name+" you need to wait for "+(29-age)+" years");
			break;
			case 'f','F':
				System.out.println("User is Female");
			if(age>=26)
			    System.out.println(name+" your are eligible");
			else
				System.out.println(name+" your need to wait for"+(26-age)+" years");
			break;
			default:
				System.out.println("Invalid input");
				}
		System.out.println("\ncompiler came out from switch case");
				}
	public static void main(String[] args) {
		new Switch_Case().m1("sathish",'s',24);
		}
}

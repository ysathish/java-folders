package Student_Grading;

public class Inc {
	void m1() {
	
int a=10;
int b=10;
int c =a++ + ++b;
int sum=++a + ++b + ++c;
System.out.println(sum);
	}
public static void main(String[] args) {
	new Inc().m1();
	
}
}


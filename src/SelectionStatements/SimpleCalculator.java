package SelectionStatements;
public class SimpleCalculator
{
	public void m1(int a, int b, char c) 
	{
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}
	public static void main(String[] args) {
		new SimpleCalculator().m1(10, 10, '@');
	}
}




package SelectionStatements;

public class Vowels {
	public void m1(char c) {
		switch(c) {
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("Its Vowel");
		break;
		default:
			System.out.println("non Vowel");
		}
	}

	public static void main(String[] args) {
		new Vowels()
		.m1('@');		
	}
}

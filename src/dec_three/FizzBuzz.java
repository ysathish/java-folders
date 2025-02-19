package dec_three;

public class FizzBuzz {
	public static void main(String[] args) {
		int n=1;
		for(;n<=15;n++) {
			  if(n%3==0 && n%5==0) {
					System.out.println("fizz Buzz");
				
				}
			  else if(n%3==0) {
				System.out.println("Fizz");
			}
			else if(n%5==0) {
				System.out.println("buzz");
				
			}
			
			 
			else
				System.out.println(n);
		}
		
	}

}

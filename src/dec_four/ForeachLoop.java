package dec_four;

public class ForeachLoop {
	public void m1() {
		System.out.println("m1() called\n");
		int arr[]= {10,20,30,40,50};
		System.out.println(arr[2]+" \n");
		System.out.println("using for loop to retrive the data from array");
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("\nusing for-ecah loop to retrive data from an array");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		new ForeachLoop().m1();
		
	}

}

package TwentySeven;

public class Shop {
	public void  billing(int units) {
		int final_bill=units*100;
		if(final_bill>=1000) {
			int discount=(final_bill/100)*10;
			System.out.println("your total bill is:"+(final_bill-discount));
			System.out.println("congratulatins !! you saved :"+discount+" discount");
			System.out.println("thank you visit again");
		}
		else {
			System.out.println("your total bill is :"+final_bill);
			System.out.println("purchase more :"+(1000-final_bill));
			System.out.println("To recieve a discount of 10% in the total bill");
		}
			
	}
public static void main(String[] args) {
	new Shop().billing(1);	
}
}

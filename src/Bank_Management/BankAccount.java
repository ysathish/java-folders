package Bank_Management;

public class BankAccount {
Long accountNumber;
String accountHolderName;
float balance;
public BankAccount(Long accountNumber, String accountHolderName, float balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}
void deposit(float amount) {
	if(amount>0) {
		balance +=amount;
		
		System.out.println("diposited :"+amount+" "+"your final balanance is :"+balance);
	}
	else {
		System.out.println("Invalid deposit amount");
	}
	
}
void withdraw(float amount) {
	if(amount>0 && amount<=balance) {
		balance -=amount;
		System.out.println("withdraw:"+amount+" "+"your final balanance is :"+balance);
	}
 else if (amount > balance) {
    System.out.println("Insufficient balance!");
} else {
    System.out.println("Invalid withdrawal amount!");
}
		
	}
	

void checkBalance() {
	System.out.println("your balance is :"+balance);
	
}
public static void main(String[] args) {
	BankAccount bankObj=new BankAccount(62223190188L,"sathish yannapu",1000.94f); 
	bankObj.checkBalance();
	bankObj.deposit(-500.5f);
	bankObj.withdraw(12000.0f);
	
	
	
}
}



package TwentySeven;

public class Upper_Lower {
public void checkValues(char values) {
	if(values>='A' && values<='Z') 
		System.out.println("The given value  :"+values +" is Upper Case");
	else if(values>='a' && values<='z')
		System.out.println("The given value :"+values+ " is Lower Case");
	else 
		System.out.println("the give  values :"+values+" is not a letter");
	}
public static void main(String[] args) {
	new Upper_Lower().checkValues('c');
}
}

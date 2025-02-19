package TwentySeven;

public class Company {
	public void bonusSalary(int salary,int year) {
		int service_year=2024-year;
		int bonus=(salary/100)*5;
		if(service_year>5) {
			System.out.println("Congratulations !!! you completed more than 5 years .Here you got 5% bonus."+bonus);
			System.out.println("your updated salary is :"+(salary+bonus) );
		}
		else {
			System.out.println("your salary is :"+salary);
		}
		
	}
	public static void main(String[] args) {
		new Company().bonusSalary(15000, 2018);
	}

}

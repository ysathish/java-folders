package dec_five;

import java.util.Scanner;

public class ClassA {
	void empDetails(String empName, int empId, double empSal, String empAddress) {
		System.out.println("Details entered by the user\n");
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Id : " + empId);
		System.out.println("Emp Salary : " + empSal);
		System.out.println("Emp Address : " + empAddress + " ");
	}

	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp Name : ");
		String name = sc.next();
		System.out.println("Enter EmpId : ");
		int id = sc.nextInt();
		System.out.println("Enter Empsal : ");
		double sal = sc.nextDouble();
		System.out.println("enter emp Address : ");
		String address = sc.next();
		sc.nextLine();
		address = sc.next();
		sc.nextLine();
		address = sc.next();
		sc.close();
		aobj.empDetails(name, id, sal, address);
	}
}

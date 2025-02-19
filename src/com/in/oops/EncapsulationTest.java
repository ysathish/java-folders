package com.in.oops;

import java.util.Scanner;

public class EncapsulationTest {

	public static void main(String[] args) {
		EncapsulationDemo demo=new EncapsulationDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("enter student age");
		 int age=sc.nextInt();
		 System.out.println("enter student name");
		 String name=sc.next();

		   demo.setStudentId(id);
		   demo.setStudentAge(age);
		   demo.setStudentName(name);
		 System.out.println("student id is:"+demo.getStudentId());
		 System.out.println("student age is:"+demo.getStudentAge());
		 System.out.println("student name is:"+demo.getStudentName());
		 sc.close();
		 
		
		// TODO Auto-generated method stub

	}

}

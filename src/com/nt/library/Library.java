package com.nt.library;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
	static String lBooks[];
	 String book[];
	
	
	public void addBook(String title[]) {
		 this.book=title;
		 System.out.println(Arrays.toString(title));
		
	}
public void addBook(String title,String author) {
//	this.book=title;
		
	}
public void borrowBook(String title) {
//	if(this.book==title) {
//		System.out.println("the book is available");
//	}
//	else 
//		System.out.println("the book is not available");
//	
}
public void borrowBook(String title,String borrower) {
//	if(this.book==title) {
//		System.out.println("the book is available");
//	}
//	else 
//		System.out.println("the book is not available");
	

	
}
public void returnBook(String title) {
//	if(this.book==title) {
//		System.out.println("ok");
//	}
//	else 
//		System.out.println("the book is not matching");
	
}
	

public void displayAvailableBooks() {
	System.out.println(book);
	
}

	public static void main(String[] args) {
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many books you want to add:");
        String books[]=new String[Integer.parseInt(sc.nextLine())];
          
        
		for(int i=0;i<=books.length-1;i++) {
			books[i]=sc.next();
			
		}
		
		library.addBook(books);
		library.displayAvailableBooks();
		System.out.println(Arrays.toString(lBooks));
		
		
		
		

	}

}

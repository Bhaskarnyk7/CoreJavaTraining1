package com.evergent.corejava.interface1;
public class Bookimpl implements Book,NewBook {
	
	public void bookTitle() {
		System.out.println("book titile is "+bookname);
	}
	public void bookAuthor() {
		System.out.println("book Author Ram");
	}
	public void bookPrice() {
		System.out.println("book price 500");
	}
	public void addNewBook() {
		System.out.println("new Book is DBMS");
	}
	
	public void show() {
		System.out.println("local show method");
	}
	public static void main(String[] args) {
		// we cannot create obj for interface, but can create reference
		// Book m=new Book();    CTE
		
		//Book m=new Bookimpl();    // able to create reference for interface and we can call only interface methods 
		//m.show();                 // not able to call non interface methods by reference 
		
		Bookimpl k=new Bookimpl();
		k.bookTitle();
		k.bookAuthor();
		k.bookPrice();
		k.addNewBook();
		k.show();
	}

}

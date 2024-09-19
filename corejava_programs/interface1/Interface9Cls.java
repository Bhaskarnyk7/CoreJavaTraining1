package com.evergent.corejava.interface1;

public class Interface9Cls implements Book,Interface9{
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("interface9 method");
	}
	@Override
	public void bookTitle() {
		// TODO Auto-generated method stub
		System.out.println("booktitle");
	}
	@Override
	public void bookAuthor() {
		// TODO Auto-generated method stub
		System.out.println("Author");	
	}
	@Override
	public void bookPrice() {
		// TODO Auto-generated method stub
		System.out.println("500");
	}
	public static void main(String[] args) {
		Interface9Cls k=new Interface9Cls();
		k.abc();
		k.bookAuthor();
		k.bookTitle();
		k.bookPrice();
		
	}
}

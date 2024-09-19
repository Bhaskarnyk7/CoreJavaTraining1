package com.evergent.corejava.ExceptionHandling;

public class Exception8throws {
	String name=null;
	
	public void myData() throws NullPointerException{
		
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
		
		
	}
	
	public void myInfo() {
		myData();
		System.out.println("my info method");
	}
	public static void main(String[] args) {
		try {
			Exception8throws k=new Exception8throws();
			k.myInfo();
		}
		catch(Exception e) {
			System.out.println("i can handle "+e);
		}
	}
}

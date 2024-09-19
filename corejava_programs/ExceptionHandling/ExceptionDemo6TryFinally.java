package com.evergent.corejava.ExceptionHandling;

// try with  one catch or finally
public class ExceptionDemo6TryFinally {
	String name="abc";
	
	
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		
		}
		finally {
			System.out.println("finally block");
		}
		
	}
	public static void main(String[] args) {
		ExceptionDemo3 k=new ExceptionDemo3();
		k.myData();
	}
}

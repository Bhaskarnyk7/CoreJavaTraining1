package com.evergent.corejava.ExceptionHandling;

// point 17 should follow exception hierarchical
public class ExceptionDemo4 {
	String name="abc";
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
			System.out.println(10/k);
		}
		catch(Exception e) {                          
			System.out.println("i can handle "+e);
		}
		catch(ArithmeticException e) {    
			System.out.println("i can handle "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 k=new ExceptionDemo3();
		k.myData();
	}
}

package com.evergent.corejava.ExceptionHandling;

// point 13 finally block always executed

public class EceptionDemo5finally {
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
		finally {
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		EceptionDemo5finally k=new EceptionDemo5finally();
		k.myData();
	}
}

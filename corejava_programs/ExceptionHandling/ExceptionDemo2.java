package com.evergent.corejava.ExceptionHandling;



public class ExceptionDemo2 {
	String name="abc";
	
		public void myData() {
			try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
	}
	
	public static void main(String[] args) {
	ExceptionDemo2 k=new ExceptionDemo2();
	k.myData();
	}
}

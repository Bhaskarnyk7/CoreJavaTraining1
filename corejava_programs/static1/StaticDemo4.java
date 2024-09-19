package com.evergent.corejava.static1;

public class StaticDemo4 {

	static String cname="india";
	String name="ram";
	
	public static void abc() {
		System.out.println("mydata");
		
	}
	
	public void show() {
		// able to call static methods in non static methods
		abc();
		System.out.println("non static method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc();
		System.out.println(StaticDemo4.cname);
		StaticDemo4 e=new StaticDemo4();
		e.show();

	}
}

package com.evergent.corejava.static1;



public class StaticDemo2 {
	static String cname="india";
	String name="ram";
	
	public static void abc() {
		System.out.println("mydata");
		
	}
	
	public void show() {
		System.out.println("non static method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc();
		show();
		System.out.println(StaticDemo2.cname);

	}

}

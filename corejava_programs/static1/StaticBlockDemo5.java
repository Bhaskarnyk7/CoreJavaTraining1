package com.evergent.corejava.static1;

public class StaticBlockDemo5 {
	
	static int a;
	
	static {
		a=10;
		System.out.println("one");
	}
	public static void myData() {
		System.out.println("data");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myData();
	}

}

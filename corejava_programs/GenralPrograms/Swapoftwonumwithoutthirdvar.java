package com.evergent.corejava.GenralPrograms;

public class Swapoftwonumwithoutthirdvar {
	public static void main(String[] args) {
		int a=10,b=20;
		
		System.out.println("bef swap");
		System.out.println(a);
		System.out.println(b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swap");
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
}

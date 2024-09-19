package com.evergent.corejava.logicalprograms;

public class Swapof2noWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		System.out.println("before swap");
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

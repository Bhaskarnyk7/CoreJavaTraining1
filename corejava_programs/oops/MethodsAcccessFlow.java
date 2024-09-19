package com.evergent.corejava.oops;

public class MethodsAcccessFlow {
	
	public void show1() {
		System.out.println("no paramaters and no arguments");
		
	}
	public void show2(int a,int b) {
		System.out.println(a+b);
	}
	public int show3() {
		return 300;
	}
	
	public int show4(int a,int b) {
		return a*b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAcccessFlow k=new MethodsAcccessFlow();
		k.show1();
		k.show2(10, 20);
		System.out.println(k.show3());
		System.out.println(k.show4(10,20));
		

	}

}

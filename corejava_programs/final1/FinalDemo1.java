package com.evergent.corejava.final1;

public class FinalDemo1 {
	final int age=10;
	
	public void display() {
		//cannot modify final var
		age=20;
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 k=new FinalDemo1();
		k.display();
	}

}

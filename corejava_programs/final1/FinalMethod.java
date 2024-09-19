package com.evergent.corejava.final1;

class abcd{
	 final int abc() {
		 return 10;
	 }
}

public class FinalMethod extends abcd{
	//cannot override final methods
	final int abc() {
		 return 20;
		System.out.println("final subcls method");
	}

	public static void main(String[] args) {
		
		 FinalMethod k=new FinalMethod();
		 k.abc();
	}
}


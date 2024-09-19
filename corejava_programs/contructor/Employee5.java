package com.evergent.corejava.contructor;

//calling one constructor in another
public class Employee5 {				
	Employee5(){
		System.out.println("default constructor");
	}
	Employee5(int a){
		this();
		System.out.println("2nd constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 e=new Employee5(10);

	}

}

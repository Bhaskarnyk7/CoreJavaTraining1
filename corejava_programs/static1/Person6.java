package com.evergent.corejava.static1;

public class Person6 {
	static String name="ram";  //step3
	int age=21;
	String address="hybd";
	
	public void display() {
		// able to access static var in non static methods
		name="bhaskar";
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("address "+address);
	
	}

	public static void main(String[] args) {    //step1
		// TODO Auto-generated method stub
		Person6 e=new Person6();       // step2
		System.out.println(e.name);     //step3,step4
		e.display();
		
		Person6 e1=new Person6();
		System.out.println(e1.name);
		

	}

}

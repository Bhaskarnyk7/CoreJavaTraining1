package com.evergent.corejava.oops;

public class PersonInfoEn {
	
	String name="ganesh";
	int age=22;
	String address="hybd";
	
	public void display() {
		System.out.println("person name is "+name+""
			+ " age is "+age+" address is "+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfoEn f=new PersonInfoEn();
		f.display();

	}

}

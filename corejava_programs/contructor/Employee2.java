package com.evergent.corejava.contructor;

public class Employee2 {
	//default constructor
	Employee2() {									//step 3
		System.out.println("default constructor");   
	}
	String name;
	int sal;
	//parameterized constructor
	Employee2(String name1,int sal1){				//step 5
		name=name1;							
		sal=sal1;
	}
	void display() {								// step 7
		System.out.println("employee name "+name);
		System.out.println("employee salary "+sal);
	}
	public static void main(String[] args) {    //step 1
		// TODO Auto-generated method stub
		new Employee2();						//step2
		Employee2 e=new Employee2("boss",1000);  // step 4
		e.display(); 						      // step 6
	}  // step 8
}		//step 9
	
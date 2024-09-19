package com.evergent.corejava.contructor;

// constructor super keyword
class MyEmployee{
	int eno;
	public MyEmployee() {
	
	}
	MyEmployee(int eno){
		System.out.println("employee No super class"+eno);
	}
}
public class Employee6 extends MyEmployee{
	
	int eno;
	String ename;
	double sal;
	public Employee6() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("name is "+ename+" salary "+sal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
	
		Employee6 e2=new Employee6(10,"ram",101);
		e2.display();
				
	}

}

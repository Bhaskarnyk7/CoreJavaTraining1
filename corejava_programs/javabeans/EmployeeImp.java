package com.evergent.corejava.javabeans;
import java.io.Serializable;
class Employee implements Serializable{
	private int eno;
	private  String name;
	private double sal;
	public void setEno(int eno) {
		this.eno=eno;
	}
	public int getEno() {
		return eno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}
}
public class EmployeeImp {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEno(10);
		e.setName("boss");
		e.setSal(100);
		System.out.println("eno is "+e.getEno());
		System.out.println(" name is "+e.getName());
		System.out.println(" sal is "+e.getSal());
	}
}

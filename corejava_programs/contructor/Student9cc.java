package com.evergent.corejava.contructor;



public class Student9cc {
	String name;
	int age;
	
	Student9cc(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	Student9cc(Student9cc c){
		this.name=c.name;
		this.age=c.age;
	}
	void display() {
		System.out.println("name"+name);
		System.out.println("age"+age);
	}
	public static void main(String[] args) {
		Student9cc k=new Student9cc("ram",10);
		Student9cc k1=new Student9cc(k);
		k.display();
		k1.display();
	}

}

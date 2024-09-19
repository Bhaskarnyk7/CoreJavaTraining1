package com.evergent.corejava.contructor;



class Animal{
	String name;
	int age;
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name"+name);
		System.out.println("age "+age);
	}
}

public class Dog extends Animal{

	String breed;
	Dog(String name,int age,String breed){
		super(name,age);
		this.breed=breed;
	}
	
	void display() {
		System.out.println("name"+name);
		System.out.println("age "+age);
		System.out.println("breed "+breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("Dog", 10,"golden retrevl");
		d.display();
		
		
	}

}

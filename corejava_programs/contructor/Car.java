package com.evergent.corejava.contructor;

public class Car {
	String color;
	int maxspeed;
	
	Car(){
		color="red";
		maxspeed=100;
	}
	
	Car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
		
	}
	
	void display() {
		System.out.println("car color is "+color+" max speed is "+maxspeed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car r=new Car();
		r.display();
		Car r1=new Car("blue",200);
		r1.display();
	}

}

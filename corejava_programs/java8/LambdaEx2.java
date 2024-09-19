package com.evergent.corejava.java8;

interface product2{
	public String food(String a);
}

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product2 p=(milk)->{
			System.out.println("food is "+milk);
			return "succes";
		};
		String a=p.food("milk");
		System.out.println(a);
		

	}

}

package com.evergent.corejava.java8;

interface product3{
	public int food();
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product3 p=()-> 100;
		System.out.println(p.food());
		

	}

}


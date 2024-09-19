package com.evergent.corejava.java8;

import java.security.PublicKey;

import org.w3c.dom.ls.LSOutput;

interface Anonymouscls2 {
	public void food();
}

 public class LambdaEx{
	public static void main(String[] args) {
		Anonymouscls2 p=()->{
			System.out.println("food method");
		};
		p.food();
	}
}

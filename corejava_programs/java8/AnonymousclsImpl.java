package com.evergent.corejava.java8;

import org.w3c.dom.ls.LSOutput;

interface Anonymouscls {
	public void abc();
}

 public class AnonymousclsImpl{
	public static void main(String[] args) {
		Anonymouscls p=new Anonymouscls() {
			public void abc(){
				System.out.println("abc method");
			}
		};
		p.abc();
	}
}

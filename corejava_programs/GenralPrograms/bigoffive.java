package com.evergent.corejava.GenralPrograms;

public class bigoffive {
	public static void main(String[] args) {
		int a=10,b=20,c=100,d=40,e=60;
		if(a>b && a>c && a>d && a>e) {
			System.out.println("a is big");
			
		}
		else if(b>a && b>c && b>d && b>e) {
			System.out.println("b is big");
			
		}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println("c is big");
			
		}
		else if(d>a && d>b && d>c && d>e) {
			System.out.println("d is big");
			
		}
		else {
			System.out.println("e is big");
		}
		
	}
}

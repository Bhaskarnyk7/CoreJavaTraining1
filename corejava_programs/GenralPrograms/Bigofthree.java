package com.evergent.corejava.GenralPrograms;

import java.util.Scanner;

public class Bigofthree {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c) {
			System.out.println("a is big");
			
		}
		else if(b>a && b>c) {
			System.out.println("b is big");
		}
		else {
			System.out.println("c is big");
		}
	}
}

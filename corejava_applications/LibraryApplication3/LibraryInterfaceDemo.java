package com.evergent.corejava.Library;

import java.util.Scanner;



class LibraryInterfaceDemo{

	public static void main(String[] args) {
		try {
		ValidUser v=new ValidUser();
		v.validUserMethod();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		// Kiduser object
		
		//case 1
		try {
		KidUser k=new KidUser();
		 k.registerAccount(10);
		 k.registerAccount(18);
	
		
		
		
		k.requestBook("Kids");
		k.requestBook("Fiction");
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		// AdultUser object
//		try {
//		AdultUser a=new AdultUser();
//		a.registerAccount(5);
//		a.registerAccount(23);
//		
//		
//		a.requestBook("Fiction");
//		a.requestBook("Kids");
//		}
//		catch (Exception e) {
//			
//			System.out.println(e);
//		}
		

	}
	
}
	




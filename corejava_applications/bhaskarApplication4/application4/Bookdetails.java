package com.evergent.corejava.bhaskar1.application4;

import java.util.Scanner;



public class Bookdetails extends ClgDetails implements Branch{
	
	
	String cse,java,os,dbms,s,name;
	int Jno,days,id;
	int amount;
	String ece,ac,dec;
	String eee,pe1,pe2;
	
	String str;
	Scanner sc=new Scanner(System.in);
	
	//CSE SECTION START
	@Override
	public void bookMethod(String str) {
		// TODO Auto-generated method stub
		this.str=str;
		System.out.println("Selected "+str+" book");
		System.out.println("======================");
		System.out.println("B - to buy the book");
		System.out.println("R - to rent ");
		System.out.println("Q11- Back To Main Menu");
		System.out.println("======================");
		System.out.println("Enter your Required Book code (B,R) : ");
		s=sc.next();
		
		if(s.equals("B")) {
			System.out.println(" Selected "+str+" Book to Buy");
			System.out.println(" Price Of Each "+str+" book is: Rs 200");
			
			System.out.println(" Enter How many Number of "+str+" books You Required");
			Jno=sc.nextInt();
			
			System.out.println("```````````````````````````````````````````````````````````````");
			System.out.println("Selected "+str+" Book to Buy");
			System.out.println("You selected "+Jno+" "+str+" Books");
			amount=Jno*200;
			System.out.println("Total Amount to be paid For The Books You Purchased is :"+amount);
			System.out.println("````````````````````````````````````````````````````````````````");
			
		}
		else if(s.equals("R")){
			System.out.println("Selected "+str+" Book for Rent");
			
			System.out.println("Enter your college id Number");
			id=sc.nextInt();
			System.out.println("Enter name as per id card");
			name=sc.next();
			System.out.println("Number of Days You Required the book");
			days=sc.nextInt();
			  
			System.out.println("``````````````````````````````````````````");
			System.out.println("Selected "+str+" Book for Rent");
			System.out.println("selected "+str+" book, rent for "+days+" days");
			System.out.println("id number"+id);
			System.out.println("Name "+name);
			System.out.println("``````````````````````````````````````````");
			
		}
		else {
			new WelcomePage();
		}
	}

	
	
	// local method not interface implemented
//	public void cseMethod1(){
//		System.out.println( cse+"section");
//		System.out.println("======================");
//		System.out.println("J- To Select Java Book");
//		System.out.println("O- To Select Operating System Book");
//		System.out.println("D- To Select DBMS BOOK");
//		System.out.println("Q1- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (J,O,D,Q1) : ");
//		s=sc.next();
//		
//		// calling above methods based on user requirements
//		if(s.equals("J")) {
//			this.csesubJava("java");
//		}
//		else if(s.equals("O")) {
//			this.csesubOs("Operating System");
//		}
//		else if(s.equals("D")) {
//			this.csesubOs("DBMS System");
//		}
//		
//		else if(s.equals("Q1")) {
//			new WelcomePage();
//		}
//	}
//	
//	
//
//	@Override
//	public void cseMethod(String cse) {
//		// TODO Auto-generated method stub
//		this.cse=cse;
//		this.cseMethod1();   // line no 174
//	}
//	
//	// CSE SECTION END
//		
//		
//	
//
//	// ECE SECTION START
//	@Override
//	public void ecesubAc(String ac) {
//		// TODO Auto-generated method stub
//		this.ac=ac;
//		
//		System.out.println("Selected "+ac+" book");
//		System.out.println("======================");
//		System.out.println("B - to buy the book");
//		System.out.println("R - to rent ");
//		System.out.println("Q11- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (B,R) : ");
//			
//			s=sc.next();
//			
//			if(s.equals("B")) {
//				System.out.println(" Selected AC Book to Buy");
//				System.out.println(" Price Of Each AC book is: Rs 200");
//				
//				System.out.println(" Enter How many Number of AC books You Required");
//				Jno=sc.nextInt();
//				
//				System.out.println("```````````````````````````````````````````````````````````````");
//				System.out.println("You selected "+Jno+" AC Books");
//				amount=Jno*200;
//				
//				System.out.println("Total Amount to be paid For The Books You Purchased is :"+amount);
//				System.out.println("```````````````````````````````````````````````````````````````");
//		
//			}
//			else if(s.equals("R")) {
//				System.out.println("Selected AC Book for Rent");
//				
//				System.out.println("Enter your college id Number");
//				id=sc.nextInt();
//				System.out.println("Enter name as per id card");
//				name=sc.next();
//				System.out.println("Number of Days You Required the book");
//				days=sc.nextInt();
//				
//				System.out.println("```````````````````````````````````````````````````````````````");
//				System.out.println("selected AC book, rent for "+days);
//				System.out.println("id number"+id);
//				System.out.println("name "+name);
//				System.out.println("```````````````````````````````````````````````````````````````");
//				
//			
//			}
//		else {
//			new WelcomePage();
//		}
//	}
//
//
//	@Override
//	public void ecesubDec(String dec) {
//		// TODO Auto-generated method stub
//		this.dec=dec;
//		
//		System.out.println("Selected "+dec+" book");
//		System.out.println("======================");
//		System.out.println("B - to buy the book");
//		System.out.println("R - to rent ");
//		System.out.println("Q11- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (B,R) : ");
//		
//
//		s=sc.next();
//		
//		if(s.equals("B")) {
//			System.out.println(" Selected DEC Book to Buy");
//			System.out.println(" Price Of Each DEC book is: Rs 200");
//			
//			System.out.println(" Enter How many Number of DEC books You Required");
//			Jno=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("You selected "+Jno+"DEC Books");
//			amount=Jno*200;
//			
//			System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
//			System.out.println("```````````````````````````````````````````````````````````````");
//			
//		}
//		else if(s.equals("R")) {
//			System.out.println("Selected DEC Book for Rent");
//			
//			System.out.println("Enter your college id Number");
//			id=sc.nextInt();
//			System.out.println("Enter name as per id card");
//			name=sc.next();
//			System.out.println("Number of Days You Required the book");
//			days=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("selected DEC book, rent for "+days);
//			System.out.println("id number"+id);
//			System.out.println("name "+name);
//			System.out.println("```````````````````````````````````````````````````````````````");
//		}
//		else {
//			new WelcomePage();
//		}
//
//	}
//	
//	// local method not interface implemented
//	public void eceMethod1() {
//		System.out.println(" ECE section");
//		System.out.println("======================");
//		System.out.println("AC- To Select Analog Circuit Book");
//		System.out.println("DEC- To Select Digital Circuit Book");
//		System.out.println("Q2- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (AC,DEC,Q2) : ");
//	     s=sc.next();
//		
//		if(s.equals("AC")) {
//			this.ecesubAc("Analog Circuits");
//		}
//		else if(s.equals("DEC")) {
//			this.ecesubDec("Digital Electronics Circuits");
//		}
//		
//		else if(s.equals("Q2")) {
//			new WelcomePage();
//		}
//	}
//	
//	
//	@Override
//	public void eceMethod(String ece) {
//		// TODO Auto-generated method stub
//		this.ece=ece;
//		this.eceMethod1();
//		
//	}
//	// ECE SECTION END
//	
//	
//	
//	//   EEE SECTION START 
//	@Override
//	public void eeesubPe1(String pe1) {
//		// TODO Auto-generated method stub
//		this.pe1=pe1;
//		
//		System.out.println("Selected "+pe1+" book");
//		System.out.println("======================");
//		System.out.println("B - to buy the book");
//		System.out.println("R - to rent ");
//		System.out.println("Q11- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (B,R) : ");
//		
//		s=sc.next();
//		
//		if(s.equals("B")) {
//			System.out.println(" Selected PE1 Book to Buy");
//			System.out.println(" Price Of Each PE1 book is: Rs 200");
//			
//			System.out.println(" Enter How many Number of PE1 books You Required");
//			Jno=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("You selected "+Jno+"PE1 Books");
//			amount=Jno*200;
//			
//			System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
//			System.out.println("```````````````````````````````````````````````````````````````");
//			
//		}
//		else if(s.equals("R")) {
//			System.out.println("Selected PE1 Book for Rent");
//			
//			System.out.println("Enter your college id Number");
//			id=sc.nextInt();
//			System.out.println("Enter name as per id card");
//			name=sc.next();
//			System.out.println("Number of Days You Required the book");
//			days=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("selected PE1 book, rent for "+days);
//			System.out.println("id number"+id);
//			System.out.println("name "+name);
//			System.out.println("```````````````````````````````````````````````````````````````");
//			
//		}
//			
//		else {
//			 new WelcomePage();
//		}
//	}
//
//	@Override
//	public void eeesubPe2(String pe2) {
//		// TODO Auto-generated method stub
//		this.pe2=pe2;
//		
//		System.out.println("Selected "+pe2+" book");
//		System.out.println("======================");
//		System.out.println("B - to buy the book");
//		System.out.println("R - to rent ");
//		System.out.println("Q11- Back To Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (B,R) : ");
//		
//		s=sc.next();
//		
//		if(s.equals("B")) {
//			System.out.println(" Selected PE2 Book to Buy");
//			System.out.println(" Price Of Each PE2 book is: Rs 200");
//			
//			System.out.println(" Enter How many Number of PE2 books You Required");
//			Jno=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("You selected "+Jno+" PE2 Books");
//			amount=Jno*200;
//			
//			System.out.println("Total Amount to be paid For The Books You Purchased is :"+amount);
//			System.out.println("```````````````````````````````````````````````````````````````");
//			
//		}
//		else if(s.equals("R")) {
//			System.out.println("Selected PE2 Book for Rent");
//			
//			System.out.println("Enter your college id Number");
//			id=sc.nextInt();
//			System.out.println("Enter name as per id card");
//			name=sc.next();
//			System.out.println("Number of Days You Required the book");
//			days=sc.nextInt();
//			
//			System.out.println("```````````````````````````````````````````````````````````````");
//			System.out.println("selected PE2 book, rent for "+days);
//			System.out.println("id number "+id);
//			System.out.println("name "+name);
//			System.out.println("```````````````````````````````````````````````````````````````");
//			
//		}
//			
//		else {
//			 new WelcomePage();
//		}
//		
//	}
//
//	@Override
//	public void eeeMethod(String eee) {
//		// TODO Auto-generated method stub
//		this.eee=eee;
//		this.eeeMethod1(); // calling above method line no 
//		
//	}
//	
//	public void eeeMethod1() {
//		System.out.println(" EEE section");
//		System.out.println("======================");
//		System.out.println("PE1- To Select Power Electronics1 Book");
//		System.out.println("PE2- To Select Power Electronics2 Book");
//		System.out.println("Q3- Back to Main Menu");
//		System.out.println("======================");
//		System.out.println("Enter your Required Book code (PE1,PE2,Q3) : ");
//		
//		s=sc.next();
//		
//		if(s.equals("PE1")) {
//			this.eeesubPe1("Power Electronics 1");
//		}
//		else if(s.equals("PE2")) {
//			this.eeesubPe2("Power Electronics 2");
//		}
//		else if(s.equals("Q3")) {
//			new WelcomePage();
//		}
//	}
	
	public void clgAddress() {
		System.out.println("\n\t\t \tBASAR TELANGANA 504107");
	}
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc1=new Scanner(System.in);
		
		Bookdetails k=new Bookdetails(); //   creating obj for Bookdetails cls 
		k.clgName();  // abstarct cls ClgDetails method
		k.clgAddress();
		WelcomePage k1=new WelcomePage();  // WelcomePage obj creation, calling static block implicitly
		
		System.out.println("Enter your Module code (CSE,ECE,EEE,Q) : ");
		String section=sc1.next();
		
		if(section.equals("CSE")||section.equals("ECE")||section.equals("EEE")) {
			k.bookMethod(section);
		}
		else {
			new WelcomePage();
		}
//		k.bookMethod(section);
//		if(section.equals("CSE")) {
//			k.cseMethod("CSE");      // line no 205
//		}
//		else if(section.equals("ECE")) {
//			k.eceMethod("ECE");
//		}
//		else if(section.equals("EEE")) {
//			k.eeeMethod("EEE");
//		}
//		
//		if(section.equals("Q")) {
//			new WelcomePage();
//		}
	}
	}
}

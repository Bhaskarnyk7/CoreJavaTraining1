package com.evergent.corejava.bhaskar.application2;
import java.util.Scanner;

public class Library_Bhaskar {
	enum module {CSE,ECE,EEE,Q};
	enum submodule1 {J,O,D,Q1};      //cse
	
	enum submodule2 {AC,DEC,Q2};    // ece
	
	enum submodule3 {PE1,PE2,Q3};   //eee
	
	int price;
	static int Jno;
	static int amount;
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		int i=1;
		
		
		System.out.println("\n\t\t \t\t Welcome");
		System.out.println("\t\t\t\t ~~~~~~~~~~~~");
		
		while(true) {
			
			System.out.println("======================");
			System.out.println(" Library Main Menu");
			System.out.println("======================");
			System.out.println("CSE-Order Module");
			System.out.println("ECE-Payment Module");
			System.out.println("EEE-Report Module");
			System.out.println("Q-Quit Module");
			System.out.println("======================");
		    System.out.println("Enter your Module code (CSE,ECE,EEE,Q) : ");
		    	s=sc.next();
		    	switch(module.valueOf(s)) {
		    		case CSE:
		    			System.out.println(" CSE section");
						System.out.println("======================");
						System.out.println("J- To Select Java Book");
						System.out.println("O- To Select Operating System Book");
						System.out.println("D- To Select DBMS BOOK");
						System.out.println("Q1- Back To Main Menu");
						System.out.println("======================");
						System.out.println("Enter your Required Book code (J,O,D,Q1) : ");
						
						s=sc.next();
						
						switch(submodule1.valueOf(s)) {
							case J:
								System.out.println(" Selected Java Book");
								System.out.println(" Price Of Each Java book is: Rs 200");
								
								System.out.println(" Enter How many Number of Java books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"Java Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
								break;
							case O:
								System.out.println(" Selected Operating System Book");
								System.out.println(" Price Of Each Java book is: Rs 150");
								
								System.out.println(" Enter How many Number of Java books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"Os Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is RS"+amount);
								break;
							case D:
								System.out.println(" Selected DBMS Book");
								System.out.println(" Price Of Each Java book is: Rs 100");
								
								System.out.println(" Enter How many Number of DBMS books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"DBMS Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is RS :"+amount);
								break;
						}
				break;
				
				
		    		case ECE:
		    			System.out.println(" ECE section");
						System.out.println("======================");
						System.out.println("AC- To Select Analog Circuit Book");
						System.out.println("DEC- To Select Digital Circuit Book");
						System.out.println("Q2- Back To Main Menu");
						System.out.println("======================");
						System.out.println("Enter your Required Book code (AC,DEC,Q2) : ");
						
						s=sc.next();
						
						switch(submodule2.valueOf(s)) {
						case AC:
								System.out.println(" Selected ANALOG CIRCUIT Book");
								System.out.println(" Price Of Each AC book is: Rs 150");
								
								System.out.println(" Enter How many Number of AC books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"AC Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
								break;
							case DEC:
								System.out.println(" Selected Digital Electronic Circuits Book");
								System.out.println(" Price Of Each DEC book is: Rs 150");
								
								System.out.println(" Enter How many Number of DEC books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"DEC Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is RS"+amount);
								break;
							
						}
				break;
				
		    		case EEE:
		    			System.out.println(" EEE section");
						System.out.println("======================");
						System.out.println("PE1- To Select Power Electronics1 Book");
						System.out.println("PE2- To Select Power Electronics2 Book");
						System.out.println("Q3- Back to Main Menu");
						System.out.println("======================");
						System.out.println("Enter your Required Book code (PE1,PE2,Q3) : ");
						
						s=sc.next();
						
						switch(submodule3.valueOf(s)) {
							case PE1:
								System.out.println(" Selected Power Electronics1 Book");
								System.out.println(" Price Of Each Power Electronics1 book is: Rs 300");
								
								System.out.println(" Enter How many Number of PE1 books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"PE1 Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
								break;
							case PE2:
								System.out.println(" Selected Power Electronics2 Book");
								System.out.println(" Price Of Each Power Electronics1 book is: Rs 250");
								
								System.out.println(" Enter How many Number of PE2 books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"PE2 Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is RS."+amount);
								break;
							
						}
				break;
				
		    		case Q:
		    			System.out.println("Quit module");
		    			System.exit(0);
		    			break;
		  
				
				
						
		    	}
		    
		    
		    
		    
		}
		
	}
}

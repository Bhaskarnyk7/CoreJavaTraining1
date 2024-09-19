package com.evergent.corejava.bhaskar.application2;
import java.util.Scanner;

public class Library_Bhaskar3 {
	enum module {CSE,ECE,EEE,Q};
	enum submodule1 {J,O,D,Q1};  //cse 
	enum submodule11 {B,R,Q11};   //cse
	
	
	enum submodule2 {AC,DEC,Q2};
	enum submodule22 {B,R,Q11};// ece
	
	enum submodule3 {PE1,PE2,Q3};
	enum submodule33 {B,R,Q11};//eee
	
	int price;
	static int Jno;
	static int amount;
	int buy;
	int ren;
	static int id;
	static String name="";
	static int days;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.println("\n\t\t \t\t Welcome");
		System.out.println("\t\t\t\t ~~~~~~~");
		
		while(true) {
			
			System.out.println("======================");
			System.out.println(" Library Main Menu");
			System.out.println("======================");
			System.out.println("CSE-Computer science Engineering section");
			System.out.println("ECE-Electronics an communication engineering section");
			System.out.println("EEE-Electrical and electronics engineering section");
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
									System.out.println("Selected java book");
									System.out.println("======================");
									System.out.println("B - to buy the book");
									System.out.println("R - to rent ");
									System.out.println("Q11- Back To Main Menu");
									System.out.println("======================");
									System.out.println("Enter your Required Book code (B,R) : ");
									
									s=sc.next();
									
									switch (submodule11.valueOf(s)) {
									case B:
										System.out.println(" Selected Java Book to Buy");
										System.out.println(" Price Of Each Java book is: Rs 200");
										
										System.out.println(" Enter How many Number of Java books You Required");
										Jno=sc.nextInt();
										
										System.out.println("```````````````````````````````````````````````````````````````");
										System.out.println(" Selected Java Book to Buy");
										System.out.println("You selected "+Jno+"Java Books");
										amount=Jno*200;
										System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
										System.out.println("````````````````````````````````````````````````````````````````");
										
										break;
									case R:
										System.out.println("Selected Java Book for Rent");
										
										System.out.println("Enter your college id Number");
										id=sc.nextInt();
										System.out.println("Enter name as per id card");
										name=sc.next();
										System.out.println("Number of Days You Required the book");
										days=sc.nextInt();
										  
										System.out.println("``````````````````````````````````````````");
										System.out.println("Selected Java Book for Rent");
										System.out.println("selected Java book, rent for "+days);
										System.out.println("id number"+id);
										System.out.println("name "+name);
										System.out.println("``````````````````````````````````````````");
										
										break;
									}
			
								break;
							case O:
								System.out.println("Selected operating system book");
								System.out.println("======================");
								System.out.println("B - to buy the book");
								System.out.println("R - to rent ");
								System.out.println("Q11- Back To Main Menu");
								System.out.println("======================");
								System.out.println("Enter your Required Book code (B,R) : ");
								
								s=sc.next();
								
								switch (submodule22.valueOf(s)) {
								case B:
									System.out.println(" Selected OS Book to Buy");
									System.out.println(" Price Of Each OS book is: Rs 150");
									
									System.out.println(" Enter How many Number of OS books You Required");
									Jno=sc.nextInt();
									
									System.out.println("You selected "+Jno+"OS Books");
									amount=Jno*200;
									
									System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
									
									
									break;
								case R:
									System.out.println("Selected OS Book for Rent");
									
									System.out.println("Enter your college id Number");
									id=sc.nextInt();
									System.out.println("Enter name as per id card");
									name=sc.next();
									System.out.println("Number of Days You Required the book");
									days=sc.nextInt();
									
									System.out.println("selected OS book, rent for "+days);
									System.out.println("id number"+id);
									System.out.println("name "+name);
									
									break;
								}
							
							break;
							case D:
								System.out.println("Selected DBMS book");
								System.out.println("======================");
								System.out.println("B - to buy the book");
								System.out.println("R - to rent ");
								System.out.println("Q11- Back To Main Menu");
								System.out.println("======================");
								System.out.println("Enter your Required Book code (B,R) : ");
								
								s=sc.next();
								
								switch (submodule33.valueOf(s)) {
								case B:
									System.out.println(" Selected DBMS Book to Buy");
									System.out.println(" Price Of Each DBMS book is: Rs 100");
	
									System.out.println(" Enter How many Number of  books You Required");
									Jno=sc.nextInt();
									
									System.out.println("You selected "+Jno+"DBMS Books");
									amount=Jno*200;
									
									System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
									
									break;
								case R:
									System.out.println("Selected DBMS Book for Rent");
									
									System.out.println("Enter your college id Number");
									id=sc.nextInt();
									System.out.println("Enter name as per id card");
									name=sc.next();
									System.out.println("Number of Days You Required the book");
									days=sc.nextInt();
									
									System.out.println("selected DBMS book, rent for "+days);
									System.out.println("id number"+id);
									System.out.println("name "+name);
									
									break;
								}
								
							
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
							System.out.println("Selected ANALOG CIRCUITS book");
							System.out.println("======================");
							System.out.println("B - to buy the book");
							System.out.println("R - to rent ");
							System.out.println("Q11- Back To Main Menu");
							System.out.println("======================");
							System.out.println("Enter your Required Book code (B,R) : ");
							
							s=sc.next();
							
							switch (submodule22.valueOf(s)) {
							case B:
								System.out.println(" Selected AC Book to Buy");
								System.out.println(" Price Of Each AC book is: Rs 200");
								
								System.out.println(" Enter How many Number of AC books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"AC Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
								break;
							case R:
								System.out.println("Selected AC Book for Rent");
								
								System.out.println("Enter your college id Number");
								id=sc.nextInt();
								System.out.println("Enter name as per id card");
								name=sc.next();
								System.out.println("Number of Days You Required the book");
								days=sc.nextInt();
								
								System.out.println("selected AC book, rent for "+days);
								System.out.println("id number"+id);
								System.out.println("name "+name);
								
								break;	
							}
							
						
						break;
						case DEC:
							System.out.println("Selected DIGITAL ELECTRONICS BOOK book");
							System.out.println("======================");
							System.out.println("B - to buy the book");
							System.out.println("R - to rent ");
							System.out.println("Q11- Back To Main Menu");
							System.out.println("======================");
							System.out.println("Enter your Required Book code (B,R) : ");
							
							s=sc.next();
							
							switch (submodule11.valueOf(s)) {
							case B:
								System.out.println(" Selected DEC Book to Buy");
								System.out.println(" Price Of Each DEC book is: Rs 200");
								
								System.out.println(" Enter How many Number of DEC books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"DEC Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
								break;
							case R:
								System.out.println("Selected DEC Book for Rent");
								
								System.out.println("Enter your college id Number");
								id=sc.nextInt();
								System.out.println("Enter name as per id card");
								name=sc.next();
								System.out.println("Number of Days You Required the book");
								days=sc.nextInt();
								
								System.out.println("selected DEC book, rent for "+days);
								System.out.println("id number"+id);
								System.out.println("name "+name);
								
								break;	
							}
							
						
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
							System.out.println("Selected POWER ELECTRONICS book");
							System.out.println("======================");
							System.out.println("B - to buy the book");
							System.out.println("R - to rent ");
							System.out.println("Q11- Back To Main Menu");
							System.out.println("======================");
							System.out.println("Enter your Required Book code (B,R) : ");
							
							s=sc.next();
							
							if(s.equals("B")) {
								System.out.println(" Selected PE1 Book to Buy");
								System.out.println(" Price Of Each PE1 book is: Rs 200");
								
								System.out.println(" Enter How many Number of PE1 books You Required");
								Jno=sc.nextInt();
								
								System.out.println("You selected "+Jno+"PE1 Books");
								amount=Jno*200;
								
								System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
								
								
							}
							else if(s.equals("R")) {
								System.out.println("Selected PE1 Book for Rent");
								
								System.out.println("Enter your college id Number");
								id=sc.nextInt();
								System.out.println("Enter name as per id card");
								name=sc.next();
								System.out.println("Number of Days You Required the book");
								days=sc.nextInt();
								
								System.out.println("selected PE1 book, rent for "+days);
								System.out.println("id number"+id);
								System.out.println("name "+name);
								
								
							}
							
						
						break;
							
							case PE2:
							
								System.out.println("Selected POWER ELECTRONICS-2 book");
								System.out.println("======================");
								System.out.println("B - to buy the book");
								System.out.println("R - to rent ");
								System.out.println("Q11- Back To Main Menu");
								System.out.println("======================");
								System.out.println("Enter your Required Book code (B,R) : ");
								
								s=sc.next();
								
								switch (submodule11.valueOf(s)) {
								case B:
									System.out.println(" Selected PE2 Book to Buy");
									System.out.println(" Price Of Each PE2 book is: Rs 200");
									
									System.out.println(" Enter How many Number of PE2 books You Required");
									Jno=sc.nextInt();
									
									System.out.println("You selected "+Jno+"PE2 Books");
									amount=Jno*200;
									
									System.out.println("Total Amount to be paid For The Books You Purchased is"+amount);
									
									
									break;
								case R:
									System.out.println("Selected PE2 Book for Rent");
									
									System.out.println("Enter your college id Number");
									id=sc.nextInt();
									System.out.println("Enter name as per id card");
									name=sc.next();
									System.out.println("Number of Days You Required the book");
									days=sc.nextInt();
									
									System.out.println("selected PE2 book, rent for "+days);
									System.out.println("id number"+id);
									System.out.println("name "+name);
									
									break;
								}
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

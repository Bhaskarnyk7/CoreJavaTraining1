package com.evergent.corejava.controller;

import java.util.Scanner;
import com.evergent.corejava.service.*;
import com.evergent.corejava.DAO.*;
//import com.capg.shadow.service.BankService;

public class CollegeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,ch1=1;
		int stdid=0;
		String stdname="";
		String stdbranch="";
		int year=0;
		Scanner s=new Scanner(System.in);
		System.out.println("------------------------WELCOME TO YOUR COLLEGE---------------------");
		CollegeServices clgkService = new CollegeServices();
		while(ch1!=0)
		{
			
			System.out.println("1.Create a New Account");
			System.out.println("2. To see account");
			System.out.println("3. CSE Branch");
			System.out.println("4.ECE Branch");
			System.out.println("Enter your choice :");
			ch=s.nextInt();
			switch(ch)
				{
				case 1:
					System.out.println("Enter Account Number");
					stdid = s.nextInt();
					System.out.println("Enter student Name");
					stdname = s.next();	
					System.out.println("Enter stduent branch:");
					stdbranch=s.next();
					System.out.println("Enter student year");
					year = s.nextInt();
					int updateCount = CollegeServices.createAccount(stdid,stdname,stdbranch,year);	
					System.out.println(updateCount+" Account Created successfully");
					break;
					
				case 2:
					try
						{
						System.out.println("Enter your account id");
						int id=s.nextInt();
						CollegeDAO.showB(stdid);
						//System.out.println("Your Account Balance: "+balance);
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
						
				case 3:
					try
						{	
						System.out.println("You Selected Cse Dept");
						System.out.println("enter book u need");
						String sub1=s.next();
						int a =CollegeDAO.searchBookCSE(sub1);
						System.out.println("price of each "+sub1+" book is: "+a);
						System.out.println("enter how many books You need");
						//int pr=Integer.parseInt(a);
						int count=s.nextInt();
						
						System.out.println("-------------------------------------------");
						System.out.println("CSE Department");
						System.out.println("selected book is "+sub1);
						System.out.println("Number of Selected Books: "+count);
						System.out.println("Total amount to be paid: "+a*count);
						System.out.println("-------------------------------------------");
						
						}catch(Exception e){e.printStackTrace();}
						break;
				case 4:
					try {
						System.out.println("You Selected Ece Dept");
						System.out.println("enter book u need");
						String sub1=s.next();
						int a =CollegeDAO.searchBookECE(sub1);
						System.out.println("price of each "+sub1+" book is: "+a);
						System.out.println("enter how many books You need");
						//int pr=Integer.parseInt(a);
						int count=s.nextInt();
						
						System.out.println("-------------------------------------------");
						System.out.println("CSE Department");
						System.out.println("selected book is "+sub1);
						System.out.println("Number of Selected Books: "+count);
						System.out.println("Total amount to be paid: "+a*count);
						System.out.println("-------------------------------------------");
						
					}catch(Exception e) 
					{e.printStackTrace();}
					break;
				default:
						System.out.println("Enter Valid Choice");
						break;
				
				}
			System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
			ch1=s.nextInt();
			}

	}

}

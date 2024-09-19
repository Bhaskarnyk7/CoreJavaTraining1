package com.evergent.corejava.collections.bhaskar.task3;

import java.util.Scanner;



public class Mobile_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MobileInterface mobile=new MobileImpl();
		for(;;){
			System.out.println("1. Add Mobile 2.Search by id 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the id");
				   String id=sc.next();
				   System.out.println("Enter the Mobile name");
				   String name=sc.next();
				   System.out.println("Enter Processor name");
				   String processor=sc.next();
				   Mobile m=new Mobile();
				   m.setId(id);
				   m.setMobilename(name);
				   m.setProcessor(processor);
				   String msg=mobile.addMobile(m);
				   System.out.println(msg);
				   break;
			case 2:System.out.println("Enter the id");
			   	   String id1=sc.next();
			   	   mobile.searchById(id1);
			   	   break;
			  			
			case 3:mobile.getAllMobiles();
				break;
			case 4:System.exit(0);
			}
			
		}

	}

}

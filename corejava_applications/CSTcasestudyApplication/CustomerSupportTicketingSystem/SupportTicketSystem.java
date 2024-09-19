package com.evergent.corejava.CustomerSupportTicketingSystem;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SupportTicketSystem {
	ArrayDeque<String> ad=new ArrayDeque<>();
	
	public void  addTicket(String ticket) {
		ad.add(ticket);
	}
	public void  processNextTicket() {
		if(!ad.isEmpty()) {
		ad.poll();
		}
		else {
			System.out.println("queue is empty");
		}
	}
	public void peekNextTicket() {
		if(!ad.isEmpty()) {
			ad.peek();
			}
			else {
				System.out.println("queue is empty");
			}
	}
	public void displayQueue() {
		System.out.println(ad);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupportTicketSystem k=new SupportTicketSystem();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many ticket u want to enter");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			
			System.out.println("enter ticket "+i);
			String t1=sc.next();
			k.addTicket(t1);
			t1="";
			
		}
		k.peekNextTicket();
		k.peekNextTicket();
		k.displayQueue();
		
	}

}

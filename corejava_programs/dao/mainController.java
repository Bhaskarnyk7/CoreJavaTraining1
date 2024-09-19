package com.evergent.corejava.dao;

import java.util.Scanner;

public class mainController {
	public static void main(String[] args) {
		
	
		int stdId=0;
		String stdName="";
		int stdmarks=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enyter student id");
		stdId=sc.nextInt();
		System.out.println("enter student name");
		stdName=sc.next();
		System.out.println("enter marks");
		stdmarks=sc.nextInt();
		
		StudentService ss=new StudentService();
		int updatecount=ss.addStdService(stdId, stdName, stdmarks);
		System.out.println("inserted "+updatecount+" bhaskar succes");
	}
}

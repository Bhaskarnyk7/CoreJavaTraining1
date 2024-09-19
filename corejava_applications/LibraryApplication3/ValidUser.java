package com.evergent.corejava.Library;

import java.security.PublicKey;
import java.util.Scanner;

class NotValidUserException extends Exception{
	public NotValidUserException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

public class ValidUser  {
	 public  void validUserMethod() throws NotValidUserException {
		String u1="Bhaskar";  // alredy libraray registered user 1
		String u2="Raj";// registred user 2
		
		String newUser="";
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your Username");
		newUser=sc.next();
		
		if(newUser.equals(u1) || newUser.equals(u2)) {
			System.out.println("valid User");
		}
		else {
			throw new NotValidUserException("not a valid User");
		}
	}
}

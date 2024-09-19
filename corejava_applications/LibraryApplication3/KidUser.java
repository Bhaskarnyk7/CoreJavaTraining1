package com.evergent.corejava.Library;



class NotValidAgeException extends Exception{
	public NotValidAgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class NotValidBookTypeException extends Exception{
	public NotValidBookTypeException(String msg) {
		// TODO Auto-generated constructor stub
		System.out.print(msg);
	}
}

public class KidUser implements LibraryUser {
	int age;
	String bookType;
	
	
	@Override
	public void registerAccount(int age) throws  NotValidAgeException{
		// TODO Auto-generated method stub
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			throw new NotValidAgeException("Sorry, Age must be less than 12 to register as a kid");
			
		}
		
	}
	@Override
	public void requestBook(String btype) throws NotValidBookTypeException{
		// TODO Auto-generated method stub
		if(btype.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			throw new NotValidBookTypeException("Oops, you are allowed to take only kids books");
		}
	}
}

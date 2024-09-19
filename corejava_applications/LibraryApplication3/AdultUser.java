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

public class AdultUser implements LibraryUser {
	int age;
	String bookType;
	@Override
	public void registerAccount(int age) throws NotValidAgeException {
		// TODO Auto-generated method stub
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			throw new NotValidAgeException("Sorry,Age must be greater than 12 to register as an adult");
		}
	}
	@Override
	public void requestBook(String btype) throws NotValidBookTypeException{
		// TODO Auto-generated method stub
		if(btype.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}	
		else {
			throw new NotValidBookTypeException("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
}

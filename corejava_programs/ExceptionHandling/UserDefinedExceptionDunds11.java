package com.evergent.corejava.ExceptionHandling;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
}

public class UserDefinedExceptionDunds11 {
	public static void withdraw(double amount) throws InsufficientFundException {
		double balance=500.00;
		
		if(amount>balance) {
			throw new InsufficientFundException("innsuffiecient funds ");
		}
		else {
			System.out.println("withdrwal succesful");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(100);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

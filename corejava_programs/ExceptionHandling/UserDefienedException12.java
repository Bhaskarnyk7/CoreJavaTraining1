package com.evergent.corejava.ExceptionHandling;

class InvalidScoreException extends Exception{
	public InvalidScoreException(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
}

public class UserDefienedException12 {
	public static void validateScore(int score) throws InvalidScoreException {
		if(score<0 || score>100) {
			throw new InvalidScoreException("invalid score");
		}
		else {
			System.out.println("valid score");
		}
	}
	public static void main(String[] args) {
		try {
			validateScore(-10);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

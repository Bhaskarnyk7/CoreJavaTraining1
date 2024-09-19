package com.evergent.corejava.Library;

public interface LibraryUser {
	abstract public void  registerAccount(int age) throws NotValidAgeException;
	abstract public void requestBook(String btype) throws NotValidBookTypeException;

}

package com.evergent.corejava.ExceptionHandling;

import javax.lang.model.element.Element;

public class ArrayIndexOutOfBoundsException extends Exception {
	public static void main(String[] args) {
		int a[]= {110,20,40};
		try {
			System.out.println("accesing Element at  "+a[1]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}   
	}
}

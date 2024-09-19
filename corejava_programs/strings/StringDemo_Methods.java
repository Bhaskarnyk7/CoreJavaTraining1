package com.evergent.corejava.strings;

public class StringDemo_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("  hello  ");
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		
		System.out.println(s1.length());
		System.out.println(s1.substring(1,3));
		System.out.println(s1.subSequence(1, 2));
		
		

	}

}

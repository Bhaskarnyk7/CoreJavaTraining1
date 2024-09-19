package com.evergent.corejava.strings;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("intial String "+sb);
		
		sb.append("wolrd");
		// to add new String to existing String
		System.out.println("after append "+sb);
		
		//to insert a new String at specific index
		sb.insert(2,"kk");
		System.out.println("after insert "+sb);
		
		//reaplcing String at specific index 
		sb.replace(2, 4,"hiddd");
		System.out.println("after replace "+sb);
		
		// reverse the existing String
		sb.reverse();
		System.out.println("after reverse "+sb);
		// deleting a part of String by providing index
		sb.delete(2, 4);
		System.out.println("after delete "+sb);
		
		// Capacity of Buffer
		System.out.println(sb.capacity());
		// length of Buffer
		System.out.println(sb.length());
		

	}

}

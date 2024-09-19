package com.evergent.corejava.strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("intial String "+sb);
		
		sb.append("wolrd");
		System.out.println("after append "+sb);
		
		sb.insert(2,"abc");
		System.out.println("after insert "+sb);
		
		sb.replace(2, 4,"kk");
		System.out.println("after replace "+sb);
		
		sb.reverse();
		System.out.println("after reverse "+sb);
		
		sb.delete(2, 4);
		System.out.println("after delete "+sb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}

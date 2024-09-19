package com.evergent.corejava.collections;

import java.util.ArrayDeque;
public class ArrayDequeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String>k=new ArrayDeque<>();
		
		k.add("boss");
		k.addFirst("hello");
		k.addLast("last");
		k.offer("abc");
		
		System.out.println(k);
	

	}

}

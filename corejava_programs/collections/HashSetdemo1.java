package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetdemo1 {
	public static void main(String[] args) {
		LinkedHashSet k=new LinkedHashSet();
//		k.add(100);
//		k.add(300);
//		k.add("hello");
//		k.add(900);
//		k.add(null);
//		k.add(null);
//		k.add(100);
//		k.add("abc");
		
		k.add(200);
		k.add(100);
		k.add(700);
		k.add(500);
		
		System.out.println(k);
		
		Iterator itr=k.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList k=new ArrayList();
		k.add(100);
		k.add("hello");
		k.add(500);
		
		//System.out.println(k);
		
	//	Iterator itr=k.iterator();
//		while(itr.hasNext()) {
//		
//			System.out.println(itr.next());
//		}
		
		ListIterator itr=k.listIterator();
		
		

		Collections.fill(k, "java");
		int a=(int) Collections.min(k);
		System.out.println(a);
		
	while(itr.hasNext()) {
	
		System.out.println(itr.next());
	}
	}

}

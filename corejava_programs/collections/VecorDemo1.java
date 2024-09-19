package com.evergent.corejava.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VecorDemo1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
//		v.add("hello");
		v.add(10);
		
		v.addElement(1000);
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
		
		System.out.println("vector element BEF REMOVE "+v);
//		v.removeElementAt(1);
//		v.removeAllElements();
		
		System.out.println("after remove "+v);
//		System.out.println(v.capacity());

		System.out.println(v.);
		
//		Enumeration e=v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
	}

}

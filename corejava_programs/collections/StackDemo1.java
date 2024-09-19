package com.evergent.corejava.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack k=new Stack();
		k.push(100);
		k.push(200);
		k.push(300);
		k.push("helli");
		System.out.println(k.isEmpty());
		
		
//		Iterator itr=k.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		System.out.println(k.pop());
//		System.out.println("after pop");
		
//		System.out.println(k.peek());
		
//		System.out.println(k.search(200));
		
		System.out.println(k.empty());
		
		Iterator itr=k.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

package com.evergent.corejava.collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,Integer>k=new HashMap<>();
		int a[]= {1,2,3,2,3,5};
		for(int i=0;i<5;i++) {
			if(k.containsKey(a[i])) {
				k.put(a[i], k.get(a[i])+1);
			}
			else {
				k.put(a[i], 1);
			}
		}
		
		for(Integer p:k.keySet()) {
			System.out.println(k.get(p));
		}
		
	}
}

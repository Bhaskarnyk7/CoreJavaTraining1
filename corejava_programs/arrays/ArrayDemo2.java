package com.evergent.corejava.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		
		int k=7;
		
		for(int i=0;i<5;i++) {
			a[i]=k;
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");   //7 7 7 7 7
		}

	}

}

package com.evergent.corejava.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2dDemo1 {

	public static void main(String[] ags) {
		int a[][]=new int[5][5];
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				a[i][j]=10;
//			}
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(a[i][j]+" ");			
//			}
//			System.out.println();
//		}
		
		
		int b[]= {1,2,3,4};
		int c[]= {1,2,3,4};
//		List  p= Arrays.asList(b);
//		
//		for(int i=0;i<p.size();i++) {
//		System.out.println(p.get(i));
		
		System.out.println(Arrays.equals(c, b));
		System.out.println(Arrays.binarySearch(b, 2));
		
	}
}


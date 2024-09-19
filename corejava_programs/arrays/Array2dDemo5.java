package com.evergent.corejava.arrays;

public class Array2dDemo5 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		
		int m=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=m;
				m++;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

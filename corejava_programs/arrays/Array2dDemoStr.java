package com.evergent.corejava.arrays;

public class Array2dDemoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]=new String[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]="Java";
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

package com.evergent.corejava.strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc def ghi";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		

	}

}

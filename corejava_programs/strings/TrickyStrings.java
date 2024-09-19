package com.evergent.corejava.strings;

import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class TrickyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String s1=Arrays.toString(s.toCharArray());
		System.out.println(s1);
		System.out.println(Arrays.toString(s.toCharArray()));
		
		System.out.println((Arrays.toString(s.toCharArray()).getClass().getSimpleName()));
		
		System.out.println();

	}

}

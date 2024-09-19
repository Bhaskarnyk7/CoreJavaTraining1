package com.evergent.corejava.strings;

import java.net.SocketTimeoutException;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc def ghi";
		String s1[]=s.split(" ");
		for(String k:s1) {
			System.out.println(k);
		}

	}

}

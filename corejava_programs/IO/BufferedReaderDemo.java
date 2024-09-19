package com.evergent.corejava.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new FileReader("./sample.txt"));
			
			String s="";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			
		}
}

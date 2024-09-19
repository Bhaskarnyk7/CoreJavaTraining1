package com.evergent.corejava.IO;
import java.io.*;
public class Demo2FileInputStream {
	public static void main(String[] args) throws IOException {
		File f=new File("./sample.txt");
		if(!f.exists()) 
			System.out.println(f.createNewFile());
		
		
		
		FileInputStream fis=new FileInputStream(f);
		
		int i;
		while((i=fis.read())!=-1) {
		System.out.print((char)i);
		}
	}
}

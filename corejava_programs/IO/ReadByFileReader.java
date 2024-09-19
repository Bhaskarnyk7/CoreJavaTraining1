package com.evergent.corejava.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadByFileReader {
	public static void main(String[] args) throws IOException {
		File f=new File("./sample.txt");
		if(!f.exists()) 
			System.out.println(f.createNewFile());
		
		
		
		FileReader fis=new FileReader(f);
		
		int i;
		while((i=fis.read())!=-1) {
		System.out.print((char)i);
		}
	}
}

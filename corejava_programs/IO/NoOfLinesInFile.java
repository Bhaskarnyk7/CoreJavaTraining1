package com.evergent.corejava.IO;
import java.io.*;
public class NoOfLinesInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./sample.txt");	
		
		FileReader fi=new FileReader(f);
		BufferedReader br=new BufferedReader(fi);
		
		int linecount=0;
		String s="";
		while((s=br.readLine())!=null) {
//			System.out.println(s);
			linecount++;
			
		}
		System.out.println(linecount);
		
		
		
	}

}

package com.evergent.corejava.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws IOException {
		File f=new File("./sample.txt");
		if(!f.exists()) 
			System.out.println(f.createNewFile());
		
		//Scanner sc=new Scanner(f);
		Scanner sc=new Scanner(new FileInputStream(f));
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}

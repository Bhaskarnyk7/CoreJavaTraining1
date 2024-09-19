package com.evergent.corejava.IO;

import java.io.*;

import org.w3c.dom.ls.LSOutput;
public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\bhaskar.bhukya\\Desktop\\coreJAVA_Workspace\\coreJAVA_Development\\src\\com\\evergent\\corejava\\IO\\createdfile.txt");
		System.out.println(f.createNewFile());  // to ceate new file return boolean after suuscessfulfile creation
		System.out.println(f.delete());    // to delete exxting  file return boolean val
		
		if(f.exists()) {
			f.delete();
		}
		else {
		System.out.println(f.createNewFile());
		}
		
		System.out.println(f.canRead());
		
		
		

	}
}

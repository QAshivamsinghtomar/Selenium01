package com.selenium.websriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// creating zip of any file

public class Class35_zipfile {

	public static void m1() throws Exception {
		// file location that i want to create zip
		File file = new File("C:\\Java\\ECLIPSE2\\SeleniumWebdriver_Webelement\\target\\location.png");
	
		// giving reading permission
		FileInputStream fileInputStream = new FileInputStream(file);
		
		File zipfile = new File("target\\location.zip");
		
		FileOutputStream fileOutputStream = new FileOutputStream(zipfile);
		
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
		
		ZipEntry zipentry = new ZipEntry(zipfile.getName());
		zipOutputStream.putNextEntry(zipentry); 
		
		// zip logic
		byte[] bytes = new byte[1024];
		
		int length ;
		
		while((length = fileInputStream.read(bytes)) > 0) {
			
			zipOutputStream.write(bytes, 0, length);
		}
		
		System.out.println("Zip file is created sussessfully");
		
		fileInputStream.close();
		fileOutputStream.close();
		zipOutputStream.close();
	
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}

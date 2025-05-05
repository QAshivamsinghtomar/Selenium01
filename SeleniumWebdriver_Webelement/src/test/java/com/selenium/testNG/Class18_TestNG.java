package com.selenium.testNG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// reading data from .txt file

public class Class18_TestNG {

	@DataProvider(name = "testdata")
	public Object[][] test1() throws Exception{
		Object [][] obj = new Object[6][6] ;
		
		// giving file where data is avaiable
		File file = new File("C:\\Java\\ECLIPSE2\\SeleniumWebdriver_Webelement\\src\\test\\resources\\testdata\\testdata.txt"); 
		
		// reading permission
		FileReader fileReader = new FileReader(file); // it will single single character  
		
		// get the file hard desc to RAM
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line ;
		int i = 0 ;
		
		while ((line = bufferedReader.readLine()) != null) {
			int j = 0 ;
			
			// removing space
			String[] pieces = line.split(",");
			
			for(String piece : pieces) {
				obj[i][j] = piece ;
				j++ ;
				
			}
			
			i++ ;
			
		}
		fileReader.close();
		bufferedReader.close();
		
		return obj;		
	}
	
	@Test(dataProvider = "testdata")
	public void data(String a, String b, String c, String d, String e, String f) {
	
		String m = a+"..."+b+"..."+c+"..."+d+"..."+e+"..."+f ;		
		
		System.out.println(m);	
		
	}
	
	
	
}

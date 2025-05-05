package com.selenium.testNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// reading data from excel file

public class Class19_TestNG {

	@DataProvider(name = "testdata")
	public  Object[][] excelReading() throws Exception {
		// excel file location
		File file = new File("C:\\Java\\ECLIPSE2\\SeleniumWebdriver_Webelement\\src\\test\\resources\\testdata\\testdata.xlsx");
		
		//reading permission
		FileInputStream fileInputStream = new FileInputStream(file);
		
		// in java excel called workbook - get my workbook
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		
		// in excel data available in first sheet - getting 1 sheet
		Sheet sheet = workbook.getSheet("Sheet1") ; // getting first sheet in excel 
		
		// count of row
		int rowNumber = sheet.getPhysicalNumberOfRows();
		
		// count of column till last
		int columnNumber = sheet.getRow(0).getLastCellNum();
		
		// object 
		Object[][] obj = new Object[rowNumber -1][columnNumber];
		
		// 0 row is heading - so not reading this row
		for(int i =1; i<rowNumber ;i++) {
			for(int j=0; j<columnNumber; j++) {
				
				try {
				// reading all type of data - int, String, byte, short - DataFormatter
				DataFormatter dataFormatter = new DataFormatter();
				obj[i-1][j] = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
				
				}
				catch(Exception exception) {
				obj[i-1][j] = "" ;	
				}
				
			}
		}
		fileInputStream.close();
		workbook.close();
		
		return obj ;

	}
	
	
	@Test(dataProvider = "testdata")
	public void callingData(String a, String b, String c, String d, String e) {
		
		System.out.println(a+"..."+b+"..."+c+"..."+d+"..."+e);
	}
	
	
	
}

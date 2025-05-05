package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class2_gmail2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// creating object og gmail1 class
		
		Class1_gmail1 gmail1 = new Class1_gmail1(driver);
		
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		gmail1.username("shsingh@indianjournals.com");
		Thread.sleep(2000);
		gmail1.userclick();
		Thread.sleep(2000);
		gmail1.pswd("shivam12tomar");
		Thread.sleep(2000);
		gmail1.pswdclick();
		Thread.sleep(5000);
		
		// close the browser
		driver.close();
		
		
	}
	
}

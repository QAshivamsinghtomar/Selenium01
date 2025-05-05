package com.selenium.testNG;

//Description & timeOut

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Class2_TestNG {
   
	/*
	@Test(description = "This method indicate that open website in chrome browser", timeOut = 50000)
	public void m1() {
		RemoteWebDriver driver = new ChromeDriver();
	    driver.get("https://www.indianjournals.com/");
	    driver.manage().window().maximize();
	    
	    System.out.println("This is m1 method....");
	}
	*/
	
	
	
	@Test(description = "searching Indian in google chrome browser...")
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("India", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
	
	
	/*
	@Test(timeOut = 20000)
	public void m3() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.close();
		
	}
	
	*/
	
}

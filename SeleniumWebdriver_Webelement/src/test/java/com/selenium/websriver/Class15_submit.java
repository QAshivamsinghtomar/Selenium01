package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class15_submit {

	public static void m1() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://quotes.toscrape.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("javaselenium");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("javaselenium");
		Thread.sleep(2000);
		
		// submit method
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(2000);
		
		// click method
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);
		
		driver.close();
		
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Moving into iframe
		driver.switchTo().frame("iframeResult");
		// Firstname element 
		driver.findElement(By.id("fname")).sendKeys("Java Test");
		Thread.sleep(2000);
		
		// Lastname element
		driver.findElement(By.id("lname")).sendKeys("Selenium Test");
		Thread.sleep(2000);
		
		// Click on Submit button by submit method
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(2000);
		
		/*
		 Click on Submit button by click method
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);	
		
		*/
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
		
	}
	
	
}

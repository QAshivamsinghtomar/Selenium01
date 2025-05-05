package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class2_ERPLogin {

	public static void m1() throws Exception {
		
		// ERP1 Login by using Xpath element
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shsingh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shivam@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("navbarDropdown")).click();// logout element
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}
	
	
	public static void m2() throws Exception {
		
		// ERP1 Login by using xpath and keyboard button
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shsingh", Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shivam@123", Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.id("navbarDropdown")).click();// logout element
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		
		
		driver.close();

		
	}
	
	
	public static void m3() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shsingh", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shivam@123", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m3();
	}
	
}

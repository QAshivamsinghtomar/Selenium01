package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class33_getShadowRoot {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"))
		.getShadowRoot().findElement(By.id("input"))
		.sendKeys("API Testing");
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("settings-ui")).sendKeys("Java Selenium");
		
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("searchInput")).sendKeys("Java Selenium");
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
	
}

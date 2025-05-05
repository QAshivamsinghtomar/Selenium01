package com.selenium.webdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class8_activeElement {
	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate search option and send data
		//driver.findElement(By.name("q")).sendKeys("API Testing");
		
		//activeElement
		driver.switchTo().activeElement().sendKeys("API Testing", Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// activeElement click
		driver.switchTo().activeElement().click();
		Thread.sleep(2000);
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}

}

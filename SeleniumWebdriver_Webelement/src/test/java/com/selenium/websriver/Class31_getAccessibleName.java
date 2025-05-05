package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// getAccessibleName() => What is the internal name of the element


public class Class31_getAccessibleName {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("q"));
		String accessabileName = element.getAccessibleName();
		
		System.out.println("Accessabile Name of that element = "+accessabileName);
		
		driver.close();
	}
	
	
	public static void m2() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("identifier"));
		String accessibleName = element.getAccessibleName();
		System.out.println("Accessible Name of that element = "+accessibleName);
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}
	
}

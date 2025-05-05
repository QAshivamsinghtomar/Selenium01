package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class32_getAriaRole {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("q"));
		String ariaRole = element.getAriaRole();
		System.out.println("Aria Role of the Element = "+ ariaRole);
		
		driver.close();
	}
	
	
	public static void m2() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.name("identifier"));
		String ariaRole = element.getAriaRole();
		System.out.println("Aria Role of that element = "+ariaRole);
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}
	
	
	
}

package com.selenium.webdriver_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class15_navigate2 {

	// performance of navigate().to() method and driver.get() method
	
	
	public static void m1() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		long startTime1 = System.currentTimeMillis();
		driver.get("https://www.amazon.in");
		long completeTime1 = System.currentTimeMillis();
		
		System.out.println("get method duration = "+(completeTime1-startTime1));
		
		System.out.println();
		
		long startTime2 = System.currentTimeMillis();
		driver.navigate().to("https://www.flipkart.com/");
		long completeTime2 = System.currentTimeMillis();
		System.out.println("navigate().to() method duration = "+(completeTime2 - startTime2));
		
		driver.close();
	}
	
	public static void main(String[] args) {
		m1();
	}
	
}

package com.selenium.webdriver_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class2_getPageSource {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.globepub.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source the Globe Pub  website = "+ pageSource);
		
		driver.close();
		
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source  ="+pageSource);
		
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
	
	
}

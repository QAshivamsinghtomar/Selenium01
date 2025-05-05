package com.selenium.webdriver_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class14_navigate {
	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// navigate().to() method
		driver.navigate().to("https://www.indianjournals.com/");
		Thread.sleep(2000);
		
		// back
		driver.navigate().back();
		Thread.sleep(2000);
		
		// forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		// refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		// back
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}

}

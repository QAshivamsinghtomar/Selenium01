package com.selenium.webdriver_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class3_getWindowHandle {

	public static void main(String[] args) throws Exception {
		 
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String windowHandle =  driver.getWindowHandle();
		System.out.println("Window id ="+windowHandle);
		
		driver.close();
	}
	
}

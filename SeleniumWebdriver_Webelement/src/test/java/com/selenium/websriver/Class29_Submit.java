package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class29_Submit {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("username")).sendKeys("java Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}


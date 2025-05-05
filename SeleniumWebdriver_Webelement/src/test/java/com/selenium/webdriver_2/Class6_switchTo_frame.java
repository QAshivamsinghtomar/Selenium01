package com.selenium.webdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class6_switchTo_frame {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// moving into frame
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		
		// Enter value into first name
		driver.findElement(By.id("fname")).sendKeys("Java");
		Thread.sleep(1000);
		
		// Enter value into last name
		driver.findElement(By.id("lname")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		// click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		// back into default frame
		driver.switchTo().defaultContent();
		
		driver.close();
	
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}

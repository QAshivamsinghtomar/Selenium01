package com.selenium.websriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class14_getScreenshot {

	public static void m1() throws  Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		 WebElement element = driver.findElement(By.xpath("//div[@class='menu']"));
		 File file = element.getScreenshotAs(OutputType.FILE);
		 File file2 = new File("C:\\Users\\shsingh\\git\\Selenium01\\SeleniumWebdriver_Webelement\\target\\1.png");
		 FileHandler.copy(file, file2);
	}
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");  
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File file = driver.findElement(By.xpath("(//input[@type='image'])[2]")).getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Java\\ECLIPSE2\\SeleniumWebdriver_Webelement\\target\\MII.png");
		FileHandler.copy(file, file2);
		
		driver.close();
		
	}
	
	
	
	
	public static void main(String[] args) throws  Exception {
		m1();
	}
	
}

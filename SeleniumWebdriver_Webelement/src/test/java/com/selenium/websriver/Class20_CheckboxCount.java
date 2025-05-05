package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class20_CheckboxCount {
	
	
	public static void m1() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// total check box count
		List<WebElement> list = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int count =  list.size();
		System.out.println("Count of check box = "+count);
		
		driver.close();
	
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int count = list.size();
		System.out.println("Total checkbox = "+count);
		
		driver.close();
	}
	

	public static void main(String[] args) throws Exception {
		m2();
	}
}

package com.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Class3_MultiSelectDropdown {
// Here multi select dropdown is developed by using div tag-- use findElement methods
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Neghibour element 
		WebElement nElement = driver.findElement(By.xpath("//div[text()='Select One']"));
				
		// scroll the page 
		driver.executeScript("arguments[0].scrollIntoView();", nElement);
		Thread.sleep(2000);
		
		// locate 'Multiselect drop down' dropdown -- 
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		Thread.sleep(2000);
		// Select Green 
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		Thread.sleep(2000);
		// Select Blue
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		Thread.sleep(2000);
		// Select Red
		driver.findElement(By.xpath("//div[text()='Red']")).click();
		Thread.sleep(2000);
		// Select Black
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		Thread.sleep(2000);
		
		
		
		

	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
	
}

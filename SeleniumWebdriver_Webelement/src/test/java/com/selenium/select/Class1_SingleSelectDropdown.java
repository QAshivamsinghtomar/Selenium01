package com.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1_SingleSelectDropdown {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement nelement =  driver.findElement(By.xpath("//div[text()='Select Value']"));
		// scroll the page
		driver.executeScript("arguments[0].scrollIntoView();", nelement);
		Thread.sleep(2000);
		
		// select drop down automate - by select class
		WebElement element2 =  driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(element2);
		Thread.sleep(2000);
		select.selectByValue("8");  // Indigo
		Thread.sleep(5000);
		select.selectByIndex(4); //Purple - index start will 0
		Thread.sleep(5000);
		select.selectByVisibleText("Black"); // Black
		Thread.sleep(5000);
		
		
		driver.close();	
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate 'Type of holiday' dropdown
		WebElement element =  driver.findElement(By.id("themes"));	
		
		// Select Class object
		Select select = new Select(element);
		
		select.selectByValue("15"); // Wildlife
		Thread.sleep(5000);
		
		select.selectByIndex(6); // Honeymoon
		Thread.sleep(5000);
		
		select.selectByVisibleText("Family");
		Thread.sleep(5000);
		
		// close website
		driver.close();
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

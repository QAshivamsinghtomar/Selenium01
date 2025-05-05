package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class1_Actions {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// locate google search box
		WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("API TESTING", Keys.ENTER);
		//Thread.sleep(5000);
		
		
		// Actions Class - sending data by actions class
		Actions action = new Actions(driver);
		//action.sendKeys("API TESTING", Keys.ENTER).perform();
		action.click(element).perform();
		
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// locate seach box in flipkart
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		
		// Actions class
		Actions action = new Actions(driver);
		action.sendKeys(element, "Toys", Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

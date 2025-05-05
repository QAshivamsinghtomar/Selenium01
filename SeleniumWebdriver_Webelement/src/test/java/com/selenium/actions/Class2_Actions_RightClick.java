package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class2_Actions_RightClick {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// search box
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		// Actions class
		Actions action = new Actions(driver);
		action.contextClick(element).perform(); // right click 
		
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
}

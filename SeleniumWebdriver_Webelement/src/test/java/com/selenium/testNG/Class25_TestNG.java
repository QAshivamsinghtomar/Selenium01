package com.selenium.testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Class25_TestNG {

	public RemoteWebDriver driver ;
	
	@Test(priority = 1)
	public void indian() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Products")).click();
		WebElement element = driver.findElement(By.linkText("Journals"));
		element.click();
		
		
		// Scrolling the page
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	
	@Test(priority = 2)
	public void indian2() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = null ;
		
		// scrolling the page
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("DIVA ENTERPRISES PVT. LTD.")).click();
		
		// multiwindow handle
		Set<String> set = driver.getWindowHandles();
		List<String> list = new  ArrayList<String>(set) ;
		
		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(list.get(0));
		Thread.sleep(5000);
		driver.close();
		
	}
		
}

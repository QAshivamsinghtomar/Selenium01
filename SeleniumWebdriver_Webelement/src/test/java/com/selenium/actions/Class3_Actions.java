package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class3_Actions {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement nelement  = driver.findElement(By.id("draggable"));
		
		// page scroll
		driver.executeScript("arguments[0].scrollIntoView();", nelement);
		Thread.sleep(2000);
		
		// locate drag me and drop here element
		WebElement element1  = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		// Actions Class
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
		Thread.sleep(5000);
		
		// close the site
		driver.close();		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/demos/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate Droppable
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(2000);
		
		// enter into frame
		driver.switchTo().frame(0);
		
		// locate drag and drop element
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		// Actions class
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2).perform();
		Thread.sleep(5000);
		
		// close site
		driver.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

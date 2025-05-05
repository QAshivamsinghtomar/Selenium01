package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Clss4_Actions_Slider {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement nelement = driver.findElement(By.xpath("//h1[text()='Slider']"));
		//scroll the page
		driver.executeScript("arguments[0].scrollIntoView();", nelement);
		Thread.sleep(2000);
		
		// locate slider
		WebElement element =  driver.findElement(By.xpath("//input[@type='range']"));
		
		// Actions class
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 95, 0).perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(element, -50, 0).perform();
		Thread.sleep(5000);
		
		//close site
		driver.close();
	
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/demos/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate slider link and click on it.
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(5000);
		
		// enter into frame
		driver.switchTo().frame(0);
		
		// locate slider
		WebElement element = driver.findElement(By.id("slider"));
		
		// Actions class
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 400, 0).perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(element, -300, 0).perform();
		Thread.sleep(5000);
		
		// close site
		driver.close();
		
		;
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

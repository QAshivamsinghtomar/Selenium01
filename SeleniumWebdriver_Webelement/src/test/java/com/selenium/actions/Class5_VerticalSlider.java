package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class5_VerticalSlider {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// enter into frame
		driver.switchTo().frame(0);
		
		//locate slider
		WebElement element = driver.findElement(By.xpath("//div[@id='slider-vertical']/span"));
		
		// Actions class
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 0, 100).perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(element, 0, -80).perform();
		Thread.sleep(5000);
		
		// close site
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		
	    RemoteWebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate "Vertical range slider" and click on it
		driver.findElement(By.linkText("Vertical range slider")).click();
		Thread.sleep(2000);
		
		// enter into frame
		driver.switchTo().frame(0);
		
		// locate slider
		WebElement element = driver.findElement(By.id("slider-range"));
		Thread.sleep(2000);
		
		// Actions class
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 80, 80).perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(element, 40, -40).perform();
		Thread.sleep(2000);
		
		// close site
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

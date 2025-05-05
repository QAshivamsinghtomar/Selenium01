package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class6_ScrollPage {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Page scroll down by using Actions class
		Actions actions = new Actions(driver);
		for(int i=1; i<10; i++) {
			actions.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		// locate inner scroll page element
		WebElement element = driver.findElement(By.xpath("(//pre[@class='lang-java s-code-block'])[1]"));
		
		// scroll element down
		for(int i=1; i<15; i++) {
			actions.sendKeys(element, Keys.ARROW_DOWN).perform();
		}
		
		Thread.sleep(3000);
		
		// element scroll up
		for(int i=1; i<15; i++) {
			actions.sendKeys(element, Keys.ARROW_UP).perform();
		}
		
		Thread.sleep(3000);
		
		// element scroll right
		for(int i=1; i<5; i++) {
			actions.sendKeys(element, Keys.ARROW_RIGHT).perform();
		}
		
		Thread.sleep(3000);
		
		// element scroll left
		for(int i=1; i<5; i++) {
			actions.sendKeys(element, Keys.ARROW_LEFT).perform();
		}
		
		Thread.sleep(2000);
		
		// close site
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
	
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// scroll the page by using Actions class
		Actions actions = new Actions(driver);
		for(int i=1; i<8; i++) {
			actions.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		Thread.sleep(2000);
		
		// scroll up
		for(int i=1; i<8; i++) {
			actions.sendKeys(Keys.ARROW_UP).perform();
		}
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}

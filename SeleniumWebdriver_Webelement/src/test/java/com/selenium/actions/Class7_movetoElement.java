package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class7_movetoElement {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate Login/Register element and click on it by using Actions class
		WebElement element1 = driver.findElement(By.linkText("Login/Register"));
		
		//Actions class
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).perform();
		Thread.sleep(2000);
		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
      Actions actions = new Actions(driver);
		
		WebElement element1 =  driver.findElement(By.linkText("Ask Question"));
		actions.moveToElement(element1).perform();
		
		Thread.sleep(3000);
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}

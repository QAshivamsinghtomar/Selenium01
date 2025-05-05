package com.selenium.waitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Class3_Wait_StaleElenent {

	public static void m1() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withTimeout(Duration.ofSeconds(20));
		
		// locate username field and send data
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));		
	    element1.sendKeys("JavaSelenium");
		
		// go to next page click on next button
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@jsname='V67aGc'])[2]/parent::button")));
		element2.click();
		
		// back into user name page
		driver.navigate().back();
		
		// check element is staled or not due to DOM change
		if(wait.until(ExpectedConditions.stalenessOf(element1))) {
			// relocate the username field
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))));
		}
		
		// clear the element1
		element1.clear();
		element1.sendKeys("APITESTING");
		
		driver.close();

	}
	
	
	public static void m2() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withTimeout(Duration.ofSeconds(20));
		
		// locate journals element and click on it.
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Activities")));
        element1.click();
        
        // back into same page
        driver.navigate().back();
        
        // check page is staled or not
        if(wait.until(ExpectedConditions.stalenessOf(element1))) {
        	//relocate the element
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.linkText("Activities")))).click();	
        }
        
        driver.close();
	}
	
	
	public static void main(String[] args) {
		m2();
	}
	
}

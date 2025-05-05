package com.selenium.waitCondition;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.* ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Class2_Wait {

	public static void m1() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000)); // interval time
		wait.withTimeout(Duration.ofSeconds(20)); // max wait time
		
		// define wait condition
		// locate google search box and click
		ExpectedCondition<WebElement> ec1 =  ExpectedConditions.elementToBeClickable(By.name("q"));
		
		// we can write same code by importing ExpectedConditions class method line No. 5
		//ExpectedCondition<WebElement> ec2 = elementToBeClickable(By.name("q"));
		
		
		// locate gmail link in google page
		ExpectedCondition<WebElement> ec3 = ExpectedConditions.elementToBeClickable(By.linkText("Gmail"));
		
		// we can write same code by importing ExpectedConditions class method line No. 5
		// ExpectedCondition<WebElement> ec4 = elementToBeClickable(By.linkText("Gmail"));
		
		wait.until(ExpectedConditions.and(ec1, ec3));
		// same code we can write this way also
		//wait.until(and(ec1, ec3));
		
		wait.until(or(ec1, ec3));
		
		driver.close();
		
	}
	
	public static void main(String[] args) {
		m1();
	}
	
	
}
